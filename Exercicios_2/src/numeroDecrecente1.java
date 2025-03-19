package Exercicios_2.src;

import java.util.Arrays;
import java.util.Scanner;

public class numeroDecrecente1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[3]; 

        System.out.println("Insira 3 valores: ");

        for (int i = 0; i < 3; i++) {
            numeros[i] = ler.nextInt();
        }

        Arrays.sort(numeros);

        int[] numerosDecrescentes = new int[3];
        for (int i = 0; i < 3; i++) {
            numerosDecrescentes[i] = numeros[2 - i]; 
        }

        System.out.println("Números em ordem decrescente: " + Arrays.toString(numerosDecrescentes));

        ler.close();
    }
}
