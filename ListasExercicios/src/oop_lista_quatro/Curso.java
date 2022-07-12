package oop_lista_quatro;


public class Curso {

	private String nomeCurso, horarioCurso;
	private Professor professor;
	private Aluno[] alunos = new Aluno [5];//Ao alterar vetor, NÃO esquecer TROCAR vetor da classe "Main"

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

	public String showCourse() {//Método de apresentação do status do curso
		String res = "";
		
		for (int i = 0; i < alunos.length; i++) {
			res += ""+this.alunos[i].showStudent()+"\n######\n";
		}
		return "Curso de: "+this.nomeCurso+". Horário: "+this.horarioCurso+"\n"
				+ "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"+this.professor.showProfessor()+"\n"
						+ "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nALUNOS:\n"+res;
	}
}
