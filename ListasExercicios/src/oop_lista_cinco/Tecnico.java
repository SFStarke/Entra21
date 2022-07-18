package oop_lista_cinco;

public class Tecnico {
	private String cargo;
	private String departamento;
	private double auxTransporte;
	static private double auxAlimentacao;
	
	public Tecnico() {
	}
	
	public Tecnico(String cargo, String departamento) {
		super();
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getCargoTecnico() {
		return cargo;
	}
	
	public void setCargoTecnico(String cargoTecnico) {
		this.cargo = cargoTecnico;
	}
	
	public String getDepartamentoTecnico() {
		return departamento;
	}
	
	public void setDepartamentoTecnico(String departamentoTecnico) {
		this.departamento = departamentoTecnico;
	}
	
	public double getAuxTransporte() {
		return auxTransporte;
	}

	public void setAuxTransporte(double auxTransporte) {
		this.auxTransporte = auxTransporte;
	}

	public static double getAuxAlimentacao() {
		return auxAlimentacao;
	}

	public static void setAuxAlimentacao(double auxAlimentacao) {
		Tecnico.auxAlimentacao = auxAlimentacao;
	}

	@Override
	protected double calcSalario() {
		double salarioTotal = super.getSalarioBase() + this.auxTransporte + Tecnico.auxAlimentacao;
		return salarioTotal;
	}
	
	protected double calcSalario(double salarioBase, double auxTransporte,
								double auxAlimentacao, double quantHoras, double valorHora) {
		super.setSalarioBase(salarioBase);
		this.auxTransporte = auxTransporte;
		Tecnico.auxAlimentacao = auxAlimentacao;
		double salarioTotal = super.getSalarioBase() + this.auxTransporte 
							+ Tecnico.auxAlimentacao + (quantHoras * valorHora);
		return salarioTotal;
	}
	
	protected double calcSalario(double quantHoras, double valorHora) {
		double salarioTotal = super.getSalarioBase() + this.auxTransporte 
				+ Tecnico.auxAlimentacao + (quantHoras * valorHora);
		return salarioTotal;
	}

	@Override
	public String toString() {
		return " ##  TÉCNICO  ##" + "\n_________________" + super.toString() + "\nCargo: " + cargo + "\nDepartamento: " 
				+ departamento + "\nSalário base: " + super.getSalarioBase() + "\nAuxílio transporte: " + auxTransporte + "\nAuxilio alimentação: " + Tecnico.auxAlimentacao;
	}
}
