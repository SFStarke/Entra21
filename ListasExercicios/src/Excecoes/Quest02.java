package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		boolean loop = true;
		
		do {
			loop = true;
			try {
				System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\nEu sei dividir...");
				System.out.print("1º valor: ");
				int x = read.nextInt();
				System.out.print("2º valor: ");
				int y = read.nextInt();
				double r = (x / y);
				System.out.println("\nResultado: "+x+" / "+ y+" = " + r);
				
			} catch (InputMismatchException e) {
				System.out.print("\n##################\nINFORME APENAS NÚMEROS.\nTente novamente\n####################\n");
				read.nextLine();
				loop = false;
			} catch(ArithmeticException e) {
				System.out.println("\n##################\nNÚMERO 0(ZERO) NÃO É ACEITO COMO DIVISOR.\nTente novamente\n####################\n");
				read.nextLine();
				loop = false;
			}

		}while(loop == false);
		
		read.close();
	}
}
