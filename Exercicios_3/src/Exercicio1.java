import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio1 {
	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null, "Insira o primeira altura");
		String num2String = JOptionPane.showInputDialog(null, "Insira o segundo altura");
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os valores são iguais");
		} else {
			if(num1 > num2) {
				JOptionPane.showMessageDialog(null, "O valor da primeiro altura (" + format.format(num1) + ") é maior que a segunda altura (" + format.format(num2) + ")");
			} else {
				JOptionPane.showMessageDialog(null, "O valor da segunda altura (" + format.format(num2) + ") é maior que o primeiro altura (" + format.format(num1) + ")");
			}
		}
	}
}
