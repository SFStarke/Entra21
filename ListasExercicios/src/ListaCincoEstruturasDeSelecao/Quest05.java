package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest05 {
	/*
	 * Questão_5: Elabore um PROGRAMA que, dada a idade de
	um nadador, classifique-o em uma categoria:
	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade;
		String categoria;
		
		System.out.print("Informe a idade do nadador: ");
		idade = read.nextInt();
		System.out.println();
		
		if ((idade >= 5) && (idade <= 7)) {
			categoria = "Infantil A.";
		} else if((idade >= 8) && (idade <= 10)){
			categoria = "Infantil B.";
		}else if ((idade >= 11) && (idade <= 13)) {
			categoria = "Juvenil A.";
		}else if ((idade >= 14) && (idade <= 17)) {
			categoria = "Juvenil B";
		}else {
			categoria = "Adulto.";
		}
		
		System.out.printf("Sua categoria é %s",categoria,"\n");

		read.close();

	}

}
