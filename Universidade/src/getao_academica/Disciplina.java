package getao_academica;

public class Disciplina {
	private int  n6, n5;
	String disciplina[][] = new String[n6][n5];
	private int codego, duracao;
	
	public Disciplina() {}

	public int getCodego() {
		return codego;
	}

	public void setCodego(int codego) {
		this.codego = codego;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String[][] getNomeDisciplina() {
		return disciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina, int a, int b) {
		this.disciplina[a][b] = nomeDisciplina;
	}
	
}
