package exercicio;

import java.util.Scanner;

public class Praticar {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int cobrado, pago, troco, un = 0, des, cen;
		String recusado;
		System.out.print("Calculo de troco:\n####################\n"
				+ "Valor cobrado? R$");
		cobrado = read.nextInt();
		System.out.print("\nValor pago? R$");
		pago = read.nextInt();
		
		troco = pago - cobrado;
		System.out.println("Troco... "+troco);
		
		recusado = (troco < 0) ? "Recusado": "Aceito";
		
		switch (recusado) {
		case "Recusado":
			System.out.println("Foi recusado pagamento...");
			break;
		case "Aceito":
			un = ((troco > 0)&&(troco <= 10)) ? troco: 0;
			break;
		}
		
		System.out.println(un+" nota de um real.");
		read.close();
	}
}
