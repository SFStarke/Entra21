package oop_lista_cinco;

import java.util.Scanner;

//import java.util.Calendar;

public class MainContaCancaria {

	public static void main(String[] args) {
		// Calendar d = Calendar.getInstance();
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaEspecial especial = new ContaEspecial();
		Scanner read = new Scanner(System.in);
		boolean loop = true; 
		boolean loop2 = true;
		String resLoop, resOperacao, resOpcaoSaqueDeposito;
		do {// Início looping Main
			do {
				System.out.println("Quais das contas deseja cadastra?\n"
						+ "[ CP ] Conta Poupança\n[ CE ] Conta Especial");
				resOperacao = read.next();
				if(! resOperacao.equalsIgnoreCase("CP") && ! resOperacao.equalsIgnoreCase("CE")) {
					System.out.println("Comando Invalido:\nTENTE NOVAMENTE\n");
				}else {
					break;
				}
			}while(loop == true);
			read.nextLine();
			if(resOperacao.equalsIgnoreCase("CP")) {// Condicional Conta Poupança
				System.out.print("Informe o nome do titular: ");
				poupanca.setNomeCliente(read.nextLine());
				System.out.print("Informe o nº da conta: ");
				poupanca.setNumConta(read.nextInt());
				System.out.print("Informe o saldo inicial: ");
				poupanca.setSaldo(read.nextDouble());
				System.out.print("Informe dia aniverssário de rendimento: ");
				poupanca.setDiaRendimento(read.nextInt());
				poupanca.calcularNovoSaldo();
				
				do {
					String res;
					System.out.println(poupanca.toString());
					System.out.print("\n*******************\nESCOLHA UMA DAS OPÇÕES:\n"
							+ "[ 1 ] Saque\n[ 2 ] Depósito\n[ 3 ] Sair da Opção\n*******************\n");
					resOpcaoSaqueDeposito = read.next();
					if(! resOpcaoSaqueDeposito.equalsIgnoreCase("1") && ! resOpcaoSaqueDeposito.equalsIgnoreCase("2") && ! resOpcaoSaqueDeposito.equalsIgnoreCase("3")) {// Condicional para restrinção de comandos
						System.out.println("Comando Invalido:\nTENTE NOVAMENTE\n");
						continue;
					}else if(resOpcaoSaqueDeposito.equalsIgnoreCase("1")){
						System.out.print("Valor do saque: ");
						poupanca.sacar(read.nextDouble());
					}else if(resOpcaoSaqueDeposito.equalsIgnoreCase("2")) {
						System.out.print("Valor do depósito: ");
						poupanca.depositar(read.nextDouble());
					}else if(resOpcaoSaqueDeposito.equalsIgnoreCase("3")) {
						break;
					}
					System.out.println(poupanca.toString());
					System.out.println("Deseja realizar outra transação?\n[ S ] Sin\n[ N ] Não\n");
				 res = read.next();
				loop2 = res.equalsIgnoreCase("s") ? true: false;	
					
				}while(loop2 == true);
				
			}else if(resOperacao.equalsIgnoreCase("CE")){// Condicional Conta Especial
				//ContaEspecial ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int numConta, double saldo, double limite
				
			}
			System.out.println("RESULTADO DA TRANSAÇÃO DE HOJE:");
			System.out.println(poupanca.toString());
			do {// Looping para restrinção de apenas dois comandos "C e ou S"
				System.out.println("Para Criar Nova Conta: [ C + Enter ]\n\n"
						+ "            Para Sair: [ S + Enter ]");
				resLoop = read.next();
				if (!resLoop.equalsIgnoreCase("s") && !resLoop.equalsIgnoreCase("c")) {
					System.out.println("Comando Invalido:\nTENTE NOVAMENTE\n");
				}else {
					break;
				}
			} while (!resLoop.equalsIgnoreCase("s"));// Término do looping da restrinção de comandos "C e ou S".
			loop = resLoop.equalsIgnoreCase("s") ? false : true;
		} while (loop == true); // Fim looping Main
		
		System.out.println("\nO B R I G A D O   P O R   P A R T I C I P A R\n             ESPERO QUE TENHA GOSTADO\n\nF I Q U E   B E M\nAtenciosamente: Rafael Gaspar, Emaqnuel Girardi e Sérgio F. Starke");
		read.close();
	}
	/*
	 * ContaPoupanca cp = new ContaPoupanca("Sérgio", 1, 500, 10);//String
	 * nomeCliente, int numConta, double saldo, String diaRendimento ContaEspecial
	 * ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int
	 * numConta, double saldo, double limite
	 * 
	 * System.out.println("\nCONTA POUPANÇA:\n"); cp.depositar(10); cp.sacar(511);
	 * cp.calcularNovoSaldo(); System.out.println(cp.toString());
	 * 
	 * System.out.println("CONTA ESPECIAL:\n"); ce.depositar(0); ce.sacar(600);
	 * ce.sacar(600); ce.depositar(600); ce.sacar(5); ce.depositar(510);
	 * ce.sacar(0); System.out.println(ce.toString());
	 */
}
