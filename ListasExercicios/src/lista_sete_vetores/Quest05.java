package lista_sete_vetores;

import java.util.Scanner;

public class Quest05 {
/*
 * Questão 5 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int [10];
		int soma = 0;
		System.out.println("Conheça a soma dos nº multiplos de cinco contidas no vetor: ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+1+"º nº: ");
			a[i]= read.nextInt();
			soma = (a[i]%5 == 0) ? soma+=a[i]: soma;
		}
		System.out.println("A soma dos multiplos de cinco neste vetor é: "+soma);
		read.close();
	}

}
