package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest04 {
	
	/*
	 * Quest�o_4: Escreva um PROGRAMA que leia o c�digo de um determinado produto e
	 * mostre a sua classifica��o.
	 */
	
	public static void main(String[] args) {
		
		String resposta = "";
		
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o código do produto: ");
		int cod = read.nextInt();
		
		if(cod == 1) {
			resposta = "Alimento não-perecivel.";
		}else if ((cod == 2)||(cod == 3)||(cod == 4)){
			resposta = "Alimento perecivel.";
		}else if((cod == 5) || (cod == 6)) {
			resposta = "Vestuário.";
		}else if(cod == 7) {
			resposta = "Higiene Pessoal.";
		}else if((cod >= 8) && (cod <= 15)) {
			resposta = "Limpeza e utensiliso domésticos.";
		}else {
			resposta = "INVÁLIDO";
		}
		
		System.out.println(resposta);

		read.close();
	}
}
