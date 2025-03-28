package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class soma5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = ler.nextInt();
        System.out.print("Insira o terceiro número: ");
        int num3 = ler.nextInt();

        double resultado = soma(num1, num2, num3);
        System.out.println("Resultado da soma: " + resultado);

        ler.close();
    }

    public static double soma(double a, double b, double c) {
        double soma = a + b;
        
        if (c > soma) {
            System.out.println("O terceiro número é maior que a soma dos dois primeiros.");
        } else {
            System.out.println("O terceiro número não é maior que a soma dos dois primeiros.");
        }
        
        return soma; 
    }
}
