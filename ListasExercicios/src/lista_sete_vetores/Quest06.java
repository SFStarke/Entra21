package lista_sete_vetores;

import java.util.Scanner;

public class Quest06 {
	/*Questão 6 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
	 * */
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int a[] = new int [4];
	float tot = 0f ;
	int soma=0;
	
	System.out.println("Conheça a média dos nº impares contidas no vetor: ");
	for(int i = 0; i < a.length; i++) {
		System.out.println(i+1+"º nº: ");
		a[i]= read.nextInt();
		tot = (a[i]%2 != 0) ? tot+=a[i]: tot;
		soma = (a[i]%2 != 0) ? (soma+=1): soma;
	}
	System.out.println("A média dos nº impares neste vetor é: "+tot / soma);
	read.close();
}
}
