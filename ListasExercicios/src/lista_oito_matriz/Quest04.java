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
	String [][] agenda = new String [31][24];
	Scanner read = new Scanner(System.in);
	boolean res = true;
	int dia = 0, hora = 0;
	String com = "";
	
	while(res == true) {
		System.out.print("Qual é o dia? ");
		dia = read.nextInt();
		System.out.print("Qual é a hora? ");
		hora = read.nextInt();
		System.out.print("Qual é o compromisso? ");
		com = read.next();
		agenda[dia][hora] = com;
		System.out.print("Deseja continuar? Sim[s] Não[n]");
		res = read.nextBoolean();
		
	}
	
	for (int i = 0; i < agenda.length; i++) {
		System.out.println();
		for (int j = 0; j < agenda[i].length; j++) {
			if(agenda[i][j] == null) {
				continue;
			}else {
				System.out.println(agenda[i][j]);
			}
		}
	}
	
	read.close();
}
}
