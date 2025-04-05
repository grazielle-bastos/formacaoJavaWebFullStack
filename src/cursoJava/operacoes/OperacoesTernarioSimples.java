package cursoJava.operacoes;

public class OperacoesTernarioSimples {

	public static void main(String[] args) {
		
		/* Operadores ternários 
		 * São para micro validações, uma linha só, para verdadeiro ou falso */
		
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 80;
		int nota4 = 60;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
	
		String saidaResultado = media >= 70 ? "Aluno aprovado: " + media : (media >= 40 && media <= 69) ? "Aluno em recuperação: " + media : "Aluno Reprovado: " + media;
		
		System.out.println(saidaResultado);
		
	}
	
}
