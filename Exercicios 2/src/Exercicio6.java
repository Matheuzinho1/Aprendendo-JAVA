import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double num1 = ler.nextInt();

        double aumento = num1 * 0.05;
        num1 = num1 + aumento;

        System.out.println("O valor do seu aumento é: " + num1);

        ler.close();
    }
}
