package ListaDoisEntradaSaida;

import java.util.Scanner;
// PESO PRATO

public class Quest07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float valor, peso;
		
		System.out.print("Informe o peso em GRAMAS da balan�a: ");
		peso = read.nextFloat();
		System.out.println();
		valor = (peso - 230) * 0.02f;
		System.out.printf("O valor da refei��o foi de R$%.2f",valor);
		read.close();
	}
}
