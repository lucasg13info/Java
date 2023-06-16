//Classe filme
//Atributos do filme - é a estrutura
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;



    //Métodos - quando a função está dentro da classe chamamos de método.
    //Metodo "getTotalDeAvaliacoes" serve apenas para passar os dados para a classe principal
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    void exibeFichaTecnica (){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}