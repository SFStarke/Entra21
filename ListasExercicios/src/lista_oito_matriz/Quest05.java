package lista_oito_matriz;

import java.util.Scanner;

public class Quest05 {
	/*
	 * 5. Modifique o programa anterior de maneira a guardar os compromissos de todo
	 * o ano, organizados por mês, dia e hora (só 8 horas por dia).
	 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		String[][][] agenda = new String[12][][];
		int mes = 0;
		int dia = 0;
		int hora = 0;

		for (int i = 0; i < agenda.length; i++) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
				agenda[i] = new String[31][8];
			else if (i == 3 || i == 5 || i == 8 || i == 10)
				agenda[i] = new String[30][8];
			else
				agenda[i] = new String[28][8];
		}

		while (true) {
			System.out.print("Informe 'A' para acessar informações na agenda,\n "
					+ "'I' para incluir ou 'F' para fechar a agenda: ");
			char ch = ent.next().charAt(0);

			if (ch == 'f' || ch == 'F')
				break;

			else if (ch == 'i' || ch == 'I') {
				System.out.print("\nInforme o mês pelo seu respectivo número: ");
				mes = ent.nextInt();

				if (mes >= 1 && mes <= 12) {
					System.out.print("Informe o dia: ");
					dia = ent.nextInt();

					if (dia > 0 && dia <= agenda[mes - 1].length) {
						System.out.print("Informe a hora(somente hora exata, das 9 às 16): ");
						hora = ent.nextInt();

						if (hora >= 9 && hora <= 16) {
							ent.nextLine();
							System.out.printf("%nAgenda, mês %d, dia %d, %d horas...%nEscreva o compromisso: ", mes,
									dia, hora);
							agenda[mes - 1][dia - 1][hora - 9] = ent.nextLine();
							System.out.println();
						} else
							System.out.println("\nHora incorreta.\nVoltando ao inicio.\n");

					} else
						System.out.println("\nDia inválido.\nRepita a ação.\n");

				} else
					System.out.println("\nMês inválido.\nFaça novamente\n");

			} else if (ch == 'a' || ch == 'A') {
				System.out.print("\nInforme o mês pelo seu respectivo número: ");
				mes = ent.nextInt();

				if (mes >= 1 && mes <= 12) {
					System.out.print("Informe o dia: ");
					dia = ent.nextInt();

					if (dia > 0 && dia <= agenda[mes - 1].length) {
						System.out.print("Informe a hora(somente hora exata, das 9 às 16): ");
						hora = ent.nextInt();

						if (hora >= 9 && hora <= 16) {
							System.out.printf("%nAgenda, mês %d, dia %d, %d horas...%nImprindo informações...%n", mes,
									dia, hora);
							System.out.println(
									"_________________________________________________________________________________________________________________");
							System.out.println("Compromisso agendado: " + agenda[mes - 1][dia - 1][hora - 9]);
							System.out.println(
									"_________________________________________________________________________________________________________________\n");
						} else
							System.out.println("\nHora incorreta.\nVoltando ao inicio.\n");

					} else
						System.out.println("\nDia inválido.\nRepita a ação.\n");

				} else
					System.out.println("\nMês inválido.\nFaça novamente\n");

			} else
				System.out.println("\nInformação inválida...\nTente novamente.\n");
		}

		System.out.println("\nAgenda fechada.");

		ent.close();

	}

}
