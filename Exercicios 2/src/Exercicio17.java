public class Exercicio17 {

    public static void main(String[] args) {
        double alturaFrancisco = 1.50;  
        double alturaSara = 1.10;     
        double crescimentoFrancisco = 0.02;  
        double crescimentoSara = 0.03;    
        int anos = 0;

        while (alturaFrancisco <= alturaSara) {
            alturaFrancisco += crescimentoFrancisco;
            alturaSara += crescimentoSara;
            anos++;
        }

        System.out.println("Será necessário " + anos + " anos para que Francisco seja maior que Sara.");
    }
}
