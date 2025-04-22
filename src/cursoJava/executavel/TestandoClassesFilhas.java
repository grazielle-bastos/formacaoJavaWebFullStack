package cursoJava.executavel;

import cursoJava.classes.Aluno;
import cursoJava.classes.Diretor;
import cursoJava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev- Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("465ga6dg484g6eeg");
		diretor.setNome("Egidio");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCPF("5f6asf5as6g4asga");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
