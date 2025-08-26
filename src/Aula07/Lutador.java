package Aula07;

public class Lutador implements Partida{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrota;
    private  int empates;

    //metodos especiais e construtor


    public Lutador(int empates, int derrota, int vitorias,float peso, float altura, int idade, String nacionalidade, String nome) {
        this.empates = empates;
        this.derrota = derrota;
        this.vitorias = vitorias;
        setPeso(peso);
        this.altura = altura;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        String categoria ="";
        if(this.peso<52.2){
            categoria = "Inválida";
        }
        else if(this.peso<=70.3){
            categoria= "Leve";
        }
        else if(this.peso<=83.9){
            categoria = "Médio";
        }
        else{
            categoria = "Pesado";
        }
        this.categoria = categoria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //interface

    @Override
    public void apresentar() {
    System.out.println("Diretamente de(o) "+getNacionalidade()+" na categoria "+getCategoria()+"\npesando "+getPeso()+"Kg com "+getAltura()+" metros e apenas "+getIdade()+" anos...\n"+getNome()+String.valueOf((getNome().replace(" ", "")).charAt((getNome().replace(" ", "")).length()-1)).repeat(5));

    }

    @Override
    public void status() {
        System.out.println("-------------- "+getNome()+" ---------------");
        System.out.println("Idade: "+ getIdade());
        System.out.println("Peso: "+ getPeso());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Nacionalidade: "+ getNacionalidade());
        System.out.println("Vitorias: "+ getVitorias());
        System.out.println("Derrotas: "+ getDerrota());
        System.out.println("Empate: "+ getEmpates());

    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        setDerrota(getDerrota()+1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
}
