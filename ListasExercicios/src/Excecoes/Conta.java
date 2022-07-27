package Excecoes;

public class Conta {

	private double saldo, limite, depositar, sacar;
	//private String infoLimite;//Informa se saldo esecial é ou não usada.
	private double limiteTeto; // Fixa o valor pré estabelecido limite

	public Conta() {}

	public Conta(double limiteTeto) {
		this.limiteTeto = limiteTeto;
	}

	public Conta(double saldo, double limite, double depositar, double sacar) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.depositar = depositar;
		this.sacar = sacar;
	}
	
	public void Sacando(double valor) throws ContaExcecao{ //Quem for invocar este método, deverá trata-lo.
		double saque = valor;
		if (this.getSaldo() >= valor) {// Saldo suficiente.
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("\n¨¨¨¨¨¨¨¨¨¨\nSaque bem sucedido no valor de R$" + valor);
			this.setSacar(valor);
		//	this.setInfoLimite("Não usado.");//Informa saldo esecial não usado.
		} else if((this.getSaldo() >= 0) && (this.getLimite() > 0) && (this.getSaldo() + this.getLimite() >= valor)){
			// Saldo Limite "especial" & saldo conta suficientes.
			System.out.println("\n¨¨¨¨¨¨¨¨¨¨\nSaque bem sucedido no valor de R$"+valor);
			double diferenca = 0;
				diferenca = saque - this.getSaldo();//Encontrar a diferençar para saque
				this.setSaldo(0);//Zerar saldo
				this.setLimite(this.getLimite()-diferenca); 
				this.setSacar(valor);
				System.out.println("Você usou o saldo especial no valor de R$"+diferenca);
				//this.setInfoLimite("Você usou o saldo especial no valor de R$"+diferenca);//Informa saldo esecial é realisado.
		}else if(this.getSaldo() + this.getLimite() < valor) {// Saldo indesponivel.
			throw new ContaExcecao();
		}
	}
	
	public void Depositando(double valor) {
double tetoLimite = this.limiteTeto;//Atributo para simples referência aos calculos de correção.
		
		if(this.getLimite() < tetoLimite) { // Atribuição "limite" é o teto para referêcia, onde caso "totLimite" menor, primeiro será depositado no saldo especial "totLimite".
			if(valor + this.getLimite() <= tetoLimite) {
				this.setLimite(this.getLimite() + valor);
		//		this.setInfoLimite("Á DISPOSIÇÃO");
				System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨\nDepósito Realizado em Saldo Especial no Valor de R$"+valor);	
				this.setDepositar(valor);
			}else if(valor + this.getLimite() >= tetoLimite){ // Condicional para dopositar valor, de modo a restituir primeiro o saldo especiaç, para então saldo daconta.
				double depSaldo  = (valor + this.getLimite()) - tetoLimite; // Valor para saldo da conta 
				double depLimite =  valor - depSaldo; // Valor para Saldo Especial
				this.setSaldo(depSaldo); //
				this.setLimite(this.getLimite() + depLimite);
		//		this.setInfoLimite("Á DISPOSIÇÃO");
				System.out.println("Depósito Realizado em Saldo Especial no Valor de R$"+(valor-depSaldo));
				System.out.println("Depósito Realizado em Saldo no Valor de R$"+depSaldo);
				this.setDepositar(valor);
			}
		}else if(this.getLimite() == tetoLimite) { // Caso saldo especial não tiver sido usado,  o valor é depositado direto na conta "saldo"
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨\nDepósito Realizado no Valor de R$"+valor);
			this.setDepositar(valor);
		}
	}
	
	@Override
	public String toString() {
		return "\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nConta [Saldo Conta: R$"+ saldo +" | Saldo Especial: R$"+ limite +
				"\n Depositado: " + depositar + " | Sacado: " + sacar + "]\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
	}

//	public String getInfoLimite() {
//		return infoLimite;
//	}
//
//	public void setInfoLimite(String infoLimite) {
//		this.infoLimite = infoLimite;
//	}

	public double getLimiteTeto() {
		return limiteTeto;
	}

	public void setLimiteTeto(double limiteTeto) {
		this.limiteTeto = limiteTeto;
	}
	
}
