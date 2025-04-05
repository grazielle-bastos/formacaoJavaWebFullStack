package cursoJava.operacoes;

public class OpLogAninhadasSwitchCase {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*
		 * SWITCH CASE: OPERAÇÕES EXATAS
		 * TESTA VALORES DE VARIÁVEIS COM EXATIDÃO, NÃO É MALEÁVEL COMO A CONDICIONAL IF ELSE
		 */

		switch (media) {
		case 70:
			System.out.println("Aluno aprovado com a média " + media);
			break;
		
		default: System.out.println("Outro valor: " + media);
			break;
		}
		
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("\n" + "Domingo");
			break;
		case 2:
			System.out.println("\n" + "Segunda-feira");
		break;
		case 3:
			System.out.println("\n" + "Terça-feira");
			break;
		case 4:
			System.out.println("\n" + "Quarta-feira");
			break;
		case 5:
			System.out.println("\n" + "Quinta-feira");
			break;
		case 6:
			System.out.println("\n" + "Sexta-feira");
			break;
			
		default: System.out.println("\n" + "Outro dia da semana");
			break;
		
		}
		
	}

}
