package cursoJava.executavel;

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

		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("48.348.675-9");
		aluno1.setNumeroCPF("532.117.542-41");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/10/2024");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDEV Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("O nome do primeiro aluno é: " + aluno1.getNome());
		System.out.println("A idade do primeiro aluno é: " + aluno1.getIdade());
		System.out.println("A data de nascimento do primeiro aluno é: " + aluno1.getDataNascimento());
		System.out.println("O Registro Geral do primeiro aluno é: " + aluno1.getRegistroGeral());
		System.out.println("O número de CPF do primeiro aluno é: " + aluno1.getNumeroCPF());
		System.out.println("O nome da mãe do primeiro aluno é: " + aluno1.getNomeMae());
		System.out.println("O nome do pai do primeiro aluno é: " + aluno1.getNomePai());
		System.out.println("Média da nota do primeiro aluno é: " + aluno1.getMediaNota());

		System.out.println("\n---------------------\n");

		/* ==================================================================== */

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");

		System.out.println("O nome do segundo aluno é: " + aluno2.getNome());
		System.out.println("A idade do segundo aluno é: " + aluno2.getIdade());
		System.out.println("A data de nascimento do segundo aluno é: " + aluno2.getDataNascimento());

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
