//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Preto";
        c1.carga = 12;
        c1.setPonta(0.5f);
        c1.tampar();
        c1.status();
    }
}