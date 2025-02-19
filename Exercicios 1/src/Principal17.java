import java.util.Scanner;

public class Principal17 {
    public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                System.out.println("Converter minutos em anos");
                System.out.println("Insira a quantidade de minutos que deseja converter: ");
                int minutos = ler.nextInt();
                int anos = minutos / 525600;
                System.out.println(minutos + " minutos equivalem a " + anos + " anos.");
        }
}
