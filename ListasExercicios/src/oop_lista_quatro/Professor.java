package oop_lista_quatro;

public class Professor {
	private String nomeProfessor, departamento, email;

	public Professor() {
	}

	public  String getNomeProff() {
		return this.nomeProfessor;
	}

	public  void setNomeProff(String nome) {
		this.nomeProfessor = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
