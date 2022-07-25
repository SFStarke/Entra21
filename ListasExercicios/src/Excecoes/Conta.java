package Excecoes;

public class Conta {

	private double saldo, limite, depositar, sacar;

	public Conta() {
	}

	public Conta(double saldo, double limite, double depositar, double sacar) {
		super();
		this.saldo = saldo;
		this.limite = limite;
		this.depositar = depositar;
		this.sacar = sacar;
	}
	
	public void Sacando() throws ContaExcecao{ //Para gerar "criar" própria exceção, se faz necessário
		
	}
	
	public void Depositando() {
		
	}
	
	@Override
	public String toString() {
		return "Conta [Saldo: " + saldo + ", Limite: " + limite + "\n Depositado: " + depositar + " | Sacado: " + sacar + "]";
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
}
