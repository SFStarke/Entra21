package lista_extra_oito_matriz;

import java.util.Random;

public class Quest01 {
	/*
	 * 1 Soma cubo. Gere duas matrizes cuboA e cuboB com Tamanhos [10][3][5].
	 * Atribua UM valor inteiro qualquer na duas matrizes. Gere uma terceira matriz
	 * cuboC do mesmo tamanho que cuboA e atribua os valores da soma de cuboA +
	 * cuboB.
	 */
	public static void main(String[] args) {
		Random al = new Random();
		int[][][] a = new int [10][3][5];
		int[][][] b = new int [a.length][a[1].length][a[1][1].length];
		int[][][] c = new int [a.length][a[1].length][a[1][1].length];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					int n = al.nextInt(4);
					int n2 = al.nextInt(4);
					a[i][j][j2] = n;
					b[i][j][j2] = n2;
					
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println();
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					c[i][j][j2] = a[i][j][j2] + b[i][j][j2];
					System.out.println("A.["+i+"]["+j+"]["+j2+"]:"+a[i][j][j2]+" + B.["+i+"]["+j+"]["+j2+"]:"+b[i][j][j2]+" = "+c[i][j][j2]);
				}
			}
		}
		
		
	}
}
