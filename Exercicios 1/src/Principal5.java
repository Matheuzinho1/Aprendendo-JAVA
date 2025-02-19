import java.util.Scanner;

public class Principal5 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler5.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = ler5.nextInt();

        System.out.println("A soma é: " + somar(numero, numero2));

        ler5.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
