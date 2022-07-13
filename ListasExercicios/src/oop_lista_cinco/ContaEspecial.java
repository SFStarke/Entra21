package oop_lista_cinco;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public ContaEspecial() {}

	public ContaEspecial(double limite) {
		this.limite = limite;
	}
	
	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		double saque = valor;
		if (super.getSaldo() >= valor) {// Saldo suficiente.
			super.setSaldo(super.getSaldo()-valor);
			System.out.println("Saque bem sucedido no valor de R$" + valor);
		} else if((super.getSaldo() > 0) && (this.getLimite() > 0) && (super.getSaldo() + this.getLimite() >= valor)){
			// Saldo Limite "especial" & saldo conta suficientes.
			System.out.println("Saque bem sucedido no valor de R$"+valor);
			double diferenca = 0;
			diferenca = saque - super.getSaldo();
			super.setSaldo(0);
			this.setLimite(this.getLimite()-diferenca); 
		}else if(super.getSaldo() + this.getLimite() < valor) {// Saldo indesponivel.
			System.out.println("Saldo insuficiente para saque");
		}
		//super.sacar(valor);
	}
	

	@Override
	public void depositar(double valor) {
		double tetoLimite = 1000;
		if(this.getLimite() < tetoLimite) { // Atribuição "limite" é o teto para referêcia, onde caso "totLimite" menor, primeiro será depositado no saldo especial "totLimite".
			if(valor + this.getLimite() <= tetoLimite) {
				this.setLimite(valor);
			}else if(valor + this.getLimite() >= tetoLimite){ // Condicional para dopositar valor, de modo a restituir primeiro o saldo especiaç, para então na conta.
				double depSaldo  = (valor + this.getLimite()) - tetoLimite;
				double depLimite =  valor - depSaldo;
				super.depositar(depSaldo); ;
				this.setLimite(depLimite);
			}
			System.out.println("Depósito Realizado no Valor de R$"+valor);
		}else if(this.getLimite() == tetoLimite) { // Caso saldo especial não tiver sido usado,  o valor é depositado direto na conta "saldo"
			super.setSaldo(super.getSaldo() + valor);
			System.out.println("Depósito Realizado no Valor de R$"+valor);
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "\n###############################\nConta Especial nº "+super.getNumConta()+
	" | Cliente: "+super.getNomeCliente()+"\n[Saldo da conta: R$"+super.getSaldo()+"] [Saldo Especial: R$" + limite + "]"
			+ "\n###############################\n";
	}
	
	
}
