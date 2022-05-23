package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Quest17 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int ano;
	float dias;
	
	System.out.print("Informe a idade em anos: ");
	ano = read.nextInt();
	dias = ano * 365.25f;
	System.out.printf("Dias vividos: %.0f",dias);
	read.close();
}
}
