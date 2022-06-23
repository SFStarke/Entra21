package oop_lista_dois;

/*2. Cria uma classe para representar uma conta corrente que possui um 
 *número, um saldo, um status que informa se ela é especial ou não, 
 *um limite. Desenvolva métodos para realizar saque (verificando se o 
 *cliente pode realizar saques), despositar dinheiro, consultar saldo e 
 *verificar se o cliente está usando cheque especial ou não. Desenvolva 
 *um programa para testar essa classe.
 */
public class ContaCorrente {
	int numero;
	float saldo, saque, deposito, limite;
	String nome, status, classe;
	boolean conta, especial;
	
	void abrirConta(int num, String nom, double dep, boolean esp) {
		numero = num;
		nome = nom;
		saldo = (float) dep;
		especial = esp;
		conta = true;
	}
	void saqueConta(double valor) {
		System.out.println("#########################");
		saque = (float) valor;
		if(saldo >= saque) {
			saldo -= saque;
			System.out.println("Saque bem sucedido no valor de R$"+valor+"...");
		}else {
			System.out.println("Saldo insuficiente...");
		}
	}
	void depositoConta(double valor) {
		System.out.println("#########################");
		deposito = (float) valor;
		saldo = deposito;
	}
	void consulta() {
		System.out.println("#########################");
		if(conta == false) {
			System.out.println("Conta inesistente...");
		}else {
			String res = especial == true ? "Cliente usa cheque especial\n": "Cliente não usa cheque especial\n";
			System.out.println(res+"Conta nº "+numero+". Titular: "+nome+"\n"
					+ "Saldo é R$"+saldo);
		}
	}
}
