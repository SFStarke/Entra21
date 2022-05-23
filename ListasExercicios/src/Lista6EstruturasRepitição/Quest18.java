package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest18 {
	/*
	 * Questão 18 – Altere o programa anterior permitindo ao usuário informar as
	 * populações e as taxas de crescimento iniciais. Valide a entrada e permita
	 * repetir a operação
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int ano = 0;
		String res = "";
		float paisA = 0f, paisB = 0f, taxaA = 0f, taxaB = 0f;
		System.out.println("Projeção de crescimento populacional:\n##########################");
		
		do {
			System.out.print("\nNº populacional de Pais A? ");
			paisA = read.nextFloat();
			System.out.print("\nSua taxa de crescimento?\n Se ex: 3 porcento, digite 0,03 ");
			taxaA =read.nextFloat();
			System.out.print("\nNº populacional de Pais B? ");
			paisB = read.nextFloat();
			System.out.print("\nSua taxa de crescimento?\n Se ex: 3% digite 0,03 ");
			taxaB =read.nextFloat();
			
		while (paisA <= paisB) {
			paisA = (paisA * taxaA) + paisA;
			paisB = (paisB * taxaB) + paisB;
			ano++;
		}
		System.out.printf("\nO pais A levará %d anos para igualar e ou superar a população de Pais B.",ano);
		System.out.printf("\nPais A: %.2f. Pais B: %.2f\n############################\n"
				+ "Deseja contiinuar? [s] Sim [n] Não: \n"
				+ "########################",paisA, paisB);
		res = read.next();
		}while(res.equalsIgnoreCase("s"));
		read.close();
	}

}
