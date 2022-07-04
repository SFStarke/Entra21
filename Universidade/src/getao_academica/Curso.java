package getao_academica;

public class Curso {
	private int codigo, duracao;
	private String nomeCurso;
	
	public Curso() {}
	
	public Curso(String nome, int cod, int duracao) {
		this.nomeCurso = nome;
		this.codigo = cod;
		this.duracao = duracao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
}
