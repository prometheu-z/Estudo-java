package caneta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caneta c1 =  new Caneta("NIC", "Amarelo", 0.4f);
        Caneta c2 = new Caneta("KK", "Preta", 1.5f);



        c2.status();
        c1.status();


    }
}