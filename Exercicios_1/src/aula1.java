package Exercicios_1.src;

import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        //---------------------------------
        int num1 = 1;
        double num2 = 2.73;
        double res = num1 + num2; 
        /* String nome = "Matheus";
        boolean aberto = true; */
        
        //---------------------------------
        // Operadores aritm�ticos e l�gicos
        /*
        +  Soma
        -  Subtra��o
        *  Multiplica��o
        /  Divis�o
        %  M�dulo
        ++ Incrementa��o
        -- Decrementa��o
        == Igual
        <= Menor ou igual
        >= Maior ou igual
        != Diferente
        >  Maior
        <  Menor
        !  N�o
        && E
        || Ou
        */
        //---------------------------------
        if (num1 >= num2) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        //---------------------------------
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //---------------------------------
        System.out.println(res);

        //---------------------------------
        Scanner ler = new Scanner(System.in);
        System.out.print("\nInsira sua idade: ");
        int idade = ler.nextInt();
        System.out.println("A idade inserida �: " + idade);
        ler.close();
    }
}
