package oop_lista_dois.tres;

/*2. Cria uma classe para representar uma conta corrente que possui um 
 *número, um saldo, um status que informa se ela é especial ou não, 
 *um limite. Desenvolva métodos para realizar saque (verificando se o 
 *cliente pode realizar saques), despositar dinheiro, consultar saldo e 
 *verificar se o cliente está usando cheque especial ou não. Desenvolva 
 *um programa para testar essa classe.
 */
public class ContaCorrente {
private	int numero;
private	float saldo, saque, deposito, limite = 1000f, totLimite = 1000f;
private	String nome, status, classe;
private	boolean conta, especial;

	public ContaCorrente() {}
	// Método que permite movimentação só em caso de abertura confirmada.
	public void abrirConta(int num, String nom, float dep, boolean esp) {
		numero = num;
		nome = nom;
		saldo = (float) dep;
		especial = esp;
		conta = true;
	}

	public void saqueConta(float valor) {
	// Método que efetua saques com restrinções; Especial ou não. Saldo suficiente ou não...	
		saque = (float) valor;
		if (especial == true) {// Caso especial, esterá condicionado...
			if (saldo >= saque) {// Saldo suficiente.
				saldo -= saque;
				System.out.println("Saque bem sucedido no valor de R$" + valor);
			} else if((saldo > 0) && (totLimite > 0) && (saldo + totLimite >= saque)){
				// Saldo Limite "especial" & saldo conta suficientes.
				System.out.println("Saque bem sucedido no valor de R$"+valor);
				float diferenca = 0;
				diferenca = saque - saldo;
				saldo = 0;
				totLimite -= diferenca;
			}else if(saldo + totLimite < saque) {// Saldo indesponivel.
				System.out.println("Saldo insuficiente para saque");
			}
		} else if (especial == false) {// Caso conta não for especial...
			if(saldo >= saque) {// Saldo suficiente.
				saldo -= saque;
				System.out.println("Saque bem sucedido no valor de R$" + valor);
			}else if(saldo < saque){// Saldo indesponivel.
				System.out.println("Saldo Insuficente para Saque...");
			}
		}
	}
	// Método que efetua depósito condicionalmente; Conta Especial ou não. Conta ativa ou não...	
	public void depositoConta(float valor) {
		deposito =  valor;
		if(especial == false) {// Caso conta não for especial...
		saldo += deposito;
		System.out.println("Depósito Realizado no Valor de R$"+valor);
		}else {// Caso conta especial, esterá condicionado...
			if(totLimite < limite) { // Atribuição "limite" é o teto para referêcia, onde caso "totLimite" menor, primeiro será depositado no saldo especial "totLimite".
				if(valor + totLimite <= limite) {
					totLimite +=  valor;
				}else if(valor + totLimite >= limite){ // Condicional para dopositar valor, de modo a restituir primeiro o saldo especiaç, para então na conta.
					float depSaldo  = (valor + totLimite) - limite;
					float depLimite =  valor - depSaldo;
					this.saldo += depSaldo;
					this.totLimite += depLimite;
				}
				System.out.println("Depósito Realizado no Valor de R$"+valor);
			}else if(totLimite == limite) { // Caso saldo especial não tiver sido usado,  o valor é depositado direto na conta "saldo"
				this.saldo += valor;
				System.out.println("Depósito Realizado no Valor de R$"+valor);
			}
		}
	}

	public void consulta() {
		if (conta == false) {
			System.out.println("Conta inesistente...");
		}
		if (especial == false){
			System.out.println("\nSTATUS DA CONTA\nCliente não usa cheque especial\nConta nº " +
		numero + ". Titular: " + nome + "\n" + "Saldo é R$" + saldo);
		}else if(especial == true) {
			System.out.println("\nSTATUS DA CONTA\nCliente usa cheque especial\nConta nº " +
		numero + ". Titular: " + nome + "\n" + "Saldo: R$" + saldo+"\n"
					+ "Saldo Limite Especial: R$"+totLimite);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTotLimite() {
		return totLimite;
	}

	public void setTotLimite(float totLimite) {
		this.totLimite = totLimite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public boolean isConta() {
		return conta;
	}

	public void setConta(boolean conta) {
		this.conta = conta;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

}
