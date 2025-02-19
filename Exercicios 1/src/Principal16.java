import java.util.Scanner;

public class Principal16 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Insira o valor de largura: ");
        double largura = ler5.nextDouble();
        System.out.print("Insira o valor de comprimento: ");
        double comprimento = ler5.nextDouble();

        double areaSala = largura * comprimento;
        double lajota = 0.3 * 0.3;
        double res = areaSala / lajota;
        System.out.printf("A quantidade de lajotas necessárias é: %.2f\n", res);

    ler5.close();
}}