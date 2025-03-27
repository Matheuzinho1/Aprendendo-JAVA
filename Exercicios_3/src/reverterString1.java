package Exercicios_3.src;

import javax.swing.JOptionPane;

public class reverterString1 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Insira uma frase: ");
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        JOptionPane.showMessageDialog(null, fraseInvertida);

    }
}
