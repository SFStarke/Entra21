package oop_lista_cinco;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if(saldo >= valor) {// Saldo suficiente.
			saldo -= valor;
			System.out.println("Saque bem sucedido no valor de R$" + valor);
		}else if(saldo < valor){// Saldo indesponivel.
			System.out.println("Saldo Insuficente para Saque...");
		}
	}
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito Realizado no Valor de R$"+valor);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {//Para restringir, após a virgula, o nº das casas decimais, uso Classe "Math.rand"
		double saldo = Math.round(this.saldo * 100.0) / 100.0; // Elimina números decimais exedentes pós virgula.
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" +
	numConta + ".\nSaldo=" + saldo + "]";
	}
	
}
