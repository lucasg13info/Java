public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");

        }else{
            System.out.println("Lançamento antigo");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Incuso no plano");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
