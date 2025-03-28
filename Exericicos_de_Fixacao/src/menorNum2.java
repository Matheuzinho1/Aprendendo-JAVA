package Exericicos_de_Fixacao.src;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class menorNum2 {
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Insira o primeira preço");
		String num2String = JOptionPane.showInputDialog(null, "Insira o segundo preço");
		String num3String = JOptionPane.showInputDialog(null, "Insira o terceiro preço");
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		double num3 = Double.parseDouble(num3String);
		
		if(num1 == num2 && num2 == num3) {
			JOptionPane.showMessageDialog(null, "Os valores três são iguais");
		} else {
			if(num1 < num2 && num1 < num3) {
				JOptionPane.showMessageDialog(null, "Primeiro valor é o menor (" + format.format(num1) + ")");
			} else if (num2 < num1 && num2 < num3) {
				JOptionPane.showMessageDialog(null, "Segundo valor é o menor (" + format.format(num2) + ")");
			} else {
				JOptionPane.showMessageDialog(null, "Terceiro valor é o menor (" + format.format(num3) + ")");
			}
		}
	}
}
