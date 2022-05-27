package lista_sete_vetores;

import java.util.Scanner;

public class Quest01 {
/*
 * Questão 1 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[i].
 * */
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[15];
		int b[] = new int[a.length];
		
		System.out.println("Exercício do quadrado entre vetor A para B: ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor: ");
			a[i] = read.nextInt();
			b[i] = a[i]*a[i];
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println("Vetor B["+i+"] tem o valor: "+b[i]+".");
		}
		
		read.close();
	}

}
