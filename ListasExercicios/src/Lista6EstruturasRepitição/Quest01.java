package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest01 {
	/*
	 * Questão 1 - Crie um programa que o usuário entre com vários números inteiros
	 * e positivos e imprima o produto (*) dos números ímpares e a soma dos números
	 * pares.
	 */
	public static void main(String[] args) {
		int par = 0, impar = 1, n = 0, im = 1;
		Scanner read = new Scanner(System.in);

		System.out.println("Digite números inteiros acima de 0\n"
				+ "para obter como resultado o produto dos impares e a soma dos pares.\n"
				+ "Para encerrar o processo, digite um nº igual ou menor que zero.\n"
				+ "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
		do {
			System.out.print("Informe o numero inteiro: ");
			n = read.nextInt();
			if (n % 2 == 0) {
				par += n;
			} else {
				impar *= n;
				im++;
			}
		} while (n > 0);
		System.out.println("************************************\n");
		String resPar = par == 0 ? "Não houve nº pares para calcular..." : "A soma dos números pares é: " + par;
		String resImpar = im == 1 ? "Não hove nº impares para calcular..."
				: "O produto dos números impares é: " + impar;
		System.out.println(resPar);
		System.out.println(resImpar);
		read.close();
	}
}
