package oop_lista_cinco;

public class Disciplina {
	private Curso[] curso;
	private String nome;
	private String codigo;
	private String cargaHoraria;
	private Professor professor;
	
	public Disciplina(int i) {
		this.curso = new Curso[i]; 
	}
	
	public Disciplina(String nome, String codigo, String cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso getCurso(int i) {
		return curso[i];
	}

	public void setCurso(int i, Curso curso) {
		this.curso[i] = curso;
	}

	public Professor getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNomeDisciplinas() {
		return nome;
	}
	
	public void setNomeDisciplinas(String nomeDisciplinas) {
		this.nome = nomeDisciplinas;
	}
	
	public String getCodigoDisciplina() {
		return codigo;
	}
	
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigo = codigoDisciplina;
	}
	
	public String getCargaHorariaDisciplina() {
		return cargaHoraria;
	}
	
	public void setCargaHorariaDisciplina(String cargaHorariaDisciplina) {
		this.cargaHoraria = cargaHorariaDisciplina;
	}

	@Override
	public String toString() {
		return " ##  DISCIPLINA  ##" + "\n____________________" + "\nNome: " + nome + "\nCódigo: " + codigo + "\nCarga Horária: " 
				+ cargaHoraria + "\nProfessor: " + professor.getNomeFuncionario() + "\n";
	}
	
	public void exibirCursos() {
		System.out.println("  Cursos");
		System.out.println("----------");
		for (int i = 0; i < curso.length; i++) {
			if(this.curso[i] != null)
				System.out.println(" - " + this.curso[i].getNomeCurso());
		}
		System.out.println();
	}
}
