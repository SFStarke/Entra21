package ListaDoisEntradaSaida;

import java.util.Scanner;
// Orçamento de Flores.
public class Quest11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tulipa, rosa;
		float total;
		
		System.out.print("Quantidade de tulipas: ");
		tulipa = read.nextInt();
		System.out.println();
		System.out.print("Quantidade de rosas: ");
		rosa = read.nextInt();
		System.out.println();
		total = (float)((tulipa * 4.2) + (rosa * 2.8));
System.out.printf("Seu gasto total na compra das flores será de R$%.2f",total);
		read.close();
	}
}
