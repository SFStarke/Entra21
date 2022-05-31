package lista_sete_vetores;

import java.util.Scanner;

public class Quest03 {
	/*
	 * Questão 3 - Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é:
• a soma dos respectivos
elementos em A e B
C[i] = A[i] + B[i].
• a subtração dos respectivos
elementos em A e B
C[i] = A[i] – B[i].
• a multiplicação dos
respectivos elementos em A e B
C[i] = A[i] * B[i].
• a divisão dos respectivos
elementos em A e B
C[i] = A[i] / float(B[i]).
	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int [4];
		int b[] = new int [a.length];
		float c[] = new float [a.length];
		System.out.println("Exercício de calculos entre os Vetores A e B:\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
				+ "Informe os valores para o Vetor A:");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+1+"º valor: ");
			a[i] = read.nextInt();
		}
		System.out.println("Informe os valores para o Vetor B: ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+1+"º valor: ");
			b[i] = read.nextInt();
		}
		System.out.println("\n******************\n"
				+ "A SOMA das respectivas casas dos vetores A e B são:");
		for(int i = 0; i < a.length ; i++) {
			c[i]= a[i] + b[i];
			System.out.printf("Vetor["+i+"]: %.0f\n",c[i]);
		}
		System.out.println();
		System.out.println("\n**********************\n"
				+ "A SUBTRAÇÃO das respectivas casas dos vetores A e B são:");
		for(int i = 0; i < a.length ; i++) {
			c[i]= a[i] - b[i];
			System.out.printf("Vetor["+i+"]: %.0f \n",c[i]);
		}
		System.out.println();
		System.out.println("\n**********************\n"
				+ "A MULTIPLICAÇÃO das respectivas casas dos vetores A e B são:");
		for(int i = 0; i < a.length ; i++) {
			c[i]= a[i] * b[i];
			System.out.printf("Vetor["+i+"]: %.0f \n",c[i]);
		}
		System.out.println();
		System.out.println("\n**********************\n"
				+ "A DIVISÃO das respectivas casas dos vetores A e B são:");
		for(int i = 0; i < a.length ; i++) {
			c[i]= (a[i] / b[i]);
			System.out.println("Vetor["+i+"]: "+c[i]);
		}
		System.out.println();
		
		read.close();

	}

}
