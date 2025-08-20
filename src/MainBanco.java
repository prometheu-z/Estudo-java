import java.util.Locale;
import java.util.Scanner;

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


    }
}
