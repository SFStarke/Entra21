package getao_academica;

public class Curso {
	private int codigo, duracao;
	private String nomeCurso;
	
	public Curso(String nome, int cod, int duracao) {
		this.nomeCurso = nome;
		this.codigo = cod;
		this.duracao = duracao;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
}
