package ListaDoisEntradaSaida;

import java.util.Scanner;
//Multa da biblioteca.

public class Quest06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float total;
		int qDias;
		
		System.out.print("Quantidade de dias de atraso? ");
		qDias = read.nextInt();
		System.out.println();
		total = qDias *2.5f;
		System.out.printf("O valor a ser pago pela multa é de R$%.2f",total);
		read.close();
	}

}
