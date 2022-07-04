package getao_academica;

public class Tecnico {
	private String cargo, departamento;
	Funcionario fun = new Funcionario();

	public Tecnico() {}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
