package cursoJava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	/* Esta é a nossa classe/objeto que representa Aluno */

	/*
	 * Os atributos do Aluno (representa as caracteristicas do objeto Aluno, no
	 * mundo real:
	 */

	/*
	 * Por default e boas práticas é privado. Pra permitir acessar diretamente os
	 * atributos, precisa alterar o objeto para public
	 */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
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
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

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
				return "Aluno está aprovado";
			} else {
			return "Aluno em recuperação";
			}
		} else {
			return "Aluno está reprovado";
		}
	}
	
	
	
	  @Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	  @Override public int hashCode() { return Objects.hash(nome, numeroCPF); }
	  
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; Aluno other = (Aluno) obj; return Objects.equals(nome, other.nome) &&
	  Objects.equals(numeroCPF, other.numeroCPF); }
	  
	 
}
