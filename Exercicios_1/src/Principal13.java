import java.util.Scanner;

public class Principal13 {
    public static void main(String[] args) {
        Scanner ler5 = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        double raio = ler5.nextDouble();
        
        System.out.print("Insira o valor do altura: ");
        double altura = ler5.nextDouble();
       
        double res = 3.14159 * raio * raio * altura;
        System.out.printf("O volume do cilindro é: %.2f", res);

        ler5.close();
    }
}