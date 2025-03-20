import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {

        /*
        -- Casting implícito ==
        long typeLong = 20_000_000_000L;
        double typeDouble = 20_000_000_000D;
        int binario = 0b1010;
        int hexadecimal = 0x12AF;
        int octal = 0444;

        System.out.println(typeLong);
        System.out.println(typeDouble);
        System.out.println("Tipo de binario: " + ((Object)binario).getClass());
        System.out.println(hexadecimal);
        System.out.println(octal);

        -- Casting explícito --
        double typeDouble2 = 512.521;
        int typeInt = (int) typeDouble2;
        System.out.println(typeInt);

        long typeLong2 = 3000000000000000L;
        int typeInt2 = (int) typeLong2;
        System.out.println(typeInt2);

        -- Input Keyboard --
        long typeLong3 = 10;
        int typeInt3 = (int) typeLong3;
        System.out.println(typeInt3);

        Scanner ler = new Scanner(System.in);

        System.out.println("Texto 1: ");
        String text1 = ler.nextLine();
        System.out.println("Texto 2: ");
        String text2 = ler.nextLine();

        System.out.println(text1 + text2);

        -- Text block --
        System.out.println("Olá\n Tudo\n  bem?");

        String TBlock = """
                        Olá,
                            tudo
                                bem""";
        System.out.println(TBlock);

        -- String --
        String word1 = "abc";
        String word2 = "FFF";
        String word3 = word1 + word2;
        word3 = word3.toUpperCase();

        System.out.println(word3);

        -- CHAR --
        char letra = 'a';
        int numberLetra = letra;
        System.out.println(numberLetra);
        char numberLetra2 = 'a' + 2;
        System.out.println(numberLetra2);
        */

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
