package Aula11;

public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    //sobrecarga

    public void reagir(String frase){
        if(frase.equals("olá")){
            System.out.println("Abanar o rabo");
        }
        else {
            System.out.println("rosnando");
        }
    }
    public void reagir(int hora){

        if(hora<12){
            System.out.println("Abanando o rabo");
        }
        else if (hora>=18) {
            System.out.println("ignorando");
        }
        else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar e latir");
        }
        else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("abanar");
            }
            else {
                System.out.println("Latir");
            }
        }
        else {
            if(peso<10){
                System.out.println("Rosnar");
            }
            else {
                System.out.println("ignorar");
            }
        }
    }
}
