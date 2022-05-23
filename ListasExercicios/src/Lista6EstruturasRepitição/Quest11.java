package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest11 {
	/*
	 * Questão 11 - Faça um programa que exiba a tabuada de um número x. Obs:
	 * tabuada: x*1, x*2 … x*10;
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero = 0, res = 1;
		System.out.println("TABUADA:\n###############################\n"
				+ "Informe o nº, e conheça sua tabuada: ");
		numero = read.nextInt();
		
		for(int x = 1 ; x <= 10 ; x++) {
			res = x*numero;
			System.out.println(x+" X "+numero+" = "+ res);
		}
		read.close();
	}
}
