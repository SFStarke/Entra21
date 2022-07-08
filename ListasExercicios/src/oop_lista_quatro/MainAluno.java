package oop_lista_quatro;

import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Curso c = new Curso("Java", "08:00 as 12:00");
		Professor proff = new Professor("Heloisa Moura","Desenvolvimento","helo@outlook.com");
		Aluno[] alunos = new Aluno[2];
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		a1.setNome("Sergio");
		a2.setNome("Felipe");
		
		
		//System.out.println(alunos[0].getNome());
		
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.print("Nome do "+(i+1)+"º Aluno: ");
//			String n = read.next();
//			alunos[i].setNome(n);
//			System.out.print("Matricula nº: ");
//			alunos[i].setMatricula(read.next());
//			for (int j = 0; j < alunos[i].getNotas().length; j++) {
//				System.out.print(j+" Nota: ");
//				alunos[j].setNotas(j, read.nextFloat());
//			}
//		}
		
		
		
		
		
//		alunos[0] = new Aluno("Sérgio", "01");
//		alunos[1] = new Aluno("Felipe", "02");
//		alunos[2] = new Aluno("Starke", "03");
//		alunos[3] = new Aluno("Beatriz", "04");
//		alunos[4] = new Aluno("Bublitz", "05");
//		
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println(alunos[i].aval());
//		}
		read.close();
	}
}
