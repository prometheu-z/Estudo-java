package Aula07;

public class Main {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];
        l[0] = new Lutador(3,2,11,68.9f,1.89f,31,"Brasil","Pretty boy");
        l[1] = new Lutador(3,2,14,57.8f,1.65f,35,"EUA", "Putscript");
        l[2] = new Lutador(5,1,3,120.5f,2.01f,29,"Alemanha", "Kraken");
        l[3] = new Lutador(2,3,7,72.3f,1.75f,27,"Japão", "Shinobi");
        l[4] = new Lutador(4,0,10,83.0f,1.80f,33,"México", "El Fuego");
        l[5] = new Lutador(1,4,6,66.4f,1.70f,22,"Nigéria", "Pantera Negra");



        Luta uec = new Luta();
        uec.marcarLuta(l[0], l[1]);
        uec.lutar();

        l[0].status();
        l[1].status();

    }
}
