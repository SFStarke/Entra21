package lista_oito_matriz;

import java.util.Scanner;

public class Quest02 {
	/*
	 * 2. Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a
	 * captura imprima a matriz criada e encontre a quantidade de números pares, a
	 * quantidade de números ímpares
	 */
	public static void main(String[] args) {
		 Scanner read = new Scanner(System.in);
	        int[][] m = new int[3][3];
	        int par = 0, impar = 0;
	        System.out.println("Informe valores na matriz abaixo: ");
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) {
	            	System.out.print("Matriz[" + i + "] [" + j + "]: ");
	                m[i][j] = read.nextInt();
	                if ( m[i][j] % 2 == 0) {
	                    par++;
	                }else{
	                    impar++;
	                }
	            }
	        }
	        System.out.println("\n####################################\n"
	                + "Na matriz contem os seguintes valores: \n");
	        for (int i = 0; i < m.length; i++) {
	        	System.out.println();
	            for (int j = 0; j < m[i].length; j++) {
	                System.out.print(" Matriz[" + i + "][" + j + "]: " + m[i][j]+" || ");
	            }
	            System.out.println("");
	        }
	        System.out.printf("\n##############################\n"
	                + "A quantidade de nº pares foi de %d.\n"
	                + "A quantidade de nº impares fois de %d.\n", par, impar);
	        read.close();
	}

}
