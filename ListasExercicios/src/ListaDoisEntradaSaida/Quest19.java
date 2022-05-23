package ListaDoisEntradaSaida;

import java.util.Scanner;
//Converter horas para minutos e segundos;
public class Quest19 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int entrada;
	float h, m, s;
	
	System.out.print("Digitq a hora: ");
	entrada = read.nextInt();
	h = entrada;
	m = entrada * 60f;
	s = m * 60f;
	System.out.println("");
	System.out.printf("%.0f Horas corresponde a: %.0f minutos e %.0f segundos.",h ,m, s);
	read.close();
	
}
}
