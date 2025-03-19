import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Insira o primeira valor");
		String num2String = JOptionPane.showInputDialog(null, "Insira o segundo valor");
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os valores são iguais");
		} else {
			if(num1 > num2) {
				double res = num1 / num2;
				JOptionPane.showMessageDialog(null,  format.format(num1) + " / " + format.format(num2) + " = " + format.format(res));
			} else {
				 double res = num2 / num1;
				JOptionPane.showMessageDialog(null,  format.format(num2) + " / " + format.format(num1) + " = " + format.format(res));
			}
		}
	}
}
