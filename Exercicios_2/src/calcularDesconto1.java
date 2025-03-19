package Exercicios_2.src;

import java.util.Scanner;

public class calcularDesconto1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double valorCompra = ler.nextDouble();
        System.out.println("Digite o metodo de pagamento (1 - Dinheiro ou pix, 2 - Cartão de crédito, 3 - Parcelado em 2X, 4 - Parcelado em 3X ou mais): ");
        int metodoPagamento = ler.nextInt();

        double valorFinal = calcularDesconto(valorCompra, metodoPagamento);
        
        System.out.println("O valor final da compra é: " + valorFinal);

        ler.close();
    }

    public static double calcularDesconto(double num1, int num2) {
        double desconto;
        double acrescimo;

        switch (num2) {
            case 1:
                desconto = num1 * 0.15;
                return num1 - desconto;
            case 2:
                desconto = num1 * 0.10;
                return num1 - desconto;
            case 3:
                return num1; 
            case 4:
                acrescimo = num1 * 0.10;
                return num1 + acrescimo;
            default:
                System.out.println("Método de pagamento inválido.");
                return num1; 
        }
    }
}
