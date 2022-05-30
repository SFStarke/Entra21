package lista_sete_vetores;

import java.util.Scanner;

/*Questão 11 - Números palíndromos são aqueles que escritos da direita para a
esquerda têm o mesmo valor quando escritos da esquerda para a
direita. Exemplo: 545; 789987; 97379; 123454321; etc.
Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é
um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
último, se o segundo elemento do vetor é igual ao penúltimo e assim
por diante até verificar todos os elementos ou chegar a conclusão que
o vetor não é um palíndromo.
*/
public class Quest11 {
	public static void main(String[] args) {
		int[] a = new int[10];
		boolean res = false;
		int x = a.length - 1;
		String numeros = "";
		Scanner read = new Scanner(System.in);
		
		System.out.println("Palíndromo\n*************\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "º valor: ");
			a[i] = read.nextInt();
			numeros += a[i]+". ";
		}
		for (int i = 0; i < a.length/2; i++) {
			if (a[i] == a[x]) {
				x--;
				res = true;
			} else {
				x--;
				res = false;
				 break;
			}
		}
		System.out.println("\n####################\nVetor A: "+numeros+"\n");
		String texto = (res == true) ? "Este vetor, É uma sequência de números políndromos."
				: "Este vetor, NÃO É uma sequência de números políndromos.";
		System.out.println(texto);
		read.close();

	}
}
