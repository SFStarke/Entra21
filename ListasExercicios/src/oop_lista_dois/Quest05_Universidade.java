package oop_lista_dois;

public class Quest05_Universidade {

	int n1, n2, n3, n4, n5 = 3, n6;
	int cadProf, cadTec, cadFuncionario = 8, nAluno, cadAluno = 4;
	String professor[][] = new String[n1][n2];// Disc. de cada professor e seu curso.
	String aluno[] = new String[n3];// Disciplinas cursados de um determinado aluno.
	String cadastrarProfessor[][] = new String[cadProf][cadFuncionario];
	String cadastrarTecnico[][] = new String[cadTec][cadFuncionario];
	String curso[][] = new String[n4][n5];
	String disciplina[][] = new String[n6][n5];
	String cadastrarAluno[][] = new String[nAluno][cadAluno];//Cadastro de todos os alunos.

	void addProfDisciplinas() {
		/*
		 * Implementa as disciplinas que são ministradas por cada professor e em qual
		 * curso.
		 */
	}

	void addAluno_Cursos() {
		// Implementa as disciplinas que são cursados por um determinado aluno.
	}

	void cadFuncionarios() {
		/*
		 * Implementa o cadastro dos funcionários da universidade. Numa condicional, são
		 * distintos entre professores e técnicos.
		 *
		 * PROFESSOR. NOME, ENDEREÇO, TELEFONE, CPF, Nº CTPS, SALÁRIO, TITULAÇÃO E ÁREA
		 * DE PESQUISA.
		 *
		 * TÉCNICO... NOME, ENDEREÇO, TELEFONE, CPF, Nº CTPS, SALÁRIO, CARGO E
		 * DEPARTAMENTO
		 */
	}

	void cadDoutrinas() {
		// Implementa o cadastro dos cursos e disciplinas.
		/*
		 * Para cada curso é necessário registrar seu código, nome e duração. Para cada
		 * disciplina é necessário registrar seu código, nome e carga horária.
		 */
	}

	void cadAlunos() {
		/*
		 * Implementa o cadastro dos alunos; Nome, matrícula, cpf e curso
		 */
	}

	String showFuncionarios() {
		return "Informações pertinentes aos funcionários";
	}

	String showProf_Disciplinas() {
		return "Informações pertinentes a disciplina e curso de cada professor";
	}

	String showAluno() {
		return "Informações pertinentes aos alunos";
	}

	String showAluno_Cursos() {
		return "Informações pertinentes aos curso de um determinado aluno ";
	}
	String showDoutrinas() {
		return "Informações pertinentes as disciplinas e cursos ministrados";
	}
}
