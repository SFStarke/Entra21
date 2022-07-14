package oop_lista_cinco;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	Calendar d = Calendar.getInstance();
	//private int dia = d.get(Calendar.DAY_OF_MONTH);
	
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

//	public void calcularNovoSaldo(int dia) {// Calcula a taxa de rendimeto e atribui ao saldo.
//		if (dia == ) {
//			
//		}
		
//		double taxa = super.getSaldo() * 0.006; // Referenta a média mensal de "0,6%" ao mês.
//		super.depositar(taxa);
//	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		System.out.println("Dia: "+d.get(Calendar.DAY_OF_MONTH));
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "\n###############################\nConta Poupanca nº "+super.getNumConta()+" | Cliente: "+super.getNomeCliente()+
				"\n[Saldo da conta: R$"+super.getSaldo()+"]\n[Rendimento mensal para o dia "+this.getDiaRendimento()+" de cada mês]"
						+ "\n###############################\n";
	}

}
