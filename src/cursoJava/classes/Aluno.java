package cursoJava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursoJava.constantes.StatusAluno;

/* Esta é a classe/objeto que representa Aluno, com a herança aplicada */
//Classe filha de Pessoa, que extende de Pessoa
public class Aluno extends Pessoa {

	/*
	 * Os atributos do Aluno (representa as caracteristicas do objeto Aluno, no
	 * mundo real:
	 */

	/*
	 * Por default e boas práticas é privado. Pra permitir acessar diretamente os
	 * atributos, precisa alterar o objeto para public
	 */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	/*Criado/instanciado um novo objeto dentro do objeto Aluno*/
	//Declarado a lista de disciplinas
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	//Get e Set da disciplina:
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	/*
	 * Controle de acesso a variáveis.
	 */

	public Aluno() {/* Cria os dados na memória por default do Java */

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/*
	 * Métodos SETTERS E GETTERS do objeto SET - Adiciona ou recebe dados para os
	 * atributos GET - Resgata ou obtém o valor do atributo com o return do tipo de
	 * dado
	 */

	/* Recebe dados */
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* Método que retorna a média do aluno */
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
			//O for percorre/varre a lista de dados pra fazer algo, neste caso é a média das notas;
		}
		return somaNotas / disciplinas.size(); 
	}

	/* Método que retorna true para aprovado e false para reprovado */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 5) {
			if (media >= 7) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	  @Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	  @Override
	  public int hashCode() {
		return Objects.hash(dataMatricula, disciplinas, nomeEscola, serieMatriculado);
	  }

	  @Override
	  public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	  }
	 
}
