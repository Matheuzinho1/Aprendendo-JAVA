import java.util.Scanner;

public class Principal6 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler5.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler5.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = ler5.nextInt();

        System.out.println("A soma é: " + somar(numero, numero2, numero3));

        ler5.close();
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}
