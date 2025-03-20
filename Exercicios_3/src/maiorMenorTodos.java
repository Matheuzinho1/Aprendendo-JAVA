package Exercicios_3.src;

import java.util.Scanner;

public class maiorMenorTodos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double[] array = new double[10]; 
        double maior;
        double menor;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            array[i] = ler.nextDouble(); 
        }

        if(array[0] > array[1]) {
            maior = array[0];
            menor = array[1];
        } else {
            maior = array[1];
            menor = array[0];
        }

        for(int i = 2; i < 10; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
            if(array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("----------------------");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.print("Vetor completo: ");
        for(int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(array[i] + " / ");
            } else {
                System.out.print(array[i]);
            }
        }
        
        ler.close(); 
    }
}
