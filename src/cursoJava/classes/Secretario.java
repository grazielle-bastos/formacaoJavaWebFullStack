package cursoJava.classes;

import cursoJava.interfaces.PermitirAcesso;

//Classe filha de Pessoa, que extende de Pessoa
public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	  public String msgMaiorIdade( ) {
		  return this.pessoaMaiorIdade() ? "Oba! Secretário é maior de idade" : "Ixi! Secretário é menor de idade";	
	
	  }
	  
	  @Override
	  public double salario() {
		return 1800.80 * 0.9;
	  }
	  
	  //Este é o método do contrato de autenticação
	  @Override
	  public boolean autenticar() {

		return login.equals("admin") && senha.equals("admin"); // retorna sim caso login e senha sejam admin, se não false.
	  }
	  public String getLogin() {
		  return login;
	  }
	  public void setLogin(String login) {
		  this.login = login;
	  }
	  public String getSenha() {
		  return senha;
	  }
	  public void setSenha(String senha) {
		  this.senha = senha;
	  }
	  
	  

}