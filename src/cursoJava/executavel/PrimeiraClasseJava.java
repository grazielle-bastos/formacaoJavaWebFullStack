package cursoJava.executavel;

public class PrimeiraClasseJava {

	// variável global
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {

		/*
		 * Main é um método auto executável em Java
		 */

		String linguagem = "Java";

		/* Imprime a mensagem no console | Escreve o texto no console */
		System.out.println("Meu primeiro programa em Java do curso 'Formação Java Web', JDEV Treinamento");
		System.out.println("\n\n" + linguagem + " é orientado a objetos \n\n---\n");

		// Criado nova branch

		// variável local
		int maiorIdade = 18;
		System.out.println("Valor da variável local = " + maiorIdade);

		metodo2();
	}

	public static void metodo2() {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}

}
