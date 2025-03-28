package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class peso1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            condicao = "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            condicao = "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            condicao = "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            condicao = "Obesidade grau II (severa)";
        } else {
            condicao = "Obesidade grau III (mórbida)";
        }

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + condicao);

        scanner.close();
    }
}
