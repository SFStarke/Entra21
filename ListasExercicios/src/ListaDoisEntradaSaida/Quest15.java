package ListaDoisEntradaSaida;

import java.util.Scanner;
// Área quadrada.
public class Quest15 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	float area, lado;
	
	System.out.print("Digite o valor do lado do quadrado: ");
	lado = read.nextFloat();
	area = (float) Math.pow(lado, 2);
	System.out.println("A área do quadrado é: "+area);
	read.close();
}
}
