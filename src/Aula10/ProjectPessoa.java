package Aula10;

public class ProjectPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();


        p1.setNome("Pedro");
        p2.setNome("Gabriel");
        p3.setNome("JOao");
        p4.setNome("Marcia");


        p1.setSexo("M");
        p4.setSexo("F");
        p3.setIdade(22);

        p2.setCurso("BSI");
        p3.setSalario(2500.5f);
        p4.setSetor("Caixa");
        p3.receberAumento(15);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
