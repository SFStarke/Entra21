package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

/*Quest�o_1: Elabore um PROGRAMA, que dado um n�mero inteiro, positivo,
 * verifique e exiba se ele � par ou �mpar (Obs.: um n�mero par � divis�vel por 2,
 * ou seja, o resto da divis�o por 2 � igual a zero).*/

public class Quest01 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Saiba se o número é para ou impar...\n Digita o nº: ");
		int numero = read.nextInt();
		
		//String resposta;// = (numero % 2 == 0) ? "nº é PAR..." : "nº é IMPAR...";
		//System.out.println(resposta);

		System.out.println((numero % 2 == 0) ? "nº é PAR..." : "nº é IMPAR...");
		read.close();
	}
}
