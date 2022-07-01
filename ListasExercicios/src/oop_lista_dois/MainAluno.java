package oop_lista_dois;

import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Scanner read = new Scanner(System.in);
		String nome, cur;
		String discFor;
		int matri;
		
		System.out.print("Informe o nº da matrícula: ");
		matri = read.nextInt();
		System.out.print("Nome do aluno: ");
		nome = read.next();
		System.out.print("Curdo:");
		cur = read.next();
			
		a.aluno(nome, matri, cur);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Disciplina: ");
			discFor = read.next();
			a.setDisciplinas(discFor);
			for (int j = 0; j < 3; j++) {
				System.out.println(j+1+"ª nota da disciplina de "+discFor);
				a.setNotas(i, j, read.nextFloat());
			}
		}
		a.aval();
		
		read.close();
		
/*		 
// No Método aluno(), são informados: Nome do aluno, Nº da matricula e Curso exercido.
		a.aluno("Sérgio Felipe Starke", 1, "Java Avançado");
		
		a.disciplinas[0] = "Inglês";
		a.disciplinas[1] = "Desv. Humano";
		a.disciplinas[2] = "Java";
		
		a.notas[0][0] = 6;
		a.notas[0][1] = 6;
		a.notas[0][2] = 6;
		a.notas[1][0] = 7;
		a.notas[1][1] = 7;
		a.notas[1][2] = 7;
		a.notas[2][0] = 8;
		a.notas[2][1] = 8;
		a.notas[2][2] = 8;
		
		a.aval();
		
a.aluno("Heloisa", 2, "Java Super Hiper Avançado");
		
		a.disciplinas[0] = "Inglês";
		a.disciplinas[1] = "Desv. Humano";
		a.disciplinas[2] = "Java";
		
		a.notas[0][0] = 6;
		a.notas[0][1] = 5;
		a.notas[0][2] = 5.5f;
		a.notas[1][0] = 8.7f;
		a.notas[1][1] = 9;
		a.notas[1][2] = 9.4f;
		a.notas[2][0] = 10;
		a.notas[2][1] = 10;
		a.notas[2][2] = 10;
		
		a.aval();*/
		
		
	}
}
