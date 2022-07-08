package oop_lista_quatro;


public class Curso {

	private String nomeCurso, horarioCurso;
	private Professor professor;
	private Aluno[] alunos = new Aluno[2];;

	public Curso() {
	}

	public Curso(String nome, String horario) {
		this.nomeCurso = nome;
		this.horarioCurso = horario;
	}
	
	public String status() {
		return "Curso: "+this.nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorarioCurso() {
		return horarioCurso;
	}

	public void setHorarioCurso(String horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	
}
