

public class MainBanco {
    public static void main(String[] args) {

        ContaCorrente p = new ContaCorrente();
        p.abrirConta("Gabriel","Cc",123);
        p.pagMensal();
        p.depositar(122);
        p.sacar(1222);
        p.sacar(160);
        p.pagMensal();
        p.fecharConta();
        p.depositar(13);
        p.fecharConta();
        p.sacar(1);
        p.fecharConta();



        p.status();


        ContaCorrente p1 = new ContaCorrente();
        p1.abrirConta("junior","Cc",123);
        p1.pagMensal();
        p1.depositar(122);
        p1.sacar(1222);
        p1.sacar(160);
        p1.pagMensal();
        p1.fecharConta();
        p1.depositar(13);
        p1.fecharConta();
        p1.sacar(1);
        p1.fecharConta();

        p1.status();

    }
}
