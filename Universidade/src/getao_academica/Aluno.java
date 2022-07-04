package getao_academica;

public class Aluno {
	private int matricula, cpf, alunos= 10;
	private String nome[] = new String[alunos];// Disciplinas cursados de um determinado aluno.
	private String curso;

public Aluno() {}



public String[] getNome() {
	return nome;
}

public void setNome(String nome, int n) {
	this.nome[n] = nome;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public int getCpf() {
	return cpf;
}

public void setCpf(int cpf) {
	this.cpf = cpf;
}

}
