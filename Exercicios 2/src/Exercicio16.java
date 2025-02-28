import java.util.Scanner;

public class Exercicios16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor do primeiro lado do triângulo: ");
        double lado1 = ler.nextInt();
        System.out.println("Digite o segundo valor do primeiro lado do triângulo: ");
        double lado2 = ler.nextInt();
        System.out.println("Digite o terceiro valor do primeiro lado do triângulo: ");
        double lado3 = ler.nextInt();

        double res = lado1 + lado2;

        if(res > lado3){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("O triângulo é equilátero.");
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("O triângulo é isósceles.");
            }else{
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

    ler.close();
    }
}
