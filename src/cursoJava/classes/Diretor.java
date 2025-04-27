package cursoJava.classes;

//Classe filha de Pessoa, que extende de Pessoa
public class Diretor extends Pessoa {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override //método que já existe no Java
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	  public String msgMaiorIdade( ) {
		  return this.pessoaMaiorIdade() ? "Oba! Diretor é maior de idade" : "Ixi! Diretor é menor de idade";
	
	  }
	  
	  @Override
	  public double salario() {
		return 3900.78;
	  }
	  
}
