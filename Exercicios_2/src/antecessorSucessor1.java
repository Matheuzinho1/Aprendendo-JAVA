package Exercicios_2.src;

import java.util.Scanner;

public class antecessorSucessor1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = ler.nextInt();

        int sucessor = num + 1;
        int antecessor = num - 1;

        System.out.println("O sucessor de " + num + " é " + sucessor + " e o antecessor é " + antecessor);
        
        ler.close();
    }
}
