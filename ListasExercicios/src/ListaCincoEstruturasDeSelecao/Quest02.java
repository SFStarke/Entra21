package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest02 {

/*Quest�o_2: Escreva um programa que receba como entrada um n�mero e
 * exiba uma mensagem informando se ele � positivo, negativo ou neutro.*/

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um nº e saiba se ele é positivo, negativo ou neutro: ");
		int numero = read.nextInt();
		
		String resposta = (numero > 0) ? "Nº POSITIVO..." : (numero < 0) ? "Nº NEGATIVO..." : "Nº NEUTRO...";
		
		System.out.println(resposta);

		read.close();
	}
}
