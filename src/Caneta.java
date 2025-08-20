public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = false;


    public Caneta(String modelo, String cor, float ponta) {
        this.carga = 100;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void status(){
        System.out.println("uma caneta de cor "+getCor());
        System.out.println("modelo: "+ getModelo());
        System.out.println("ponta "+ getPonta());
        System.out.println("carga "+ getCarga());
        System.out.println("está tampada? "+isTampada());
    }

    public void tampar(){
        setTampada(true);
    }
    public void destampar(){
        setTampada(false);
    }
    public  void rabiscar(){
        if(!isTampada()){
        System.out.println("Estou rabiscando");
        }
        else {
            System.out.println("Estou tampada");
        }

    }
}
