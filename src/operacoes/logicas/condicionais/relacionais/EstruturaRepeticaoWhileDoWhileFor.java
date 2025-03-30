package operacoes.logicas.condicionais.relacionais;

public class EstruturaRepeticaoWhileDoWhileFor {
	
	public static void main(String[] args) {
		
		/*
		 * Estrutura de repetição While - Sempre repete a execução enquanto a condição estiver verdadeira
		*/
		
		/*
		 * Testar o incremento, adicionando o breakpoint no inicio do while, e rodar debug pressionando f6 e verificando os valores da variável numero sendo alteradas
		 */
		
		/* 
		 * While verifica, e depois executa 
		 * Utilizado quando não se sabe o número de repetições. 
		*/
		
		System.out.println("LOOPS - Executados enquanto a condição for verdadeira" + "\n\n" + "--- While ---" + "\n");
		
		int numero = 0;
		
		while (numero <= 3) {
			
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		/*--------------------------------------*/
		
		/*
		 * Do While primeiro executa, e depois verifica.
		 * Utilizado quando não se sabe o número de repetições.
		*/
		
		System.out.println("\n\n" + "--- Do While ---" + "\n");
		
		int numero1 = 0;
		
		do {
			System.out.println("O número atual é: " + numero1);
			numero1++;
		} while (numero1 <= 3);
		
		
		/*--------------------------------------*/
		
		
		System.out.println("\n\n" + "--- FOR COM INCREMENTO ---" + "\n");
		
		/*
		 * Estrutura de repetição FOR com incremento.
		 * Utilizado quando se sabe o número de repetições.
		*/
		
		for (int numero0 = 0; numero0 <= 10; numero0 ++) {
			System.out.println("Número atual é: " + numero0);
		}
		
		/*
		 * Estrutura de repetição FOR com decremento.
		 * Utilizado quando se sabe o número de repetições.
		*/
		
		System.out.println("\n\n" + "--- FOR COM DECREMENTO ---" + "\n");
		
		for (int numero0 = 10; numero0 >= 0; numero0 --) {
			System.out.println("Número atual é: " + numero0);
		}
	}

}
