package cursoJava.classes;

public class Aluno {
	
	/*Esta é a nossa classe/objeto que representa Aluno*/
	
	/*Os atributos do Aluno (representa as caracteristicas do objeto Aluno, no mundo real:  */	
	
	/*Por default é privado. Pra permitir acessar diretamente os atributos, precisa alterar o objeto para public*/
		public String nome;
		public int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCPF;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;
		
		public Aluno() {/*Cria os dados na memória por default do Java*/
			
		}
		

		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno(String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
		
}
