import java.util.Scanner;

public class Principal19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número: ");
        String palavra = ler.next();

        System.out.println(meio(palavra));

        ler.close();
    }

    public static String meio(String palavra) {
        int meio = palavra.length() / 2;
    
        if (palavra.length() % 2 == 0) {
            return palavra.substring(meio - 1, meio + 1);
        } else { 
            return palavra.substring(meio, meio + 1);
        }
    }
}
