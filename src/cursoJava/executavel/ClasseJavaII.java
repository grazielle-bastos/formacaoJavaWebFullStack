package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class ClasseJavaII {

	public static void main(String[] args) {

		/*Entrada de dados*/
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
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 do primeiro aluno: ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 do primeiro aluno: ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 do primeiro aluno: ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 do primeiro aluno: ");

		/*Instanciar objeto pra depois passar os dados*/
		Aluno aluno1 = new Aluno();

		/*Executar e passar os dados da tela*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /* Pacote que converte a string para tipo inteiro */
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCPF(CPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1)); /* Pacote que converte a string para tipo double */
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		/*Imprimir os dados no console*/
		System.out.println(aluno1.toString()); /* Descrição dp objeto na memória */
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}
