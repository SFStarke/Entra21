package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest17 {
	/*
	 * Questão 17 – Faça um programa que o usuário entre com o dia da semana de
1 a 7 e o programa imprima caso seja Domingo, segunda, Terça, Quarta,
Quinta, Sexta ou Sábado .

	 * */

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int dia;
		String diaSemana;
		
		System.out.println("Informe um nº de 1 a 7, e saiba qual corresponde seu dia da semana: ");
		dia = read.nextInt();
		
		switch(dia) {
			case 1:
				diaSemana = "Segunda Feira...";
				break;
			case 2:
				diaSemana = "Ter�a Feira...";
				break;
			case 3:
				diaSemana = "Quarta Feira...";
				break;
			case 4:
				diaSemana = "Quinta Feira...";
				break;
			case 5:
				diaSemana = "Sexta Feira...";
				break;
			case 6:
				diaSemana = "Sabado...";
				break;
			default:
				diaSemana = "Domingo...";
				break;
		}
		
		System.out.println("O dia nº "+dia+", corresponde ao dia da semana de "+ diaSemana);

		read.close();

	}

}
