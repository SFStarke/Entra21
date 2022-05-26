package exercicio_vetor;

import java.util.Scanner;
/*Criar um vetore inteiros com tamanho X, imprima o menor e
 *  o menor valor do mesmo e sua soma total.
*/
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] v = new int [4];
		int maior=0, menor=Integer.MAX_VALUE, tot=0;
		
		System.out.println("Digite valores para o vetor;\n"
				+ " Saiba qual é o seu maior valor seu menor valor e a soma total:\n"
				+ "***********************************\n");
		
		for(int i = 0; i < v.length; i++) {
			System.out.print("Vetor["+i+"]");
			v[i] = read.nextInt();
			if(maior < v[i]) {
				maior = v[i];
			}
			if(menor > v[i]) {
				menor = v[i];
			}
			tot += v[i];
		}
		for(int i = 0; i < v.length; i++) {
			if(v[i] == maior) {
				System.out.println("\nVetor["+i+"] "+v[i]+" é o de maior valor.");
			}else if(v[i] == menor){
				System.out.println("\nVetor["+i+"] "+v[i]+" é o de menor valor. ");
			}else {
			System.out.println("\nVetor["+i+"] "+v[i]);
			}
		}
		
		System.out.println("\nA soma dos valores do vetor é: "+tot);
		read.close();
	}
}
