package lista_sete_vetores;

import java.util.Scanner;
/*Questão 12 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para de
percorrer os elementos do vetor e deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.*/

public class Quest12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		boolean confirma = true;
		String resPar = "";
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + "º Valor");
			a[i] = read.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			confirma = a[i] % 2 == 0 ? true : false;
			if(confirma == false) {
				break;
			}
		}
		resPar = confirma == true ? "TODOS os números do vetor são pares." :
			"NEM todos os números do vetor são pares.";
		System.out.println(resPar);
		read.close();
	}
}
