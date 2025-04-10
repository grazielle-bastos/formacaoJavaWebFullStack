package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class ClasseJava {

	public static void main(String[] args) {

		/*
		 * Construtores para definir comportamento ao iniciar um objeto, podendo ou não
		 * passar parametros
		 */

		/* Objeto ainda não existe na memória */
		/* Aluno aluno0; */

		/*
		 * Neste exemplo há um objeto real na memória, não existe, está somente
		 * declarado
		 */

		/* new Aluno() é uma instancia/construtor (Criação de Objeto) */
		/* A variável aluno1 é uma referência ao objeto Aluno */
		/*
		 * Aluno aluno1 = new Aluno(); /* Não é boa prática acessar diretamente os
		 * atributos do objeto público, deve ser privado pra evitar erros por chamadas
		 * indevidas, e nesse caso devemos aplicar os métodos getters e setters no
		 * objeto: aluno1.nome = "João"; aluno1.idade = 50;
		 * 
		 * System.out.println("Nome do aluno 1 é: " + aluno1.nome);
		 * 
		 * System.out.println("Idade do aluno 1 é: " + aluno1.idade);
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
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 do primeiro aluno: ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 do primeiro aluno: ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 do primeiro aluno: ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 do primeiro aluno: ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /*Pacote que converte a string para tipo inteiro*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCPF(CPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula); 
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1)); /*Pacote que converte a string para tipo double*/
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("O nome do primeiro aluno é: " + aluno1.getNome());
		System.out.println("A idade do primeiro aluno é: " + aluno1.getIdade());
		System.out.println("A data de nascimento do primeiro aluno é: " + aluno1.getDataNascimento());
		System.out.println("O RG do primeiro aluno é: " + aluno1.getRegistroGeral());
		System.out.println("O número de CPF do primeiro aluno é: " + aluno1.getNumeroCPF());
		System.out.println("O nome da mãe do primeiro aluno é: " + aluno1.getNomeMae());
		System.out.println("O nome do pai do primeiro aluno é: " + aluno1.getNomePai());
		System.out.println("A data da matrícula do primeiro aluno é: " + aluno1.getDataMatricula());
		System.out.println("A série do primeiro aluno é: " + aluno1.getSerieMatriculado());
		System.out.println("O nome da escola do primeiro aluno é: " + aluno1.getNomeEscola());
		System.out.println("A nota 1 do primeiro aluno é: " + aluno1.getNota1());
		System.out.println("A nota 2 do primeiro aluno é: " + aluno1.getNota2());
		System.out.println("A nota 3 do primeiro aluno é: " + aluno1.getNota3());
		System.out.println("A nota 4 do primeiro aluno é: " + aluno1.getNota4());
		System.out.println("Média da nota do primeiro aluno é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); /*Utilização de operador ternário*/
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
		
		
		/* System.out.println("\n---------------------\n"); */

		/* ==================================================================== */

		/*
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("Pedro"); aluno2.setIdade(40);
		 * aluno2.setDataNascimento("10/10/1970");
		 * 
		 * System.out.println("O nome do segundo aluno é: " + aluno2.getNome());
		 * System.out.println("A idade do segundo aluno é: " + aluno2.getIdade());
		 * System.out.println("A data de nascimento do segundo aluno é: " +
		 * aluno2.getDataNascimento());
		 */

		/* ==================================================================== */

		/*Aluno aluno3 = new Aluno();
		 */
		
		/*
		 * Inicia aluno com new, cria-se instanciando o objeto (aluno) na memória desta
		 * forma.
		 * 
		 * Classe variavel = new objeto tipoClasse()
		 */

		/*
		 * Aluno aluno4 = new Aluno("Maria");
		 * 
		 * Aluno aluno5 = new Aluno("José", 50);
		 */

	}

}
