package ListaDoisEntradaSaida;

import java.util.Scanner;
// Ajuste SALARIAL.

public class Quest10 {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);

		int nFilhos, hTrabalho;
		float salario, vHora;
		String nome;

		System.out.print("Nome do Funcion�rio: ");
		nome = read.nextLine();
		System.out.println();
		System.out.print("Quantidade de horas de trabalho: ");
		hTrabalho = read.nextInt();
		System.out.println();
		System.out.print("Valor da hora de trabalho do funcion�rio: ");
		vHora = read.nextFloat();
		System.out.println();
		System.out.print("Possui filhos? Quantos: ");
		nFilhos = read.nextInt();
		System.out.println();

		salario = (float)((vHora * hTrabalho) + (nFilhos * 0.03 * vHora * hTrabalho));
		System.out.printf("O sal�rio total do funcionrio %s � de R$%.2f",nome, salario);
		read.close();
	}

}
