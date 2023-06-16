package br.com.alura.screenmatch.modelos;

//Classe filme
//Atributos do filme - é a estrutura
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}