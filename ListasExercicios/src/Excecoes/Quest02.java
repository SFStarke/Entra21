package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int res = 0;
		do {
			try {
				System.out.println("Eu sei dividir");
				System.out.print("Informe o primeiro valoor: ");
				int x = read.nextInt();
				System.out.print("Informe o seugundo valor: ");
				int y = read.nextInt();
				double r = (x / y);
				System.out.println("Resultado da Divisão é: "+r);
				read.close();
				
			}catch(InputMismatchException e){
				System.out.print("Informe apenas números. ");
			}
			res++;
		}while(res == 3);
	}

}
