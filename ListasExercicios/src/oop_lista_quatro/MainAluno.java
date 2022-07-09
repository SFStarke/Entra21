package oop_lista_quatro;

import java.util.Scanner;

public class MainAluno {
	/*
	 * 5. Escreva uma classe para representar um Curso, que tem nome e horário.
     * Cada curso tem um Professor, que possui nome, departamento e email. Cada
     *Curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome,
     *matricula e 4 notas. Escreva um programa teste que crie um Curso com 5
     *alunos, e que [[ preça para o usuário entrar com as 4 notas de cada aluno ]].
     * Aofinal, imprima a média de cada aluno, se o mesmo está aprovado (media maior
     *ou igual a 7), e qual é a média da turma
	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Curso c = new Curso("Java", "08:00 as 12:00");// Iniciando com entradas de dados básicos do curso
		Professor proff = new Professor("Heloisa Moura", "Desenvolvimento", "helo@outlook.com");// Iniciando com dados básicos do professor
		Aluno[] alunos = new Aluno[5];//Ao alterar vetor, NÃO esquecer TROCAR vetor da classe "Curso"
		float somaMediaGeral = 0f;

		for (int i = 0; i < alunos.length; i++) {
			Aluno a = new Aluno();
			System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nAluno: ");
			a.setNomeAluno(read.nextLine());
			System.out.println("Maticula: ");
			a.setMatricula(read.next());
			System.out.print("Notas do aluno " + a.getNomeAluno() + ";\n");
			for (int j = 0; j < a.getNotas().length; j++) {
				System.out.print(j + 1 + "ª Nota: ");
				a.setNotas(j, read.nextFloat());
			}
			read.nextLine();
			alunos[i] = a;
		}
		c.setProfessor(proff);
		c.setAlunos(alunos);
		
		System.out.println("\n________________________________________________________\n"+
				"\n" + c.showCourse());
		for (int k = 0; k < alunos.length; k++) {
			somaMediaGeral += alunos[k].mediaAluno;
		}
		System.out.println("\nMédia geral dos aluno: "+ somaMediaGeral / alunos.length);

		read.close();
	}
}
