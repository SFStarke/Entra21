package ListaDoisEntradaSaida;

import java.util.Scanner;
//C�PIA DE LIVRO.
public class Quest03 {

	public static void main(String[] args) {
		float total;
		int folhas;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digita a quantidade de folhas para c�piar: ");
		folhas = read.nextInt();
		System.out.println();
		total = (float) (2*folhas *0.08);
		System.out.printf("O valor a ser pago pelas c�pias � de: R$%.2f",total);
		read.close();
	}
}
