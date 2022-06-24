package oop_lista_dois;

public class Main_ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
        /*No Método abrirConta, são implementados as seguintes instruções; 
		 *Nº da Conta / Nome do titular / Valor inicial / Se é ou não cliente especial
         */
		System.out.println("*********************\nNOVA CONTA ");
		cc.abrirConta(1,"Sérgio", 1000, false);
		cc.saqueConta(1000);
	//	cc.saqueConta(1000);
	  cc.depositoConta(100);
		cc.saqueConta(1000);
		
		cc.consulta();
		
		System.out.println("*********************\nNOVA CONTA ");
		cc2.abrirConta(2, "Felipe", 1000, true);
		cc2.saqueConta(2001);
		cc2.depositoConta(10);
	    cc2.saqueConta(1510);
		cc2.consulta();
	}
}
