package lista_sete_vetores;

import java.util.Scanner;

public class Quest09 {
	/*Questão 9 - Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.

	 * */
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int a[] = new int [10];
	int idade=0;
	
	System.out.println("Conferencia de idade que supere aos 35 anos:\n*************\n");
	for(int i = 0; i < a.length; i++) {
		System.out.println(i+1+"º nº: ");
		a[i]= read.nextInt();
		idade = (a[i] > 35 ) ? idade+1: idade;
	}
	System.out.printf("Neste vetor ha %d pessoas com idade superior a 35 anos.",idade);
	read.close();
}
}
