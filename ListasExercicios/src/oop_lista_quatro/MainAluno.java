package oop_lista_quatro;

import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Curso c = new Curso("Java", "08:00 as 12:00");
		Aluno alunos[] = new Aluno[5];
		Professor proff = new Professor("Heloisa Moura","Desenvolvimento","helo@outlook.com");
		
				
		
//		alunos[0] = new Aluno("Sérgio", "01");
//		alunos[1] = new Aluno("Felipe", "02");
//		alunos[2] = new Aluno("Starke", "03");
//		alunos[3] = new Aluno("Beatriz", "04");
//		alunos[4] = new Aluno("Bublitz", "05");
//		
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println(alunos[i].aval());
//		}
		
		//c.setProfessor("Sergio", "Java", "Ser@.outlook.com");
		
		//System.out.println(c.status());
		
		read.close();
	}
}
