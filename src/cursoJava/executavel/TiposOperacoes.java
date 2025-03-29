package cursoJava.executavel;

public class TiposOperacoes {

	public static void main(String[] args) {

		/* - Operação entre números naturais - Tipo inteiros */

		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;

		System.out.println("Média das notas em número inteiro = " + (nota1 + nota2 + nota3 + nota4) / 4);

		/* - Operação entre números reais - Tipo double (carrega números decimais) */

		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;

		System.out.println("Média das notas em número decimal = " + (nota5 + nota6 + nota7 + nota8) / 4);

		/*
		 * --- - CHAR representa uma letra (um único caracter)
		 */

		char pessoaJuridica = 'J';

		/*
		 * char letra = 'PF'; -> Não é permitido, restringe a apenas uma única letra.
		 */

		char pessoaFeminino = 'F';

		if (pessoaFeminino == 'F') {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}

	}

}
