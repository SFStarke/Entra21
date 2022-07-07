package oop_lista_quatro;

import java.util.Scanner;

public class MainAluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Curso c = new Curso("Java", "08:00 as 12:00");
		
		//c.setProfessor("Sergio", "Java", "Ser@.outlook.com");
		
		System.out.println(c.status());
		
		read.close();
	}
}
