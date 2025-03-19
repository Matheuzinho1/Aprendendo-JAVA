import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da primaira nota:");
        double nota1 = ler.nextDouble();
        System.out.println("Digite o valor da segunda nota:");
        double nota2 = ler.nextDouble();
        System.out.println("Digite o valor da terceira nota:");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é: " + media);

        ler.close();
    }
}