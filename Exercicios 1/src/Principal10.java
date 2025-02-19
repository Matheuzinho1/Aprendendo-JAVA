import java.util.Scanner;

public class Principal10 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Digite lado do quadrado: ");
        int numero = ler5.nextInt();

        System.out.println("A média é: " + areaQuadrado(numero));

        ler5.close();
    }

    public static int areaQuadrado(int a) {
        int res = a * a;
        return res;
    }
}
