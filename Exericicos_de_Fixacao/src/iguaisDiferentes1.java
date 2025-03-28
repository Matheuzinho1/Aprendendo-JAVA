package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class iguaisDiferentes1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira um número:");
        int num = ler.nextInt();
        System.out.println("Insira outro número:");
        int num2 = ler.nextInt();

        int resultado = iguais(num, num2);
        System.out.println("Resultado: " + resultado);

        ler.close();
    }

    public static int iguais(int num, int num2) {
        if (num == num2) {
            System.out.println("Os números são iguais, portanto, eu somei eles.");
            return num + num2;
        } else {
            System.out.println("Os números são diferentes, portanto, eu multipliquei eles.");
            return num * num2;
        }
    }
}
