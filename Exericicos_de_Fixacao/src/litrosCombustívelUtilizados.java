package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class litrosCombustívelUtilizados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double consumoCarro = 12.0;
        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double litrosCombustivel = distanciaPercorrida / consumoCarro;

        System.out.printf("Distância percorrida: %.2f km%n", distanciaPercorrida);
        System.out.printf("Quantidade de litros de combustível utilizados: %.2f litros%n", litrosCombustivel);

        scanner.close();
    }
}