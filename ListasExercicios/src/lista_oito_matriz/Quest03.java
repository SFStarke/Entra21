package lista_oito_matriz;

import java.util.Random;
import java.util.Scanner;

public class Quest03 {
	/*
	 * 3. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após
	 * isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o
	 * menor valor da coluna 7.
	 */
	public static void main(String[] args) {
		Random al = new Random();
		Scanner read = new Scanner(System.in);
		int[][] m = new int[10][10];
		int maiorValorLinha = 0, menorValorLinha = 10;
		int maiorValorColuna = 0, menorValorColuna = 10;
		int cincoMaiorLinha = 0, cincoMaiorColuna = 0, cincoMenorLinha = 0, cincoMenorColuna = 0;
		int seteMaiorLinha = 0, seteMaiorColuna = 0, seteMenorLinha = 0, seteMenorColuna = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//int al = (int) (0 + Math.random() * (10 - 0));
				m[i][j] = al.nextInt(10);
				if (i == 5) {
					if (maiorValorLinha <= m[i][j]) {
						maiorValorLinha = m[i][j];
						cincoMaiorLinha = i;
						cincoMaiorColuna = j;
					}
					if (menorValorLinha >= m[i][j]) {
						menorValorLinha = m[i][j];
						cincoMenorLinha = i;
						cincoMenorColuna = j;
					}
				}
				if (j == 7) {
					if (maiorValorColuna <= m[i][j]) {
						maiorValorColuna = m[i][j];
						seteMaiorLinha = i;
						seteMaiorColuna = j;
					}
					if (menorValorColuna >= m[i][j]) {
						menorValorColuna = m[i][j];
						seteMenorLinha = i;
						seteMenorColuna = j;
					}
				}
				/*
				 * System.out.print("Matriz[" + i + "] [" + j + "]: "); m[i][j] =
				 * read.nextInt();
				 */
			}
		}
		System.out.println("\n####################################\n" +
		"Valores armazenados na matriz M: \n");
		System.out.println("                           COLUNAS:\n"
				+ "           0 || 1 || 2 || 3 || 4 || 5 || 6 || 7 || 8 || 9 ||\n");
		for (int i = 0; i < m.length; i++) {
			System.out.print("LINHA:[" + i + "] ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(" " + m[i][j] + " ||");
//System.out.print("L[" + i + "]<Valor: "+m[i][j]+" >C[" + j + "] || ");
			}
			System.out.println("");
		}
		System.out.printf(
				"\n##############################\n" + "O maior e o menor valor da linha %d na Matriz foram;\n"
						+ "Maior valor foi o nº %d. Local da matriz M: Linha [%d] Coluna [%d].\n"
						+ "Menor valor foi o nº %d. Local da matriz M: Linha [%d] Coluna [%d].\n"
						+ "###################################################################\n",
				cincoMaiorLinha, maiorValorLinha, cincoMaiorLinha, cincoMaiorColuna, menorValorLinha, cincoMenorLinha,
				cincoMenorColuna);

		System.out.printf(
				"\n##############################\n" + "O maior e o menor valor da coluna %d na Matriz foram;\n"
						+ "Maior valor foi o nº %d. Local da matriz M: Linha [%d] Coluna [%d].\n"
						+ "Menor valor foi o nº %d. Local da matriz M: Linha [%d] Coluna [%d].\n"
						+ "###################################################################\n",
				seteMaiorColuna, maiorValorColuna, seteMaiorLinha, seteMaiorColuna, menorValorColuna, seteMenorLinha,
				seteMenorColuna);
		read.close();
	}

}
