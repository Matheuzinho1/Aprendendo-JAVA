package Exercicios_2.src;

import java.util.Scanner;

public class farenheit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número valor em farenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("O valor em celsius é: " + celsius);

        sc.close();
    }
}
