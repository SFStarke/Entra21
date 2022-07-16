package oop_lista_cinco;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	private String statusDiaRendimento;
	Calendar d = Calendar.getInstance();
	private int dia = d.get(Calendar.DAY_OF_MONTH);
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(String nome, int diaRendimento) {
		super.setNomeCliente(nome);
		this.diaRendimento = diaRendimento;
	}

	public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo() {// Calcula a taxa de rendimeto e atribui ao saldo.
		if (dia == this.getDiaRendimento()) {
			double taxa = super.getSaldo() * 0.006; // Referenta a média mensal de "0,6%" ao mês.
			double taxaDecimal = Math.round(taxa * 100.0) / 100.0;// Elimina números decimais exedentes pós virgula.
			super.setSaldo(taxa + super.getSaldo());
			this.setStatusDiaRendimento("Para hoje dia "+this.dia+", sua conta teve um rendimento de R$"+taxaDecimal);//Mudar para taxa
		}else {
			this.setStatusDiaRendimento("Para o dia "+this.getDiaRendimento()+", será o aniverssário do rendimento mensal de sua conta.");
		}
	}

	public String getStatusDiaRendimento() {
		return statusDiaRendimento;
	}

	public void setStatusDiaRendimento(String statusDiaRendimento) {
		this.statusDiaRendimento = statusDiaRendimento;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "\n###############################\nConta Poupanca nº " + super.getNumConta() + " | Titular: "
				+ super.getNomeCliente() + "\n[Saldo da conta: R$" + super.getSaldo()
				+ "]\n"+this.getStatusDiaRendimento()+"\n###############################\n";
	}
}
