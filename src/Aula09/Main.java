package Aula09;

public class Main {
    public static void main(String[] args) {

        Pessoa p[] = new Pessoa[4];
        p[0] = new Pessoa("Gabriel","Masculino", 18);

        Livro l[] = new Livro[3];

        p[0].fazerAniversario();
        l[0] = new Livro("FME", "Carlinhos Maia",220, p[0]);
        l[0].abrir();
        l[0].folhear();
        l[0].avancarPag();
        l[0].fechar();
        l[0].detalhes();
    }
}
