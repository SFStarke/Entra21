package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest16 {
	/*
	 * Questão 16 – Faça um programa que entre com dois números inteiros,
Entre com uma operação ( +, - , * ou /) e faça o calculo.
Imprima a mensagem “ operação invalida ”. Caso não entre em nenhuma das
operações escolhida.
Para operação valida:
Imprima o resultado;
Verifique se o resultado é positivo ou negativo;
Verifique se o resultado é par ou impar.
Utilize outra estrutura de Seleção diferente do if/else
	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n1 = 0, n2 = 0, res = 0;
		char operacao;
		String parImp = null, posNeg = null;
		
		System.out.println("Calculadora Plus...\n"
+ "Conheça o resultado e saiba se é par ou impar e se é negativo ou positivo.\n***********************\n");
		System.out.print("Qual o primeiro número: ");
		n1 = read.nextInt();
		System.out.print("\nQual o segundo número: ");
		n2 = read.nextInt();
		System.out.println("\n\nQual operação deseja fazer?\n"
				+ "Adição [ + ] Subtração [ - ] Multiplicação [ * ] Divisão [ / ]");
		operacao = read.next().charAt(0);
		if ((operacao != '+')&&(operacao != '-')&&(operacao != '*')&&(operacao != '/')) {
			System.out.println("Operação ivalida...");
			System.exit(0);
		}
		
		switch (operacao) {
		case '+':
			res = n1 + n2;
			parImp = ((res % 2) == 0) ? "PAR": "IMPAR";
			posNeg = (res >= 0) ? "POSITIVO" : "NEGATIVO";
			break;
		case '-':
			res = n1 - n2;
			parImp = ((res % 2) == 0) ? "PAR": "IMPAR";
			posNeg = (res >= 0) ? "POSITIVO" : "NEGATIVO";
			break;
		case '*':
			res = n1 * n2;
			parImp = ((res % 2) == 0) ? "PAR": "IMPAR";
			posNeg = (res >= 0) ? "POSITIVO" : "NEGATIVO";
			break;
		case '/':
			res = n1 / n2;
			parImp = ((res % 2) == 0) ? "PAR": "IMPAR";
			posNeg = (res >= 0) ? "POSITIVO" : "NEGATIVO";
			break;
		}
		System.out.printf("O resultado da conta foi "+res+".\n"
				+ "É número %s e %s",posNeg, parImp);
		String s = String.format("O resultado da conta foi "+res+".\n"
				+ "É número %s e %s",posNeg, parImp);
		System.out.println(s);
		read.close();
	}

}
