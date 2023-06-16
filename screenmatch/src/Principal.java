public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderodo chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaiações: " + meuFilme.getTotalDeAvaliacoes());
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalDeAvaliacoes = 1;
//        System.out.println(meuFilme.pegaMedia());

    }
}
