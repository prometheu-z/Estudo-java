public class ContaCorrente {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Metodo construtor

    public ContaCorrente() {
        setSaldo(0f);
        setStatus(false);

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

    //Metodos personalizados

    public void abrirConta(String dono, String tipo, int numConta){
        setStatus(true);
        if(tipo.equals("Cc")){
            setSaldo(getSaldo()+50);
            setTipo(tipo);
        }
        else if (tipo.equals("Cp")){
            setSaldo(getSaldo()+150);
            setTipo(tipo);
        }
        else {
            setStatus(false);
        }

        setDono(dono);
        setNumConta(numConta);
    }
    public void fecharConta(){
        if(isStatus()){
            if(getSaldo() >0){
                System.out.println("Não posso fechar a conta, ainda há o saldo de R$:" + getSaldo());
            }
            else if(getSaldo() < 0){
                System.out.println("Não posso fechar a conta, você está com um debito de R$:"+ getSaldo());

            }
            else {
                System.out.println("Conta fechada");
                setStatus(false);
            }
        }
        else {
            System.out.println("Abra uma conta primeiro");
        }
    }
    public void depositar(float valor){
        if(isStatus()){
            setSaldo(getSaldo()+valor);
        }
    }
    public void sacar(float valor){
        if(isStatus() && getSaldo()>=valor){
            setSaldo(getSaldo()-valor);
        }
        else{
            System.out.println("Saldo de R$"+getSaldo()+" Insuficiente para saque de R$"+valor);
        }
    }
    public void pagMensal(){
        int mensalidade = 0;

        if(getTipo().equals("Cc")){
            mensalidade = 12;
        }
        else if(getTipo().equals("Cp")){
            mensalidade = 20;
        }
        if(isStatus()){
            setSaldo(getSaldo()-mensalidade);
        }
    }
    public void status(){
        System.out.println("Numero: "+getNumConta());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Dono: "+getDono());
        System.out.println("Status: "+isStatus());
        System.out.println("Saldo: "+getSaldo());

    }


}
