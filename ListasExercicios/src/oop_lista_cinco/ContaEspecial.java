package oop_lista_cinco;

public class ContaEspecial extends ContaBancaria {
	private double limite;
	private String infoLimite;//Informa se saldo esecial é ou não usada.

	public ContaEspecial() {this.setInfoLimite("Á DISPOSIÇÃO");}

	public ContaEspecial(double limite) {
		this.limite = limite;
		this.setInfoLimite("Á DISPOSIÇÃO");
	}
	
	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
		this.setInfoLimite("Á DISPOSIÇÃO");
	}

	@Override
	public void sacar(double valor) {
		double saque = valor;
		if (super.getSaldo() >= valor) {// Saldo suficiente.
			super.setSaldo(super.getSaldo()-valor);
			System.out.println("Saque bem sucedido no valor de R$" + valor);
			this.setInfoLimite("Não usado.");//Informa saldo esecial não usado.
		} else if((super.getSaldo() >= 0) && (this.getLimite() > 0) && (super.getSaldo() + this.getLimite() >= valor)){
			// Saldo Limite "especial" & saldo conta suficientes.
			System.out.println("Saque bem sucedido no valor de R$"+valor);
			double diferenca = 0;
				diferenca = saque - super.getSaldo();//Encontrar a diferençar para saque
				super.setSaldo(0);//Zerar saldo
				this.setLimite(this.getLimite()-diferenca); 
				this.setInfoLimite("Você usou o saldo especial no valor de R$"+diferenca);//Informa saldo esecial é realisado.
		}else if(super.getSaldo() + this.getLimite() < valor) {// Saldo indesponivel.
			System.out.println("Saldo insuficiente para saque");
			this.setInfoLimite("INDISPONÍVEL");
		}
	}

	@Override
	public void depositar(double valor) {
		double tetoLimite = 1000;//Atributo para simples referência aos calculos de correção.
		
		if(this.getLimite() < tetoLimite) { // Atribuição "limite" é o teto para referêcia, onde caso "totLimite" menor, primeiro será depositado no saldo especial "totLimite".
			if(valor + this.getLimite() <= tetoLimite) {
				this.setLimite(this.getLimite() + valor);
				this.setInfoLimite("Á DISPOSIÇÃO");
			}else if(valor + this.getLimite() >= tetoLimite){ // Condicional para dopositar valor, de modo a restituir primeiro o saldo especiaç, para então saldo daconta.
				double depSaldo  = (valor + this.getLimite()) - tetoLimite; // Valor para saldo da conta 
				double depLimite =  valor - depSaldo; // Valor para Saldo Especial
				super.depositar(depSaldo); //
				this.setLimite(this.getLimite() + depLimite);
				this.setInfoLimite("Á DISPOSIÇÃO");
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

	public String getInfoLimite() {
		return infoLimite;
	}

	public void setInfoLimite(String infoLimite) {
		this.infoLimite = infoLimite;
	}

	@Override
	public String toString() {
		return "\n###############################\nConta Especial nº "+super.getNumConta()+
	" | Cliente: "+super.getNomeCliente()+"\n[Saldo da conta: R$"+super.getSaldo()+"] [Saldo Especial: R$" + limite + "]"
			+ "\nSaldo Especial: "+this.getInfoLimite()+"\n###############################\n";
	}
	
	
}
