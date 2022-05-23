package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest05 {
	/*
	 * Questão 5 - Faça um programa que o usuário informa um número e o programa
	 * verifica se ele é um número triangular. Obs.: Um número é triangular quando o
	 * resultado do produto de três números consecutivos. Exemplo: 24 = 2 x 3 x 4.
	 */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, res = 0, a = 1;

		System.out.println("Informe um número e saiba se é triangular.");
		numero = read.nextInt();

		do {
			res = a * (a + 1) * (a + 2);
			a++;
		} while (res < numero);

		if (numero == res) {
			System.out.printf("O nº %d É triangular.", numero);
		} else {
			System.out.printf("O nº %d NÃO é Triangular.", numero);
		}
		read.close();
	}
}
