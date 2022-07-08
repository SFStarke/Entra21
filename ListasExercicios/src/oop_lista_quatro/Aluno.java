package oop_lista_quatro;

public class Aluno {
	private String nomeAluno, matricula;
	private float notas[] = new float[2];

	public Aluno() {
	}

	public Aluno(String nome, String matricula) {
		this.nomeAluno = nome;
		this.matricula = matricula;
	}

	public String aval() {// Método de avaliação para aprovação ou não.
		return "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nNome do Aluno: " + this.nomeAluno +
				". Matricula nº " + this.matricula + ".";
	}

	public String getNome() {
		return nomeAluno;
	}

	public void setNome(String nome) {
		this.nomeAluno = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(int i, float notas) {
		this.notas[i] = notas;
	}
}
