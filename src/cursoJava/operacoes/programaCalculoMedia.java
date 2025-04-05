package cursoJava.operacoes;

import javax.swing.JOptionPane;

public class programaCalculoMedia {
	
	public static void main(String[] args) {
		
		String snota1 = JOptionPane.showInputDialog("Insira a nota 1: ");
		String snota2 = JOptionPane.showInputDialog("Insira a nota 2: ");
		String snota3 = JOptionPane.showInputDialog("Insira a nota 3: ");
		String snota4 = JOptionPane.showInputDialog("Insira a nota 4: ");
		
		double nota1 = Double.parseDouble(snota1);
		double nota2 = Double.parseDouble(snota2);
		double nota3 = Double.parseDouble(snota3);
		double nota4 = Double.parseDouble(snota4);
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Média para aprovação é 70*/
		
		if (media >= 5) {
			if (media >= 7) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você foi aprovado.\nResultado da média: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Poxa, é necessário se preparar mais. Você está em recuperação.\nResultado da média: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Poxa, é necessário se preparar mais. Você está em recuperação.\nResultado da média: " + media);
		}
		
		/*Sistema dinâmico - Dar entrada de dados, processar e obter o resultado final */
		
	}

}
