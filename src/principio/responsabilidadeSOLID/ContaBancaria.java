package principio.responsabilidadeSOLID;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;
	
	//método que diminui e soma valores. O objeto tem que fazer o processamento dentro dele mesmo, desde que tudo o que o objeto precise esteja acessível dentro dele.
	
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
}
