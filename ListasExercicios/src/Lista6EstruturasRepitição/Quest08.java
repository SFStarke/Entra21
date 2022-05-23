package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest08 {
	/*
	 * Questão 8 - Criar um programa que leia os limites inferior e superior de um
	 * intervalo e imprima todos os números pares no intervalo aberto e seu
	 * somatório. Suponha que os números digitados são um intervalo crescente.
	 * Exemplo: Limite inferior: 3 Limite superior: 12 Saída: 4 6 8 10 Soma: 28
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = 1, inferior = 10000, superior = 0, somPar = 0;
		String saida = "";
		
		System.out.print("Digite um numero para limite inferior: ");
		inferior = read.nextInt();
		System.out.print("\nDigite um numero para limite superior: ");
		superior = read.nextInt();
		
		for(int x = inferior; x < superior; x++) {
				if (inferior == x) {
					continue;
				}else if(x % 2 == 0){
					somPar += x;
					saida += x+". ";
				}
		}
		System.out.printf(
				"\n***************************\nLimite inferiro: %d\nLimite Superior: %d\n" 
		+ "Saída: %s\nSoma: %d ",inferior, superior, saida, somPar);
		
		
		/*Este algoritmo abaixo, foi elaborado com base á uma má interpretação da questão 08.
		 *Contudo, deixo para futura tentativa em fazer sua execução.
		 * 
		 * System.out.println("Seletor e calculo  de nº\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
				+ "Digite quantos numeros quiser em ordem crescente, e \n"
				+ "obtenha seu limite inferior e superior e a soma dos números pares\n" 
				+ "de seu intervalo aberto.");
		 while (n != 0){
			 n = read.nextInt();
			 
			if (n == 0) {
				break;
			}
			superior = n < superior ? superior : n;
			inferior = n > inferior ? inferior : n;
			if (inferior == n) {
				continue;
			}else if(n % 2 == 0) {
				somPar += n;
				saida += n+". ";
			}
		} 

		somPar = inferior % 2 == 0 ? somPar - inferior : somPar;
		somPar = superior % 2 == 0 ? somPar - superior : somPar;
		
		System.out.printf(
				"\n***************************\nLimite inferiro: %d\nLimite Superior: %d\n" 
		+ "Saída: %s\nSoma: %d ",
				inferior, superior, saida, somPar);*/

		read.close();
	}
}
