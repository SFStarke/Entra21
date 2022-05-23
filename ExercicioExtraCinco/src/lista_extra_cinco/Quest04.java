package lista_extra_cinco;

import java.util.Scanner;
/*
 * Questão 4 – Faça um programa com 5 perguntas para uma pessoa sobre um
crime.
 * */
public class Quest04 {
	
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	String res1, res2, res3, res4, res5, condicao;
	int nSim = 5;
	
	System.out.println("QUESTIONÁRIO: Para sim [ s ]. Para não [ n ].\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
	System.out.print("Telefonou para a vitima? ");
	res1 = read.next();
	nSim = res1.equalsIgnoreCase("s") ? nSim : --nSim;
	System.out.print("\nEsteve no local do crime? ");
	res2 = read.next();
	nSim = res2.equalsIgnoreCase("s") ? nSim : --nSim;
	System.out.print("\nMora perto da vitima? ");
	res3 = read.next();
	nSim = res3.equalsIgnoreCase("s") ? nSim : --nSim;
	System.out.print("\nDevia para vitima? ");
	res4 = read.next();
	nSim = res4.equalsIgnoreCase("s") ? nSim : --nSim;
	System.out.print("\nJá trabalhou com a vitima? ");
	res5 = read.next();
	nSim = res5.equalsIgnoreCase("s") ? nSim : --nSim;

	condicao = nSim == 5 ? "Assassino" : nSim == 2 ? "Suspeito" :
		nSim >= 3 && nSim <= 4? "Cúmplice": "Inocente";
	
	System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
			+ "O sujeito interrogado é considerado: "+condicao);
	
	read.close();
}
}
