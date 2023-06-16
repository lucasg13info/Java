//Classe filme
//Atributos do filme - é a estrutura
public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;



    //Métodos - quando a função está dentro da classe chamamos de método.
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