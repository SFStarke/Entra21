package lista_oito_matriz;

import java.util.Iterator;
import java.util.Random;

public class Quest01 {
	/*
	 * 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após
	 * isso determine o maior número da matriz e a sua posição (linha, coluna)
	 */

	public static void main(String[] args) {
		Random al = new Random();
		int m[][] = new int [4][4];
		int maior = 0, linha =0, coluna = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = al.nextInt(10);
				if(maior <= m[i][j]) {
					maior = m[i][j];
				linha = i;
				coluna = j;
				}
			}
		}
		System.out.println("\n##########################\n"
				+ "Na matriz contem os seguintes valores:");
		for (int i = 0; i < m.length; i++) {
			System.out.println();
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]+" | ");
			}
		}
		System.out.println("\n******************************\n"
				+ "Maior nº: "+maior+", na linha "+linha+", coluna "+coluna+".");
		
	}
}
