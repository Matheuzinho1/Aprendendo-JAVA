package Exercicios_2.src;

import java.util.Scanner;

public class valorAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("O valor de A é: " + b);
        System.out.println("O valor de B é: " + a);

        sc.close();
    }
}
