package lista_extra_cinco;

import java.util.Scanner;

public class Quest01 {
	/*
	 * Questao 1 - A Secretaria de Meio Ambiente que controla o índice de poluição 
mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. O 
índice de poluição aceitável varia de0 (zero) até 0,25. Se o índice sobe para 0,3 as 
indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o índice 
crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a suspenderem suas 
atividades, se o índice atingir 0,5 todos os grupos devem serem notificados a 
paralisarem suas atividades. Faça um algoritmo que leia o índice de poluição 
medido e emita a notificação adequada aos diferentes grupos de empresas
.*/
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	float indice;
	String res= null, grupo = null;
	
	System.out.println("Índice de poluição e notificação:\n############################\n");
	System.out.print("\n Informe o ìndice da poluição desta industria: ");
	indice = read.nextFloat();
	
	if((indice > 0.0) && (indice <= 0.25)) {
		res = "Aceitável";
	}else if(indice >= 0.3f && indice < 0.4f) {
		grupo = "1º grupo:";
		res = "Intimação pela suspenção de suas atividades";
	}else if(indice >= 0.4f && indice < 0.5f) {
		grupo = "1º e 2º grupos:";
		res = "Intimação pela suspenção de suas atividades";
	}else if (indice >= 0.5f) {
		grupo = "1º, 2º e 3º grupos:";
		res = "Notificação de paralização das atividades";
	}
	
	System.out.printf("\n*************************\n"
			+ "Esta industria possui %.2f de indice de poluição.\n"
			+ "Situação %s\n Condição: %s.",indice, grupo, res);
	read.close();
}
}
