package exercicio_vetor;

import java.util.Scanner;

public class Exercicio01 {
	// Criar dois vetores inteiros com tamanho 10, imprimir o menor vetor e
	// o maior vetor de sua soma no final.
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] v1 = new int[4];
		int[] v2 = new int[4];
		int totv1 = 0, totv2 = 0;
		String res;

		System.out.println("Digite os valores para o 1º vetor:");
		for (int i = 0; i < v1.length; i++) {
			System.out.print(i + 1 + "º valor: ");
			v1[i] = read.nextInt();
			totv1 += v1[i];
		}
		System.out.println("Digite os valores para o 2º vetor:");
		for (int i = 0; i < v2.length; i++) {
			System.out.print(i + 1 + "º valor: ");
			v2[i] = read.nextInt();
			totv2 += v2[i];
		}
		res = (totv1 > totv2) ? "O 1º vetor tem o maior soma." : "O 2º vetor tem a maior soma.";
		read.close();
		System.out.println(res);

	}

}
