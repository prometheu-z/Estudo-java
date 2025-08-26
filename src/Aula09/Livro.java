package Aula09;

import java.util.Random;

public class Livro implements Publicacao{
    String titulo;
    String autor;
    int totPaginas;
    int pagAtual;
    boolean aberto;
    Pessoa leitor;

    //metodos

    public void detalhes(){
        System.out.println("-------------------");
        System.out.println("Autor: "+ getAutor());
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Leitor: "+getLeitor().nome);
        System.out.println("Pagina atual: "+getPagAtual());
        System.out.println("-------------------");
    }

    //cponstrutor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setPagAtual(0);
        setAberto(false);
        setLeitor(leitor);
    }


    //metodos especiais


    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    //interface


    @Override
    public void abrir() {
        if(!isAberto()){
            setAberto(true);
            System.out.println(getLeitor().getNome()+" está lendo " + getTitulo());
            System.out.println("Ultima pagina lida: "+getPagAtual());
        }
        else {
            System.out.println("O livro ja esta aberto");
        }
    }

    @Override
    public void fechar() {
        if(isAberto()){
            System.out.println(getLeitor().getNome()+" fechou o livro "+getTitulo()+" na pagina " +getPagAtual());
            setAberto(false);
        }
        else {
            System.out.println("O livro ja esta fechado");
        }
    }

    @Override
    public void folhear() {
        if(isAberto()){
            Random aleatory = new Random();
            int ale = aleatory.nextInt(getTotPaginas());
            setPagAtual(ale);
            System.out.println("voce parou na pagina "+ getPagAtual());

        }
        else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void avancarPag() {
        if(isAberto()){
            setPagAtual(getPagAtual()+1);
            System.out.println("voce esta na pagina "+getPagAtual());
        }
        else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()){
            setPagAtual(getPagAtual()-1);
            System.out.println("Voce esta na pagina "+getPagAtual());
        }
        else {
            System.out.println("Abra o livro primeiro");
        }

    }


}
