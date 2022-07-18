package oop_lista_cinco;

public class Curso {
	private Disciplina[] disciplina;
	private Aluno[] aluno;
	private String nome;
	private String codigo;
	private String duracao;
	
	public Curso(int d, int a) {
		disciplina = new Disciplina[d];
		this.aluno = new Aluno[a];
	}
	
	public Curso(String nome, String codigo, String duracao) {
		this.nome = nome;
		this.codigo = codigo;
		this.duracao = duracao;
	}

	public Aluno getAluno(int i) {
		return aluno[i];
	}

	public void setAluno(int i, Aluno aluno) {
		this.aluno[i] = aluno;
	}

	public Disciplina getDisciplina(int i) {
		return disciplina[i];
	}
	
	public void setDisciplina(int i, Disciplina disciplina) {
		this.disciplina[i] = disciplina;
	}

	public String getNomeCurso() {
		return nome;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nome = nomeCurso;
	}
	
	public String getCodigoCurso() {
		return codigo;
	}
	
	public void setCodigoCurso(String codigoCurso) {
		this.codigo = codigoCurso;
	}
	
	public String getDuracaoCurso() {
		return duracao;
	}
	
	public void setDuracaoCurso(String duracaoCurso) {
		this.duracao = duracaoCurso;
	}

	@Override
	public String toString() {
		return " ##  CURSO  ##" + "\n_______________" + "\nNome: " + nome + "\nCódigo: " + codigo + "\nDuracao: " + duracao + "\n";
	}
	
	public void exibirDisciplinas() {
		System.out.println("  Disciplinas");
		System.out.println("---------------");
		for (int i = 0; i < this.disciplina.length; i++) {
			if(this.disciplina[i] != null)
				System.out.println(" - " + this.disciplina[i].getNomeDisciplinas());
		}
		System.out.println();
	}
	
	public void exibirAlunos() {
		System.out.println("  Alunos");
		System.out.println("----------");
		for (int i = 0; i < this.aluno.length; i++) {
			if(this.aluno[i] != null)
				System.out.println(" - " + this.aluno[i].getNomeAluno());
		}
		System.out.println();
	}
}
