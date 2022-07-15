package oop_lista_cinco;

import java.util.Scanner;

//import java.util.Calendar;

public class MainContaCancaria {

	public static void main(String[] args) {
		//Calendar d = Calendar.getInstance();
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaEspecial especial = new ContaEspecial();
		Scanner read = new Scanner(System.in);
		boolean loop = true;
		String resLoop;
		do {
			
			do {
				System.out.println("Para Continuar [ Enter ] | Para Sair [ S + Enter ]");
				resLoop = read.next();
				
			}while();//FALTA TERMINAR AQUI....... POR ISSO O BUG............
			loop = resLoop.equalsIgnoreCase("s") ? false: true;
		}while(loop ==true);
		
		read.close();
	}
	/*
		ContaPoupanca cp = new ContaPoupanca("Sérgio", 1, 500, 10);//String nomeCliente, int numConta, double saldo, String diaRendimento
		ContaEspecial ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int numConta, double saldo, double limite
		
		System.out.println("\nCONTA POUPANÇA:\n");
		cp.depositar(10);
		cp.sacar(511);
		cp.calcularNovoSaldo();
		System.out.println(cp.toString());
		
		System.out.println("CONTA ESPECIAL:\n");
		ce.depositar(0);
		ce.sacar(600);
		ce.sacar(600);
		ce.depositar(600);
		ce.sacar(5);
		ce.depositar(510);
		ce.sacar(0);
		System.out.println(ce.toString());
	 */
}
