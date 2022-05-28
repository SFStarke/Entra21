package lista_sete_vetores;

import java.util.Scanner;

public class Quest15 {
	/*
	 * Questao 15 – Criar um vetor A com 10 elementos inteiros. Escreva um programa
	 * que imprima cada elemento do vetor A e a relação de todos os divisores do
	 * respectivo elemento.
	 */
	public static void main(String[] args) {
		int a[] = new int[10];
		String res = "";
		Scanner read = new Scanner(System.in);
		System.out.println("Números divisores:\n"
				+"****************************\n"
				+"Digite valotes ao Vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "º Valor: ");
			a[i] = read.nextInt();
		}
		System.out.print("##########################\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("Valor[" +i+ "]: ");
			res = "";
			for (int j = 2; j <= a[i]; j++) {
			res += (a[i] % j == 0) ? ", "+j : "";
			}
			System.out.println("D(" + a[i] + ") = {1" + res + "}");
		}
		read.close();
	}
}
