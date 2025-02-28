import java.util.Scanner;

public class Exercicio11{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da primaira nota:");
        double nota1 = ler.nextDouble();
        System.out.println("Digite o valor da segunda nota:");
        double nota2 = ler.nextDouble();
        System.out.println("Digite o valor da terceira nota:");
        double nota3 = ler.nextDouble();
        System.out.println("Digite o valor da quarta nota:");
        double nota4 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        ler.close();
    }
}