import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        if(idade >= 18){
            System.out.println("Olá " + nome + ", você é maior de idade.");
        }else{
            System.out.println("Olá " + nome + ", você é menor de idade.");
        }

        ler.close();
    }
}
