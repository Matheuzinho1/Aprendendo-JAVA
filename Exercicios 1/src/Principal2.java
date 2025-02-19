import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		Scanner ler2 = new Scanner(System.in);

		System.out.print("Insira o primeiro valor: ");
		int valor1 = ler2.nextInt();
		System.out.print("Insira o segundo valor:");
		int valor2 = ler2.nextInt();

		System.out.println("A soma dos valores é " + (valor1 + valor2));

		ler2.close();
	}
}
