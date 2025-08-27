package Aula10;

public class ProjectPessoa {
    public static void main(String[] args) {

        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista b1 = new Bolsista();


        p1.setNome("Marcos");
        p2.setNome("Gabriel");
        p3.setNome("Joao");
        p4.setNome("Marcia");


        p4.setSexo("F");
        p3.setIdade(22);

        p2.setCurso("BSI");
        p3.setSalario(2500.5f);
        p4.setSetor("Caixa");
        p3.receberAumento(15);

        System.out.println(b1.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
