package Exercicios_3.src;

import javax.swing.*;

public class contarCaracter1 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Insira uma frase");

        count(frase);
    }

    public static void count(String x) {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            }
            else if (Character.isDigit(ch[i])) {
                num++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
            else {
                other++;
            }
        }

        JOptionPane.showMessageDialog(null, "Letras: " + letter + " / " + "Espaços: " + space + " / " + "Numeros: " + num + " / " + "Outros:" + other);
    }
}