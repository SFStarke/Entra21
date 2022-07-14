package oop_lista_cinco;

import java.util.Calendar;

public class MainContaCancaria {

	public static void main(String[] args) {
		Calendar d = Calendar.getInstance();
	//	int dia = d.get(Calendar.DAY_OF_MONTH);
		ContaBancaria c = new ContaBancaria();
		ContaPoupanca cp = new ContaPoupanca("Sérgio", 1, 500, 10);//String nomeCliente, int numConta, double saldo, String diaRendimento
		ContaEspecial ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int numConta, double saldo, double limite
		
		
		
		cp.depositar(10);
	//	cp.calcularNovoSaldo();
		cp.sacar(510);
		System.out.println(cp.toString());
		
	//	ce.depositar(10);
		ce.sacar(510);
	//	ce.depositar(510);
	//	ce.sacar(1010);
	//	ce.depositar(510);
	//	ce.sacar(500);
		System.out.println(ce.toString());
		
		
	}
}
