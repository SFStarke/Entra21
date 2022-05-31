package lista_sete_vetores;

import java.util.Scanner;
/*Questão 7 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
*/
public class Quest07 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int a[] = new int [4];
	int totPar = 0, totImpar = 0;
	int par = 0, impar = 0;
	
	System.out.println("Conheça o percentual dos nº pares e dos impares contidas no vetor: ");
	for(int i = 0; i < a.length; i++) {
		System.out.println(i+1+"º nº: ");
		a[i]= read.nextInt();
		if(a[i]%2 == 0) {
			totPar ++;
		}else {
			totImpar++;
		}
	}
	par =  (totPar*100)/ a.length;
	impar = (totImpar*100)/ a.length; 
	System.out.println("O porcentual de nº PARES no vetor é: "+par+"%");
	System.out.println("O porcentual de nº IMPARES ne vetor é: "+impar+"%");
	read.close();
}
}
