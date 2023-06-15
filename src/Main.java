public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        int idade = 2023;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;

        System.out.println("Ano de lançamento: " + ano + ", idade: " + idade);

        String sinopse = """
                       Filme de aventura com galâ dos anos 80.
                       Lancado em 1980 
                        """;


        System.out.println(media);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);



    }
}