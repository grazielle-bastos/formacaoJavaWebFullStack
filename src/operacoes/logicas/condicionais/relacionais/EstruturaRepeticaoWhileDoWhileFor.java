package operacoes.logicas.condicionais.relacionais;

public class EstruturaRepeticaoWhileDoWhileFor {

	public static void main(String[] args) {

		/*
		 * Estrutura de repetição While - Sempre repete a execução enquanto a condição
		 * estiver verdadeira
		 */

		/*
		 * Testar o incremento, adicionando o breakpoint no inicio do while, e rodar
		 * debug pressionando f6 e verificando os valores da variável numero sendo
		 * alteradas Atalho ctrl+shift+i inspeciona a variável selecionada.
		 */

		/*
		 * While verifica, e depois executa Utilizado quando não se sabe o número de
		 * repetições.
		 */

		System.out.println("LOOPS - Executados enquanto a condição for verdadeira" + "\n\n" + "--- While ---" + "\n");

		int numero = 0;

		while (numero <= 3) {

			System.out.println("O número atual é: " + numero);
			numero++;
		}

		/*--------------------------------------*/

		/*
		 * Do While primeiro executa, e depois verifica. Utilizado quando não se sabe o
		 * número de repetições.
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
		 * Estrutura de repetição FOR com incremento. Utilizado quando se sabe o número
		 * de repetições.
		 */

		for (int numero0 = 0; numero0 <= 10; numero0++) {
			System.out.println("Número atual é: " + numero0);
		}

		/*
		 * Estrutura de repetição FOR com decremento. Utilizado quando se sabe o número
		 * de repetições.
		 */

		System.out.println("\n\n" + "--- FOR COM DECREMENTO ---" + "\n");

		for (int numero3 = 10; numero3 >= 0; numero3--) {
			System.out.println("Número atual é: " + numero3);
		}

		/*
		 * Estrutura de repetição FOR com Break (Parada).
		 * Encerra um laço de repetição, utilizado quando uma condição específica é atendida.
		 */

		System.out.println("\n\n" + "--- FOR COM BREAK ANINHADO EM IF ---" + "\n");

		for (int numero2 = 0; numero2 <= 10; numero2++) {
			if (numero2 == 3) {
				System.out.println("Obaaa, encontrei o número 3");
				System.out.println("Estou parando de executar...");
				break;
			}
		}

		/*
		 * Estrutura de repetição FOR e Continue. Encontrar o valor, processar e
		 * continuar.
		 * Continue pula para a próxima iteração, voltando ao início do laço. Separa os processos por laços.
		 */

		System.out.println("\n\n" + "--- FOR COM CONTINUE ANINHADO EM IF ---" + "\n");

		for (int numero4 = 0; numero4 <= 10; numero4++) {
			if (numero4 == 3 || numero4 == 6 || numero4 == 9) {
				System.out.println("Obaaa, encontrei o número " + numero4);
				continue;
			}

			System.out.println("Processando laço de repetição");
		}

	}

}
