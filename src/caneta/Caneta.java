package caneta;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private  boolean tampada;

    public Caneta(String m, String c, float p){ //O metodo contrutor

        this.tampar();
        this.setCor(c);
        this.setModelo(m);
        this.setPonta(p);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }


    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
