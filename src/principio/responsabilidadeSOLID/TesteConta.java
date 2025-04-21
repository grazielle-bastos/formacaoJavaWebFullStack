package principio.responsabilidadeSOLID;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancária do Alex");
		
		System.out.println(bancaria);
		
		System.out.println("------------------------------------");
		
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		System.out.println("------------------------------------");
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		System.out.println("------------------------------------");
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		System.out.println("------------------------------------");
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
		
	}

}
