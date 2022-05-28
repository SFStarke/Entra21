package lista_sete_vetores;

import java.util.Scanner;

/*Questão 13 - Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/
public class Quest13 {
	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[a.length];
		int x = a.length -1;
		Scanner read = new Scanner(System.in);
		System.out.println("Inversor de ordem numérica vetoriana: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(i+1+"º Valor: ");
			a[i] = read.nextInt();
			b[x] = a[i];
			x--;
		}
		System.out.print("Vetor A: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+". ");
		}
		System.out.print("\nVetor B: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(b[i]+". ");
		}
		read.close();
	}
}
