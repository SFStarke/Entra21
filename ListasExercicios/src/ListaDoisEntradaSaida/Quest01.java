package ListaDoisEntradaSaida;

import java.util.Scanner;
//Consulta de IDADE.
public class Quest01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int anoAtual, nasc, anos = 0;
		System.out.print("Digite o ano de nascimento: ");
		nasc = read.nextInt();
		System.out.println();
		System.out.print("Digite o ano atual: ");
		anoAtual = read.nextInt();
		System.out.println();
		anos = anoAtual - nasc;
		System.out.println("A idade do(a) usu�rio(a) � de: "+ anos+" anos.");
		read.close();
	}

}
