package lista_extra_cinco;

import java.util.Scanner;
/*
 * Questão 2 – Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão sempre é pelo mais
barato.

 * */
public class Quest02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float comprado = 0;
		int v = 0, l = 1;
		String produto = null;
		float pro[] = new float[3];
		System.out.print("Comparativo de preços:\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		while(v < 3) {
			System.out.print("\nPreço do "+l+"º produto: ");
			pro[v] = read.nextFloat();
			l++;
			v++;
		}
		l = 1;
		System.out.println("\nOs valores são:");
		
		for(int  i = 0; i < 3; i++) {
			System.out.println(l+"º Produto: R$"+pro[i]);
			l++;
		}
		if((pro[0] == pro[1]) && (pro[0] == pro[2])) {
			System.out.println("Os preços dos produtos são os mesmos: ");
			comprado = pro[0];
			produto = "1º, 2º e 3º";
		}else {
		if ((pro[0] <= pro[1]) && (pro[0] < pro[2])) {
			comprado = pro[0];
			produto = "1º";
		}else if((pro[1] < pro[2]) && (pro[1] < pro[0])) {
			comprado = pro[1];
			produto = "2º";
		}else {
			comprado = pro[2];
			produto = "3º";
		}
		}
		
		System.out.printf("\n************************\n"
				+ "O %s produto(s) é(são) de menor valor: R$%.2f",produto,comprado);
		read.close();
		
		/*float pro1, pro2, pro3, comprado;
		
		System.out.print("Preço do 1º produto: ");
		pro1 = read.nextFloat();
		System.out.print("Preço do 2º produto: ");
		pro2 = read.nextFloat();
		System.out.print("Preço do 3º produto: ");
		pro3 = read.nextFloat();
		
		if ((pro1 < pro2) && (pro1 < pro3)) {
			comprado = pro1;
		}else if((pro2 < pro1) && (pro2 < pro3)) {
			comprado = pro2;
		}else {
			comprado = pro3;
		}
		
		System.out.printf("O produto de menor preço é de R$%.2f",comprado);*/
		read.close();
	}
}
