package Aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //metodos

    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if(desafiado != desafiante && desafiado.getCategoria().equals(desafiante.getCategoria())){
            setAprovado(true);
            setDesafiado(desafiado);
            setDesafiante(desafiante);
        }
        else {
            setAprovado(false);
        }

    }
    public void lutar(){

        if(isAprovado()){
            System.out.println("----------------------------");
            getDesafiado().apresentar();
            System.out.println("----------------------------");
            getDesafiante().apresentar();
            System.out.println("----------------------------");
            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            if(vencedor==0){
                System.out.println("Empatou");
                getDesafiante().empatarLuta();
                getDesafiado().empatarLuta();
            }
            else if(vencedor == 1){
                System.out.println(getDesafiante().getNome()+" Venceu");
                getDesafiado().perderLuta();
                getDesafiante().ganharLuta();
            }
            else{
                System.out.println(getDesafiado().getNome()+" Venceu");
                getDesafiante().perderLuta();
                getDesafiado().ganharLuta();
            }
        }
        else {
            System.out.println("A luta não pode ocorrer...");
        }
    }


    //metodos especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador defiado) {
        this.desafiante = defiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
