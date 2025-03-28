package Exericicos_de_Fixacao.src;

import java.text.DecimalFormat;
import javax.swing.*;

public class areaPoligono1 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.##");

        double lado = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de lados: "));
        double comprimentoLado = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do lado: "));

        double angle = 3.14 / lado;
        double cot = 1 / Math.tan(angle);

        double res = ((lado * Math.pow(comprimentoLado, 2)) / 4) * cot;

        JOptionPane.showMessageDialog(null, format.format(res));

    }
}
