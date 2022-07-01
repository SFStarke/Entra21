package oop_lista_dois;

//import java.util.Scanner;

/*3. Escreva uma class para representar um Aluno. Adicione atributos 
 *relacionados às caracteristicas de um Aluno, como nome, matricula, 
 *curso que está matriculado, nome de 3 disciplinas que está cursando 
 *e as notas dessas 3 disciplinas. Desenvolva um método para verificar 
 *se o aluno está aprovado (nota maior ou igual a 7) em uma 
 *determinada disciplina. Escreva um programa para testar essa classe, 
 *que pede as informações do aluno ao usuário e ao final informa o 
 *nome das disciplinas, mostra as notas e mostra se o aluno foi 
 *aprovado ou não
 */
public class Aluno {
	//private String res = "";
	private String nome, curso;
	private int matricula;
	private String disciplinas[] = new String[3];
	private float notas[][] = new float[disciplinas.length][disciplinas.length];

	public Aluno() {}
	
	public void aluno(String n, int num, String c) {
		this.nome = n;
		this.matricula = num;
		this.curso = c;
	}

	public void aval() {
		System.out.print("\n#############################\nALUNO(a): " + nome +
				". MATRICULA Nº: " + matricula + ".\nCURSO DE: " + curso +
				".\n\nAvaliação das 'Matérias' & Notas: ");
		for (int i = 0; i < notas.length; i++) {
			float media = 0f;
			System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nMATÉRIA: " + disciplinas[i] + "\n ");
			for (int j = 0; j < notas.length; j++) {
				System.out.print(notas[i][j] + ". ");
				media += notas[i][j];
			}
			String res = (media/3 >=7 ) ? "APROVADO": "REPROVADO";
			System.out.println(res);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		for(int i = 0; i < 3 ; i++) {
			this.disciplinas[i] = disciplinas;
		}
	}

	public float[][] getNotas() {
		return notas;
	}

	public void setNotas(float[][] notas) {
		this.notas = notas;
	}
	
}
