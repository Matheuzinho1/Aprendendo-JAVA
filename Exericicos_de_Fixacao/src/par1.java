package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class par1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        int num = ler.nextInt();

        System.out.println(par(num));

        ler.close();
    }
    public static int par(int num) {
        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        return num;
    }
}