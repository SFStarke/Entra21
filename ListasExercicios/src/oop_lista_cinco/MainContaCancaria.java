package oop_lista_cinco;

public class MainContaCancaria {

	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		ContaPoupanca cp = new ContaPoupanca("Sérgio", 1, 500, "10");//String nomeCliente, int numConta, double saldo, String diaRendimento
		ContaEspecial ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int numConta, double saldo, double limite
		
		
		
		cp.depositar(10);
		cp.calcularNovoSaldo();
		cp.sacar(512);
		System.out.println(cp.toString());
		
	//	ce.depositar(10);
	//	ce.sacar(510);
		ce.depositar(510);
		ce.sacar(1010);
		ce.sacar(100);
		System.out.println(ce.toString());
		
		
	}
}
