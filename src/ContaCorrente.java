public class ContaCorrente {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Metodo construtor

    public ContaCorrente() {
        this.saldo = 0f;
        this.status = false;

    }

    //Metodos getters de setters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    //Metodos de ação

    public void abrirConta(String dono, String tipo, int numConta){
        this.status = true;
        if(tipo.equals("Cc")){
            this.saldo += 50;
        }
        else if (tipo.equals("Cp")){
            this.saldo += 150;
        }
        else {
            this.status = false;
        }
        this.numConta = numConta;
    }
    public void fecharConta(){
        if(this.status){
            if(this.saldo >0){
                System.out.println("Ainda há o saldo de R$:" + this.saldo);
            }
            else if(this.saldo < 0){
                System.out.println("Você está om um debito de R$:"+ this.saldo);

            }
            else {
                System.out.println("Conta fechada");
                this.status = false;
            }
        }
        else {
            System.out.println("Abra uma conta primeiro");
        }
    }
    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
        }
    }
    public void sacar(float valor){
        if(this.status && this.saldo>=valor){
            this.saldo -= valor;
        }
    }
    public void pagMensal(){
        int mensalidade = 0;

        if(this.tipo.equals("Cc")){
            mensalidade = 12;
        }
        else if(this.tipo.equals("Cp")){
            mensalidade = 20;
        }
        if(this.status){
            this.saldo -= mensalidade;
        }
    }


}
