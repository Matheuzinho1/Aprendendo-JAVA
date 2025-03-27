package Exercicios_3.src;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.*;

public class areaHexagono1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Olá, insira o lado do hexagono: "));
        double res = ((3 * Math.sqrt(3)) / 2) * Math.pow(num1, 2);
        JOptionPane.showMessageDialog(null, format.format(res));
    }
}
