package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest13 {
	/*
	 * Questão 13 - Construa um programa que leia uma quantidade indeterminada de
	 * números inteiros positivos e identifique qual foi o maior número digitado. O
	 * final da série de números digitada deve ser indicado pela entrada de -1.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero = 0, maior = 0;
		
		System.out.println("Digite aleatóriamente números inteiro e positivos,\n"
				+ "ao final, saiba qual foi o maior número:\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
		do {
			System.out.print("\n nº ?: ");
			numero = read.nextInt();
			maior = (maior < numero) ? numero : maior;
		}while(numero != -1);
		System.out.println("\n##############################\n"
				+ "O maior nº foi: "+maior);
		read.close();
	}
}