package lista_oito_matriz;

import java.util.Iterator;
import java.util.Scanner;

/*4. Faça um programa para armazenar em uma matriz os 
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas inteiras, onde para cada uma destas 24 horas 
podemos associar um tarefa específica (compromisso agendado). 
O programa deve ter um menu onde o usuário indica o dia do mês 
que deseja agendar compromisso, a hora e em seguida entrando 
com o compromisso, ou então, o usuário pode também consultar a 
agenda, fornecendo o dia e a hora para obter o compromisso 
armazenado. Dica. Usar estrutura de repetição para escolha no 
Menu.
*/
public class Quest04 {
	public static void main(String[] args) {
		String[][] agenda = new String[31][24];
		Scanner read = new Scanner(System.in);
		String resAdd = "s", res = "";
		String com = "";
		boolean loop = true;

		System.out.println("Agenda de compromissos:\n" +
		"###################################\n");
		do {
			System.out.println("\n**************************************\n"
					+ "O que deseja fazer?\n" +
			"Adicionar compromisso [a], Consultar Compromissos [c] ou Encerrar [e]");
			res = read.next();
			if(res.equalsIgnoreCase("a") ^ res.equalsIgnoreCase("c") ^ res.equalsIgnoreCase("e") ) {
				
				if (res.equalsIgnoreCase("a")) {
					do {
						int dia = 0, hora = 0;
						System.out.print("Qual é o dia? ");
						dia = read.nextInt();
						System.out.print("Qual é a hora? ");
						hora = read.nextInt();
						com = read.nextLine();
						System.out.print("Qual é o compromisso? ");
						com = read.nextLine();
						
						agenda[--dia][--hora] = com;
						System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
								+ "Agendar Novo compromisso? Sim[s] Não[n]");
						
						resAdd = read.next();
					} while (resAdd.equalsIgnoreCase("s"));
				} else if(res.equalsIgnoreCase("c")){
					
					do {
					System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
							+ "Compromissos agendados para os dias:");
					for (int i = 0; i < agenda.length; i++) {
						for (int j = 0; j < agenda[i].length; j++) {
							if (agenda[i][j] == null) {
								continue;
							} else {
								int dia = i, hora = j;
								System.out.printf("\nDia: %d. Hora: %d.",++dia,++hora);
							}
						}
					}
					System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
							+ "Para consultar o seu compromisso, siga as instruções:\n"
							+ "Digite o dia: ");
					int dia = read.nextInt();
					System.out.print("Digite a hora: ");
					int hora = read.nextInt();
					if(agenda[--dia][--hora] != null) {
						System.out.println("\nSeu compromisso é:\n"+agenda[dia][hora]);
					}else {
						System.out.println("\nSEM COMPROMISSO AGENDADO...");
					}
					System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
							+ "Consultar novo compromisso? Sim[s] Não[n]");
					resAdd = read.next();
				} while (resAdd.equalsIgnoreCase("s"));
					
				}else if(res.equalsIgnoreCase("e")) {
					break;
				}
			}else {
				System.out.println("\n**********************************\n"
						+ "Comando errado...\nAceitos somente [a], [c] ou [e]:\n"
						+ "**************************************\n");
				continue;
			}

		} while (loop == true);

		read.close();
	}
}
