package ListaExtraSeis;

import java.util.Scanner;

public class Quest06 {
	/*
	 * Questão 6 - A partir do código abaixo, elabore a questão do que o programa
	 * deve fazer.
	 * 
	 * Resposta:
	 *    O programa deve apresentar apenas os números impares, como entrada, 
	 *    a partir de qualquer número maior que 0, até chegar ao 99.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = -1;
		while (x <= 0 || x >= 100) {
		System.out.print("Digite um nœmero maior que zero e menor que 100: ");
		x = in.nextInt();
		}
		if (x%2 == 0){
		x = x + 1;
		}
		while (x < 100) {
		System.out.print(x + ", ");
		x = x + 2;
		}
		in.close();
	}
}
