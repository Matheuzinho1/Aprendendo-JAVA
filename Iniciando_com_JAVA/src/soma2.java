package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class soma2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = ler.nextInt();

        System.out.println("A soma é: " + somar(numero, numero2));

        ler.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
