package Iniciando_com_JAVA.src;

import java.util.Scanner;

public class converterMin {
    public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                System.out.println("Converter minutos em anos");
                System.out.println("Insira a quantidade de minutos que deseja converter: ");
                double minutos = ler.nextInt();
                double anos = minutos / 525600;
                System.out.printf("A quantidade %.2f de minutos convertidos em anos é: %.2f", minutos, anos);
                ler.close();
        }
}
