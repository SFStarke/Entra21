package oop_lista_cinco;

public class ContaPoupanca extends ContaBancaria {
	private String diaRendimento;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String nome, String diaRendimento) {
		super.setNomeCliente(nome);
		this.diaRendimento = diaRendimento;
	}

	public ContaPoupanca(String nomeCliente, int numConta, double saldo, String diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo() {// Calcula a taxa de rendimeto e atribui ao saldo.
		double taxa = super.getSaldo() * 0.006; // Referenta a média mensal de "0,6%" ao mês.
		super.depositar(taxa);
	}

	public String getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "\n###############################\nConta Poupanca nº "+super.getNumConta()+" | Cliente: "+super.getNomeCliente()+
				"\n[Saldo da conta: R$"+super.getSaldo()+"]\n[Rendimento mensal para o dia "+this.getDiaRendimento()+" de cada mês]"
						+ "\n###############################\n";
	}

}
