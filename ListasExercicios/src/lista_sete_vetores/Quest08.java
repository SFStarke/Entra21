package lista_sete_vetores;

import java.util.Scanner;

/*Questão 8 - Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: 
a) a soma de elementos armazenados neste
vetor que são inferiores a 15; 
b) a quantidade de elementos
armazenados no vetor que são iguais a 15;
c) a média dos
elementos armazenados no vetor que são superiores a 15.*/
public class Quest08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		int soma = 0, media = 0, igual = 0;

		System.out.println(
				"Conheça quantos nº iguais ha de 15,\n"
				+ " a soma dos que são menores de 15 e\n"
				+ " a média que dos que são superiores a 15 no vetor:\n###########\n"
				+ "Digite os nº abaixo e veja o resultado:\n");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + "º nº: ");
			a[i] = read.nextInt();
			if (a[i] < 15) {
				soma++;
			} else if (a[i] == 15) {
				igual++;
			} else if (a[i] > 15) {
				media++;
			}
		}
		media = (media*100)/a.length;
		
		System.out.printf("Neste vetor há;\n"
				+ "%d numeros menores que quinze (15).\n"
				+ "%d iguais a quinze (15).\n"
				+ "E a média de numeroe que são maiores que quinze (15) é %d porcento.",soma,igual,media);
		read.close();
	}
}
