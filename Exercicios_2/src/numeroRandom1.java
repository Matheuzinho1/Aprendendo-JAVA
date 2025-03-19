package Exercicios_2.src;

import java.util.Random;

public class numeroRandom1 {

    public static void main(String[] args) {

        Random gerador = new Random();
        
        System.out.println(gerador.nextInt(101));
    }
}