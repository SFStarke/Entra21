package ListaDoisEntradaSaida;

import java.util.Scanner;
//Festa de aniverssário.
public class Quest09 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int pessoas;
		float vCarne, vCerveja, total;
		
		System.out.print("Informe nº de convidados: ");
		pessoas = read.nextInt();
		System.out.println();
		vCarne = (float) 0.5 * 18 * pessoas;
		vCerveja = (float)((float) 6 * 1.7 * pessoas);
		total = vCarne + vCerveja;
		
		
		System.out.println();
		System.out.printf("O valor gasto com a carne será de R$%.2f\n",vCarne);
		System.out.println();
		System.out.printf("O valor gasto com a cerveja será de R$%.2f\n",vCerveja);
		System.out.println();
		System.out.printf("O valor total será de R$%.2f",total);
		read.close();
	}
}
