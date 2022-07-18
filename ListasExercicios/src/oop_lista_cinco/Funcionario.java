package oop_lista_cinco;

public class Funcionario {
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private String ctps;
	private double salarioBase;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String endereco, int telefone, int cpf, String ctps) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.ctps = ctps;
	}

	public String getNomeFuncionario() {
		return nome;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nome = nomeFuncionario;
	}
	
	public String getEnderecoFuncionario() {
		return endereco;
	}
	
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.endereco = enderecoFuncionario;
	}
	
	public int getTelefoneFuncionario() {
		return telefone;
	}
	
	public void setTelefoneFuncionario(int telefoneFuncionario) {
		this.telefone = telefoneFuncionario;
	}
	
	public int getCpfFuncionario() {
		return cpf;
	}
	
	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpf = cpfFuncionario;
	}
	
	public String getCtpsFuncionario() {
		return ctps;
	}
	
	public void setCtpsFuncionario(String ctpsFuncionario) {
		this.ctps = ctpsFuncionario;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	protected abstract double calcSalario();

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nCPF: " + cpf
				+ "\nCTPS: " + ctps;
	}
}
