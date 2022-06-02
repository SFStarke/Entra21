package lista_sete_vetores;

import java.util.Scanner;

/*Questão 10 - Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
 * */
public class Quest10 {
public static void main(String[] args) {
	float[] n1 = new float[4];
	float[] n2 = new float[n1.length];
	float[] result = new float[n1.length];
	String res = "";
	int bimestre = 1, x = 1;
	Scanner read = new Scanner(System.in);
	System.out.println("Sistema condicional de aprovação:\n######################\n");
	for(int i = 0; i < n1.length;i++) {
		System.out.println(i+1+"º Aluno: ");
		System.out.print(bimestre+"ª Nota bimestral: ");
		bimestre++;
		n1[i] = read.nextFloat();
		System.out.println();
		System.out.print(bimestre+"ª Nota bimestral: ");
		n2[i] = read.nextFloat();
		bimestre--;
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		result[i] = (n1[i] + n2[i]) / 2;
	}
	for (int i = 0; i < n1.length; i++) {
		res = (result[i] >= 7) ? "Aluno "+x+" APROVADO com média "+result[i]+"\n" :
			"Aluno "+x+" REPROVADO com média "+result[i]+"\n";
		x++;
		System.out.println(res);
	}
	
	read.close();
}
}
