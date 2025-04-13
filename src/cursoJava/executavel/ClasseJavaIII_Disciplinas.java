package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class ClasseJavaIII_Disciplinas {
	
	public static void main(String[] args) {
		
		/*
		 * Entrada de dados
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome do primeiro aluno: ");
		String idade = JOptionPane.showInputDialog("Digite a idade do primeiro aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do primeiro aluno: ");
		String RG = JOptionPane.showInputDialog("Digite o RG do primeiro aluno: ");
		String CPF = JOptionPane.showInputDialog("Digite o CPF do primeiro aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do primeiro aluno: ");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do primeiro aluno: ");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data da matrícula do primeiro aluno: ");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a série matriculado do primeiro aluno: ");
		String escola = JOptionPane.showInputDialog("Digite a escola do primeiro aluno: ");
		
		String disciplina1 = JOptionPane.showInputDialog("Informe a disciplina 1: ");
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 do primeiro aluno: ");
		
		String disciplina2 = JOptionPane.showInputDialog("Informe a disciplina 2: ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 do primeiro aluno: ");
		
		String disciplina3 = JOptionPane.showInputDialog("Informe a disciplina 3: ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 do primeiro aluno: ");
		
		String disciplina4 = JOptionPane.showInputDialog("Informe a disciplina 4: ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 do primeiro aluno: ");

		/*
		 * Instanciar objeto pra depois passar os dados
		 */
		Aluno aluno1 = new Aluno();

		/*
		 * Executar e passar os dados da tela
		 */
		//Resgata o objeto e seta o atributo
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // Pacote que converte a string para tipo inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCPF(CPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);

		/*
		 * Imprimir os dados no console
		 */
		System.out.println(aluno1.toString()); // Descrição do objeto na memória
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

		
	}

}
