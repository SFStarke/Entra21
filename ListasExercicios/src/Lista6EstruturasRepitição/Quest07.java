package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest07 {
	/*
	 * Questão 7 - Faça um programa que leia vários números e informe quantos desses
	 * números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o
	 * programa deverá encerrar sua execução
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero = 1, between = 0;
		System.out.println(
				"Quantos nº foram digitados entre 100 a 200.\n"
		+ "##############################################\n");
		System.out.println("Para encerrar, digite o nº 0");
		do {
			System.out.print("Digite o nº: ");
			numero = read.nextInt();
			if (numero >= 100 && numero <= 200) {
				between++;
			}

		} while (numero > 0);

		System.out.printf(
				"\n********************************\n" 
		+ "Entre os números de 100 a 200, foi e ou foram %d vezes.",
				between);
		read.close();
		
	}
}
