package lista_sete_vetores;

import java.util.Scanner;

public class Quest02 {
	/*
	 * Questão 2 - Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.
Construir um vetor C de
mesmo tipo e tamanho que A, sendo que cada elemento do vetor C deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: C[i] := A[i] % 2.
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [a.length];
		int c[] = new int [a.length];
		System.out.println("Exercício multiplicando A com posição do VetorB:");
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+1+"º valor: ");
			a[i] = read.nextInt();
			b[i] = a[i] * i;
			c[i] = a[i] % 2;
		}
		for(int i = 0; i < a.length ; i++) {
			System.out.println("Vetor B["+i+"]: "+b[i]);
		}
		System.out.println();
		for(int i = 0; i < a.length ; i++) {
			System.out.println("Vetor c["+i+"]: "+c[i]);
		}
		read.close();
	}

}
