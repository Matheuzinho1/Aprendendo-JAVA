import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner ler3 = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int valor1 = ler3.nextInt();
        System.out.print("Insira o segundo valor: ");
        int valor2 = ler3.nextInt();
        System.out.print("Insira o que deseja fazer com o valor (+, -, *, /): ");
        String operacao = ler3.next();

        switch (operacao) {
            case "+":
                valor1 += valor2;
                break;
            case "-":
                valor1 -= valor2;
                break;
            case "*":
                valor1 *= valor2;
                break;
            case "/":
                valor1 /= valor2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println("O resultado é: " + valor1);
        ler3.close();
    }
}   
