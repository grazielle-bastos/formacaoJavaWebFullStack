package cursoJava.executavel;

import cursoJava.classes.Aluno;
import cursoJava.classes.Diretor;
import cursoJava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev- Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("465ga6dg484g6eeg");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCPF("5f6asf5as6g4asga");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade()+ "-" + diretor.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade() + "-" + secretario.msgMaiorIdade());
		
		System.out.println("Salário do Aluno é: " + aluno.salario());
		System.out.println("Salário do Diretor é: " + diretor.salario());
		System.out.println("Salário do Secretário é: " + secretario.salario());

	}

}
