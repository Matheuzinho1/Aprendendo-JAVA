import java.util.Scanner;

public class Exercicio5 {
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
