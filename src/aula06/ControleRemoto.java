package aula06;

public class ControleRemoto implements Controlador {


    private int volume;
    private boolean ligado;
    private boolean tocando;



    //metodos especiais


    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos abstrados com interface

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado: "+isLigado());
        System.out.println("Está tocando: "+isTocando());
        System.out.print("Volume: ");
        for (int i = 1; i <= 100; i+=10){
            if(i<getVolume()){
                System.out.print("|");
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println("  "+getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()){
            setVolume(getVolume()+10);
        }
        System.out.print("Volume: ");
        for (int i = 1; i <= 100; i+=10){
            if(i<getVolume()){
                System.out.print("|");
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println("  "+getVolume());
    }

    @Override
    public void menosVolume() {

        if(isLigado()){
            setVolume(getVolume()-10);
        }
        System.out.print("Volume: ");
        for (int i = 1; i <= 100; i+=10){
            if(i<getVolume()){
                System.out.print("|");
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println("  "+getVolume());
    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()){
            setTocando(false);
        }
    }
}
