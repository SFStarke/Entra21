package oop_lista_cinco;

//import java.util.Calendar;

public class MainContaCancaria {

	public static void main(String[] args) {
		//Calendar d = Calendar.getInstance();
		ContaPoupanca cp = new ContaPoupanca("Sérgio", 1, 500, 14);//String nomeCliente, int numConta, double saldo, String diaRendimento
		ContaEspecial ce = new ContaEspecial("Felipe",2, 500, 1000); // String nomeCliente, int numConta, double saldo, double limite
		
		
		System.out.println("\nCONTA POUPANÇA:\n");
		cp.depositar(10);
		cp.calcularNovoSaldo();
		cp.sacar(511);
		System.out.println(cp.toString());
		
		System.out.println("CONTA ESPECIAL:\n");
	//	ce.depositar(0);
		ce.sacar(600);
		ce.sacar(50);
		ce.depositar(145);
		ce.sacar(5);
		ce.depositar(510);
	//	ce.sacar(0);
		System.out.println(ce.toString());
		
	}
}
