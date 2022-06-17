package lista_extra_oito_matriz;

import java.util.Scanner;

public class Quest02 {
	/*
	 * 2 Faça um programa que leia um array[5] que corresponde ao gabarito de uma
	 * prova com 5 questões. A seguir, leia uma matriz que contém para cada linha o
	 * número de matrícula de cada aluno e cinco respostas (referentes às cinco
	 * questões). Para cada aluno, o programa deverá mostrar o seu número de
	 * matrícula e a sua respectiva nota. Considere que todas as questões têm o
	 * mesmo peso e as respostas possíveis são a, b, c, d ou e.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String[] gabarito = new String[5];
		String[][] aluno = new String[2][gabarito.length];
		int nota = 0;

		System.out.println("Análise e pontuação de gabarito.\n###############\n");
		System.out.println("Informe o resultado correto do gabarito: ");
		for (int i = 0; i < gabarito.length; i++) {
			System.out.print(i + 1 + "ª Questão: ");
			gabarito[i] = read.next();
		}
		for (int i = 0; i < aluno.length; i++) {
			System.out.print("*************\nAluno de matricula nº"+(i+1)+".\n");
			for (int j = 0; j < aluno[i].length; j++) {
				System.out.print("Questão nº:"+(j+1)+": ");
				aluno[i][j] = read.next();
			}
		}
		for (int i = 0; i < aluno.length; i++) {
			nota = 0;
			System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nAluno de matricula nº"+(i+1)+":");
			for (int j = 0; j < aluno[i].length; j++) {
				if(aluno[i][j].equalsIgnoreCase(gabarito[j])) {
					nota += 2;
				}
			}
			System.out.println("Nota: "+nota);
		}
		read.close();
	}
}
