package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest14 {
	/*
	 * Questão 14 – Faça um programa que calcule o valor total investido por um
	 * colecionador de em sua coleção de CDs e o valor médio gasto em cada um deles.
	 * O usuário deverá informar a quantidade de CDs e o valor para cada um deles.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int nCD = 0;
		float valorTot = 0f;
		System.out.println("Conheça a média de gasto obtido pelos CDs...\n" 
		+ "#########################\n"
				+ "De quantos CDs vamos calcular? ");
		nCD = read.nextInt();

		for (int x = 1; x <= nCD; x++) {
			System.out.print("Preço do " + x + "º CD: ");

			valorTot += read.nextFloat();
		}
		System.out.printf("\n**********************\n"
				+ "O custo médio dos CDs foi de R$%.2f.\n"
				+ "E o valor total é de $%.2f", valorTot / nCD,valorTot);
		read.close();

	}

}
