package Lista6EstruturasRepitição;

import java.util.Scanner;
/*
 * Questão 2 - Crie um programa que ajude o DETRAN a saber, o total de recursos que foram 
arrecadados com a aplicação de multas de trânsito.
O programa deve ler as seguintes informações para cada motorista:
-O número da carteira de motorista
-Número de multas;
-Valor de cada uma das multas.
Deve ser impresso o valor da dívida de cada motorista e ao final da leitura o total de recursos 
arrecadados (somatório de todas as multas). O programa deverá imprimir também o número da 
carteira do motorista que obteve o maior número de multa
 * */

public class Quest02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float divida = 0, totDivida = 0, arrecadado = 0;
		int cnh, nMulta = 0, cnhMais = 0, nMultaMais = 0;
		char res = 0;

		System.out.println("Conferência de recursos DETRAN\n#################################");
		do {
			totDivida = 0;
			System.out.print("\nNº do CNH: ");
			cnh = read.nextInt();
			System.out.println("\nDigite quantas multas são: ");
			nMulta = read.nextInt();
			for (int i = 1; i <= nMulta; i++) {
				System.out.print("\nValor da multa: R$");
				divida = read.nextInt();
				totDivida += divida;
				arrecadado += divida;

				if (nMultaMais < nMulta) {
					nMultaMais = nMulta;
					cnhMais = cnh;
				}
			}
			System.out.printf("\nO portador da CNH nº%d teve %d multa(s) com"
					+ "binando o total de R$%.2f", cnh, nMulta,
					totDivida);
			System.out
					.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nNovo cadastro de infração de CNH? Sim[s] Não[n]");
			res = read.next().charAt(0);
		} while (res == 's');

		System.out.printf("\n******************************\n"
				+ "O portador da CNH nº %d, obteve o maior nº de multas no total de: %d ifrações\n"
				+ "O Valor total de arrecadação do DETRAN foi de R$%.2f", cnhMais, nMultaMais, arrecadado);

		read.close();
	}
}
