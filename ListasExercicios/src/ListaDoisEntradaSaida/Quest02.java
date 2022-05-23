package ListaDoisEntradaSaida;

import java.util.Scanner;
//LAN_HOUSE
public class Quest02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float consumo, total, valorCobrado = 0.03833f;
		
		System.out.print("Informe a quantidade EM MINUTOS utilizado pelo cliente: ");
		consumo = read.nextInt();
		System.out.println();
		total = consumo * valorCobrado;
		System.out.printf("O valor a ser pago por minuto é de: R$%.2f",total);
		read.close();
		
	}
}
