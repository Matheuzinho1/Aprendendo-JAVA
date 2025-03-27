    package Exercicios_3.src;

    import java.util.Scanner;

    public class segundoMaior2 {
        public static void main(String[] args) {
            int array[] = new int[5];
            int maior = array[0];
            int sMaior = array[1];

            Scanner ler = new Scanner(System.in);
            System.out.println("Insira um valor: ");

            for(int i = 0 ; i < 5; i++) {
                array[i] = ler.nextInt();
            }

            if (array[0] > array[1]) {
                maior = array[0];
                sMaior = array[1];
            } else {
                maior = array[1];
                sMaior = array[0];
            }

            for(int i = 2; i < 5; i++) {
                if(array[i] > maior) {
                    sMaior = maior;
                    maior = array[i];
                } else if(array[i] > sMaior) {
                    sMaior = array[i];
                }
            }

            System.out.println(sMaior);
        }
    }

