package Exericicos_de_Fixacao.src;

import java.util.Scanner;

public class quantidadeSalariosMinimos1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int salarioMinimo = 1293, contador = 0;

        System.out.println("Digite o seu salário: ");
        double salario = ler.nextDouble();

        while (salario > salarioMinimo) {
            salario = salario - salarioMinimo;
            contador++;
        }
        System.out.println("Você recebe " + contador + " salários mínimos.");
        ler.close();
    }
}
