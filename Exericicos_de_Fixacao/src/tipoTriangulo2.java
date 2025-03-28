package Exericicos_de_Fixacao.src;

import javax.swing.JOptionPane;

public class tipoTriangulo2 {
    public static void main(String[] args) {
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo: "));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triângulo: "));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo: "));

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            String tipoTriangulo;
            
            if (lado1 == lado2 && lado2 == lado3) {
                tipoTriangulo = "O triângulo é equilátero.";
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                tipoTriangulo = "O triângulo é isósceles.";
            } else {
                tipoTriangulo = "O triângulo é escaleno.";
            }
            
            JOptionPane.showMessageDialog(null, tipoTriangulo);
        } else {
            JOptionPane.showMessageDialog(null, "Os valores informados não formam um triângulo.");
        }
    }
}
