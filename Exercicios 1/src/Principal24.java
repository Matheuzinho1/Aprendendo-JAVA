import java.util.Scanner;

public class Principal24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor do investimento: ");
        int valor = ler.nextInt();  
        System.out.println("Insira o valor da taxa de juros (%): ");
        double taxa = ler.nextDouble();
        taxa = taxa / 100; 
        System.out.println("Insira o tempo de investimento em meses: ");
        int tempo = ler.nextInt();
        
        System.out.println("O valor final do investimento é: " + separandoPalavras(valor, taxa, tempo));
        ler.close();
    }

    public static double separandoPalavras(int valor, double taxa, int tempo) {
        double valorFinal = valor * Math.pow(1 + taxa, tempo);
        return valorFinal;
    }
}
