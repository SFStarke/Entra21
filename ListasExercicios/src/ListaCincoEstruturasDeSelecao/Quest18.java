package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest18 {
	/*
	 * Questão 18 – Faça um programa que o usuário entra com uma letra, e o
programa informa se é uma vogal ou consoante.
	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char letra;
		
		System.out.println("Digite em letra minúscula e saiba se é vogal ou consoante:");
		letra = read.next().charAt(0);
		letra = Character.toLowerCase(letra);
		
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
			System.out.println("A letra é uma vogal...");
		} else {
			System.out.println("A letra é uma consoante...");
		}
		read.close();
	}
}
