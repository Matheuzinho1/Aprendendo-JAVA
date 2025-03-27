package Exercicios_3.src;

import javax.swing.JOptionPane;

public class segundoMaior1 {
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Insira a primeira nota");
		String num2String = JOptionPane.showInputDialog(null, "Insira a segundo nota");
		String num3String = JOptionPane.showInputDialog(null, "Insira a terceiro nota");
		String num4String = JOptionPane.showInputDialog(null, "Insira a quarta nota");
		String num5String = JOptionPane.showInputDialog(null, "Insira a quinta nota");
		
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		double num3 = Double.parseDouble(num3String);
		double num4 = Double.parseDouble(num4String);
		double num5 = Double.parseDouble(num5String);
		double maior = 0;
		double segundoMaior = 0;

		if (num1 == num2 && num1 == num3 && num1 == num4 && num1 == num5) {
			JOptionPane.showMessageDialog(null, "Os cinco valores são iguais");
		} else {
			
			if(num1 > num2) {
				segundoMaior = num2;
				maior = num1;
			} else {
				segundoMaior = num1;
				maior = num2;
			}
			
			if(num3 > maior) {
				segundoMaior = maior;
				maior = num3;
			} else if (num3 > segundoMaior) {
				segundoMaior = num3;
			} 
			
			if(num4 > maior) {
				segundoMaior = maior;
				maior = num4;
			} else if (num4 > segundoMaior) {
				segundoMaior = num4;
			}
			
			if(num5 > maior) {
				segundoMaior = maior;
				maior = num5;
			} else if (num5 > segundoMaior) {
				segundoMaior = num5;
			}
			
			JOptionPane.showMessageDialog(null, "A segunda maior é " + segundoMaior);
		}
	}
}
