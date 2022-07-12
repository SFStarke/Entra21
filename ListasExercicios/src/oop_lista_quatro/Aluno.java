package oop_lista_quatro;

public class Aluno {
	private String nomeAluno, matricula;
	private float notas[] = new float[4];
	float mediaAluno;

	public Aluno() {
	}

	public Aluno(String nome, String matricula) {
		this.nomeAluno = nome;
		this.matricula = matricula;
	}
	
	public String showStudent() {// Método de Apresentação do aluno e avaliação para aprovação ou não.
		String notas = "";
		float soma = 0f;
		for (int i = 0; i < this.notas.length; i++) {
			notas += this.getNotas()[i] + " | ";
			soma += this.getNotas()[i];
		}
		float media = soma/this.notas.length;
		this.mediaAluno = media;
		String aval = media>=7 ? "APROVADO(a)": "REPROVADO(a)";
		return "\nNome do(a) Aluno(a): " + this.nomeAluno + ". Matricula nº " +
		this.matricula + "\nNotas: " + notas+"\nCom Média "+media+", o aluno está: "+aval;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
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

	public void setNotas(int n, float notas) {
		this.notas[n] = notas;
	}

	public float getMediaAluno() {
		return mediaAluno;
	}

	public void setMediaAluno(float mediaAluno) {
		this.mediaAluno = mediaAluno;
	}
	
}
