package Aula11;

import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.4f);
        m.setIdade(2);
        m.setMembro(4);


        m.locomover();
        m.alimentar();
        m.emitirSom();

        // p.setPeso(0.35f);
        // p.setIdade(1);
        // p.setMembro(0);
        //
        //
        // p.locomover();
        // p.alimentar();
        // p.emitirSom();
        // p.soltarBolha();
        //
        // a.setPeso(0.89f);
        // a.setIdade(2);
        // a.setMembro(2);
        //
        //
        // a.locomover();
        // a.alimentar();
        // a.emitirSom();
        // a.construirNinho();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        c.setPeso(55f);
        c.setIdade(3);
        c.setMembro(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(3f);
        k.setIdade(5);
        k.setMembro(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();



    }
}
