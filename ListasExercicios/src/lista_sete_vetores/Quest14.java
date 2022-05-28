package lista_sete_vetores;

import java.util.Scanner;

public class Quest14 {
	/*
	 * Questão 14 – Ler dois vetores A e B com 10 elementos cada. Construir um vetor
	 * C, sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de
	 * C deverão receber os elementos de A e os últimos elementos C deverão receber
	 * os elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B,
	 * ou seja, 20 elementos.
	 */
	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[a.length];
		int c[] = new int[a.length*2];
		int x = a.length;
		Scanner read = new Scanner(System.in);
		System.out.println("Agregação de vetores:\n" +
		"Digite valotes ao Vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "º Valor: ");
			a[i] = read.nextInt();
			c[i] = a[i];
		}
		System.out.print("Vetor B: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "º Valor: ");
			b[i] = read.nextInt();
			c[x] = b[i];
			x+=1;
		}
		System.out.print("\nVetor C: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ". ");
		}
		read.close();
	}

}
