package Exericicos_de_Fixacao.src;

import javax.swing.*;

public class delta1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Insira o valor de A");
        String b = JOptionPane.showInputDialog("Insira o valor de B");
        String c = JOptionPane.showInputDialog("Insira o valor de C");

        double aConvertido = Double.parseDouble(a);
        double bConvertido = Double.parseDouble(b);
        double cConvertido = Double.parseDouble(c);

        double res = Math.pow(bConvertido, 2) - 4 * aConvertido * cConvertido;

        JOptionPane.showMessageDialog(null, res);
    }
}
