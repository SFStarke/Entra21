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
	float saldo, saque, deposito, limite = 1000f;
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
		saque = (float) valor;
		if (especial == true) {
			if (saldo >= saque) {
				saldo -= saque;
				System.out.println("Saque bem sucedido no valor de R$" + valor);
			} else if((saldo > 0)&&(limite > 0)&&(saldo + limite >= saque)){
				System.out.println("Saque bem sucedido no valor de R$"+valor);
				double diferenca = 0;
				diferenca = saque - saldo;
				saldo = 0;
				limite -= diferenca;
			}else if(saldo + limite < saque) {
				System.out.println("Saldo insuficiente para saque");
			}
		} else if (especial == false) {
			if(saldo >= saque) {
				saldo -= saque;
				System.out.println("Saque bem sucedido no valor de R$" + valor);
			}else if(saldo < saque){
				System.out.println("Saldo Insuficente para Saque...");
			}
		}
	}

	void depositoConta(double valor) {
		deposito = (float) valor;
		saldo += deposito;
		System.out.println("Depósito Realizado no Valor de R$"+valor);
	}

	void consulta() {
		if (conta == false) {
			System.out.println("Conta inesistente...");
		}
		if (especial == false){
			String res = especial == true ? "\nSTATUS DA CONTA\nCliente usa cheque especial\n" : "\nSTATUS DA CONTA\nCliente não usa cheque especial\n";
			System.out.println(res + "Conta nº " + numero + ". Titular: " + nome + "\n" + "Saldo é R$" + saldo);
		}else if(especial == true) {
			String res = especial == true ? "\nSTATUS DA CONTA\nCliente usa cheque especial\n" : "\nSTATUS DA CONTA\nCliente não usa cheque especial\n";
			System.out.println(res + "Conta nº " + numero + ". Titular: " + nome + "\n" + "Saldo: R$" + saldo+"\n"
					+ "Saldo Limite Especial: R$"+limite);
		}
	}
}
