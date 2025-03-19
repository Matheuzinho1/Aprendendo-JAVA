import java.util.Scanner;

public class salarioLiquido1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHoraAula = scanner.nextDouble();
        System.out.print("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = scanner.nextInt();
        System.out.print("Digite o percentual de desconto do INSS (em %): ");
        double percentualINSS = scanner.nextDouble();

        double salarioBruto = valorHoraAula * numeroAulas;
        double descontoINSS = salarioBruto * (percentualINSS / 100);
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}