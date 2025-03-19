package Exercicios_3.src;

import java.util.Scanner;

public class maiorMenorTodos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double[] array = new double[10]; 
        double maior;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            array[i] = ler.nextDouble(); 
        }

        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < i; i++) {
        		if(array[i] > array[j]) {
        			maior = array[i];
        			
        		}
        	}
        }
        
        ler.close(); 
    }
}
