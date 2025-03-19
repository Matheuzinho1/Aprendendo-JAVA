package Exercicios_2.src;

import java.util.Scanner;

public class divisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        if (B == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            int quociente = A / B;
            int resto = A % B;

           System.out.println("O resutado da divisão é: " + quociente + " e o resto é: " + resto);
        }

        scanner.close();
    }
}