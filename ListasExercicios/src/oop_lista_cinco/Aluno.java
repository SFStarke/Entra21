package oop_lista_cinco;

public class Aluno {
	Curso[] curso;
	private String nome;
	private String matricula;
	private int cpf;
	
	public Aluno(int i) {
		this.curso = new Curso[i];
	}
	
	public Aluno(String nome, String matricula, int cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public Curso getCurso(int i) {
		return curso[i];
	}

	public void setCurso(int i, Curso curso) {
		this.curso[i] = curso;
	}

	public String getNomeAluno() {
		return nome;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nome = nomeAluno;
	}
	
	public String getMatriculaAluno() {
		return matricula;
	}
	
	public void setMatriculaAluno(String matriculaAluno) {
		this.matricula = matriculaAluno;
	}
	
	public int getCpfAluno() {
		return cpf;
	}
	
	public void setCpfAluno(int cpfAluno) {
		this.cpf = cpfAluno;
	}

	@Override
	public String toString() {
		return " ##  ALUNO  ##" + "\n_______________" + "\nNome: " + nome + "\nMatricula: " + matricula + "\nCPF: " + cpf + "\n";
	}
	
	public void cursosDisciplinas() {
		for (int i = 0; i < curso.length; i++) {
			if(this.curso[i] != null) {
				System.out.printf("== %dº Curso: %s ==%n", (i + 1), this.curso[i].getNomeCurso());
				System.out.println("  Disciplinas");
				System.out.println("---------------");
				for (int j = 0; j < 3; j++) {
					if(this.curso[i].getDisciplina(j) != null)
						System.out.println(" - " + this.curso[i].getDisciplina(j).getNomeDisciplinas());
				}
			}
			System.out.println();
		}
	}
}
