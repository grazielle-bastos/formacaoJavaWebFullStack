package cursoJava.entradaDados;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		/*Opção de entrada de dados*/
		String carros =  JOptionPane.showInputDialog("Informe a quantidade de carros");
		
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros); /*converte de tipo string para o tipo de numero*/
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		/*O cálculo é executado, e depois convertido de real para  inteiro*/
		
		double resto = carroNumero % pessoaNumero;
		
		System.out.println("--- [OUTPUT] OPÇÃO DE SAÍDA DE DADOS --- \n");
		
		/*Opção de saída de dados*/		
		System.out.println("A divisão de " + carros + " carro(s) para " + pessoas + " pessoa(s), resultou em " + divisao
				+ " carros, e sobrou " + resto + " carro(s)"); /*Exibição da mensagem via console*/
		
/*		JOptionPane.showMessageDialog(null, "A divisão de " + carros + " carro(s) para " + pessoas + " pessoa(s), resultou em "  + divisao + " carros, e sobrou " + resto + " carro(s)");*/ /*Exibiçao da mensagem via caixa de diálogo*/
		
		/*--------------------------------------*/
		
		System.out.println("\n --- OPÇÃO COM CAIXA DE CONFIRMAÇÃO --- \n");
		
		JOptionPane.showMessageDialog(null, "A divisão de " + carros + " carro(s) para " + pessoas + " pessoa(s), resultou em "  + divisao + " carros, e sobrou " + resto + " carro(s)");
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		/*CTRL + Botão direito no Método de diálogo, verificando retorno de valores */
		
		if (resposta == 0) {
			System.out.println("O resultado da divisão resultou em " + divisao + " carro(s)");
			JOptionPane.showMessageDialog(null, "O resultado da divisão resultou em "  + divisao + " carro(s)\n");
		} else {
			System.out.println("Não desejou ver o resultado\n");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			System.out.println("A sobra resultou em " + resto + " carro(s)\n");
			JOptionPane.showMessageDialog(null, "A sobra resultou em " + resto + " carro(s)");
		} else {
				System.out.println("Não desejou ver o resultado");
			}
		}

}
