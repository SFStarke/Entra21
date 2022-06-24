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
	String res = "";
	String nome, curso;
	int matricula;
	String disciplinas[] = new String[3];
	float notas[][] = new float[disciplinas.length][disciplinas.length];

	void aluno(String n, int num, String c) {
		nome = n;
		matricula = num;
		curso = c;
	}

	void aval() {
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

	/*
	 * String avaliacao() {
	 * 
	 * 
	 * 
	 * return " "; } String status() { String res = ""; for (int i = 0; i <
	 * disciplinas.length; i++) { res += notas[i]+"... "+disciplinas[i]+"\n";
	 * 
	 * } return
	 * "ALUNO: "+nome+". MATRICULA Nº ["+matricula+"]. CURSO DE: "+curso+".\n" +
	 * "\nAvaliação das notas entre as matérias:\n"+res+"\nAluno: "; }
	 */

	/*
	 * String avaliacao() { for (int i = 0; i < disciplinas.length; i++) {
	 * if(notas[i] < 7) { res = "REPROVADO"; break; }else { res = "APROVADO"; } }
	 * return res; } void aluno() { Scanner read = new Scanner(System.in);
	 * System.out.print("Nome do aluno: "); nome = read.nextLine();
	 * System.out.print("Matrícula nº "); matricula = read.nextInt(); curso =
	 * read.nextLine(); System.out.print("Em que curso o aluno " + nome +
	 * " está matriculado? "); curso = read.nextLine(); System.out.
	 * println("Informe as disciplinas 'matérias' que o aluno frequentou e suas respectivas notas:"
	 * ); for (int i = 0; i < disciplinas.length; i++) { System.out.print(i + 1 +
	 * "ª Disciplina: "); disciplinas[i] = read.next();
	 * System.out.print("Nota da disciplina " + disciplinas[i] + ": "); notas[i] =
	 * read.nextFloat(); } System.out.println("#############################\n" +
	 * "ALUNO: "+nome+". MATRICULA Nº: "+matricula+". CURSO DE: "+curso+".\n" +
	 * "Avaliação das Disciplinas 'Matérias' & Notas: "); for (int i = 0; i <
	 * disciplinas.length; i++) {
	 * System.out.printf("Matéria de %s, nota: [%.2f]\n",disciplinas[i], notas[i]);
	 * } System.out.print("O aluno está: "+avaliacao());
	 * 
	 * read.close();
	 */
}
