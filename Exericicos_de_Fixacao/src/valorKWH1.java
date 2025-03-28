package Exericicos_de_Fixacao.src;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class valorKWH1 {
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Insira o valor em KWH gasto");
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		double num1 = Double.parseDouble(num1String);
		
		if(num1 <= 100 && num1 >= 1) {
			double res = num1 * 0.75;
			JOptionPane.showMessageDialog(null, "Como a quantidade em KWH inserida é menor que 100, a tarifa será menor. O valor será de " + format.format(res));
		} else {
			double res = num1 * 1.05;
			JOptionPane.showMessageDialog(null, "Como a quantidade em KWH inserida é maior que 100, a tarifa será maior. O valor será de " + format.format(res));
		}
	}
}
