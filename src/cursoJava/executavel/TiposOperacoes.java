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

		System.out.println("Média das notas em número decimal = " + (nota5 + nota6 + nota7 + nota8) / 4 + "\n\n" + "---" + "\n");

		/*
		 * --- 
		 * 
		 * - CHAR representa uma letra (um único caracter)
		 * 
		 * 	char letra = 'PF'; -> Não é permitido, restringe a apenas uma única letra.
		*/

		char pessoaJuridica = 'J';

		char pessoaMasculino = 'M';

		if (pessoaMasculino == 'M') {
			System.out.println("Masculino");
		} else {
			System.out.println("Feminino");
		}
		
		if (pessoaJuridica == 'J') {
			System.out.println("Pessoa Jurídica" + "\n\n" + "---");
		}
		
		/* String no Java representa um texto de tamanho e tipos de caracteres qualquer */
		
		String nome = "Alex Egidio";
		String cpf = "123.456.789-12";
		String telefone = "(11) 96354-2144";
		String endereco = "Rua x";
		
		System.out.println("\n" + "Dados cadastrais: " + "\n\n" + "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Contato: " + telefone + "\n" + "Endereço: " + endereco);

	}

}
