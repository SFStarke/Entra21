package oop_lista_dois;

public class Main_ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.abrirConta(1,"Sérgio", 1500, false);
		cc.consulta();
		cc.saqueConta(1501);
		cc.saqueConta(1000);
		cc.consulta();
	}
}
