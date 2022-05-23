package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Switch_DiaSemana01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int dia;
		String diaSemana;
		
		System.out.println("Informe do dia da semana em nº de 1 a 7: ");
		dia = read.nextInt();
		
		switch(dia) {
			case 1:
				diaSemana = "Segunda Feira...";
				break;
			case 2:
				diaSemana = "Terça Feira...";
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
