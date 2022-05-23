package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest19 {
	/*
	 * Questão 19 – Faça um programa que receba dois números inteiros e gere os
	 * números inteiros que estão no intervalo compreendido por eles.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String res = "";
		System.out.print("Informe dois nº inteiros e conheça quais são os seus nº internos:"
				+ "\n##################################"
				+ "\nInforme o 1º número: ");
		int n1 = read.nextInt();
		System.out.print("\nInforme o 2º número: ");
		int n2 = read.nextInt();
		if (n1 < n2) {
			for(int x = n1; x < n2-1; ++x) {
				res += x+1+". ";
			}
			
		}else if(n2 < n1){
			for(int y = n1; y > n2+1; --y) {
				res += y-1+". ";
			}
		}
		System.out.printf("\nOs nº internos são: %s",res);
			
		read.close();
	}

}
