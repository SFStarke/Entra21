package ListaDoisEntradaSaida;

import java.util.Scanner;
//Graus C�sius para Fahrenheit.

public class Quest04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float tc, tf;
		System.out.print("Informe a temperaturra em graus celsius(�C): ");
		tc = ler.nextFloat();
		System.out.println();
		tf = (float)(1.8 * tc) + 32;
System.out.printf("A temperatura equivalente em graus fahrenheit � de: %.1f �F.",tf);
	ler.close();
	}
}
