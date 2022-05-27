package lista_sete_vetores;

import java.util.Scanner;

public class Quest04 {
/*
 * Questão 4 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.

 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int [10];
		int par = 0, x = 0;
		
		for(int i = 0; i < a.length; i++) {
			x = i +1;
			System.out.println("Informe o "+x+" nº: ");
			a[i]= read.nextInt();
			par = (a[i]%2 == 0) ? par+=1: par;
		}
		System.out.println("O nº de pares no VetorA é ou são: "+par);
		read.close();
	}
}
