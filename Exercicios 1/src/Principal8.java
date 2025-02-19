import java.util.Scanner;

public class Principal8 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = ler5.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = ler5.nextInt();

        System.out.println("O resultado da divisão é: " + dividir(numero, numero2));

        ler5.close();
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
