package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class ClasseJava {
	
	public static void main(String[] args) {
		
		/*Construtores para definir comportamento ao iniciar um objeto, podendo ou não passar parametros*/
		
		/*Objeto ainda não existe na memória*/
		Aluno aluno0;
		
		/*Neste exemplo há um objeto real na memória, não existe, está somente declarado*/
		
		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		/*Inicia aluno com new, cria-se instanciando o objeto (aluno) na memória desta forma.
		 * 
		 * Classe variavel = new objeto tipoClasse()*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
	}

}
