package exercicio;

import java.util.Scanner;

public class Praticar {

	public static void main(String[] args) {
		int [] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		/*Scanner read = new Scanner(System.in);
		int [][] notasAlunos = new int [3][2];
		
		for(int s = 0 ; s < 3; s++) {
			System.out.println("*****************************");
			System.out.print(s+1+"º Aluno: ");
			for(int x = 0 ; x < 2; x++ ) {
				System.out.println();
				System.out.print(x+1+"ª Nota: ");
				notasAlunos [s][x]= read.nextInt();
			}
		}
		for(int a = 0; a <3; a++) {
			System.out.println();
			System.out.print(a+1+"º Aluno: ");
			for(int b = 0; b < 2; b++) {
				System.out.print(notasAlunos[a][b]+". ");
			}
		}
		
		read.close();*/
	}
}
