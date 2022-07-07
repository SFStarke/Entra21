package testar;

import java.util.Scanner;

import static_ex.ExStatic;

public class Testar {
	static int a;
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	a = ExStatic.menos(4, 3);
	System.out.println(a);
	a = ExStatic.soma(1, 2);
	System.out.println(a);
	a = ExStatic.somaVet(new int [3]);
	for (int i = 0; i < 3; i++) {
		System.out.println(a);
	}

	read.close();	
	}
}
