package Lista6EstruturasRepitição;

import java.util.Scanner;

/*Questão 9 - Construa um programa que receba um número inteiro e
 *  verifique se o mesmo é primo.
 */
public class Quest09 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero = 0, resto = 0;
		String resposta;

		System.out.print("Digite um nº inteiro e positivo: ");
		numero = read.nextInt();

		for (int i = 1; i <= numero; i++) {
			resto = (numero % i == 0) ? resto + 1 : resto;
		}
		resposta = (resto == 2) ? "\n*************\nO nº " + numero + " É primo."
				: "\n****************\nO nº " + numero + " NÃO é primo...";
		System.out.println(resposta);
		read.close();
	}
}
