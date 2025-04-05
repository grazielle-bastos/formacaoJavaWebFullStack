package cursoJava.operacoes;

public class OperacoesIfElse {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Fabio";
		
		/*Para debugar: 
		 * - Inserir breakpoint nas linhas desejadas para debug
		 * - Rodar ferramenta debug
		 * - Seleciona a condição e pressiona atalho ctrl+shft+i para ver o resultado lógico  */
		
		/* Condições lógicas com If e Else */
		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabéns você está aprovado" + "\n");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado"+ "\n");
		} else {
			System.out.println("Aluno não encontrado" + "\n");
		}
		
		/* 
		 * ---
		*/
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
			
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		
	}

}
