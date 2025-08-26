package Aula09;

public class Pessoa {
    String nome;
    int idade;
    String sexo;

    //metodos

    void fazerAniversario(){
        setIdade(getIdade()+1);
        System.out.println("Parabens "+getNome()+"\nFeliz "+getIdade()+" anos de vida");
    }

    //constuctor

    public Pessoa(String nome, String sexo, int idade) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }


    //metodos especiais

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
