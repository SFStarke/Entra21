package ListaDoisEntradaSaida;

import java.util.Scanner;

public class Quest08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float vm, tempo, distancia;
		String nome;
		
		System.out.print("Nome do Piloto: ");
		nome = read.nextLine();
		System.out.println();
		System.out.print("Distância percorrida em quilômetros (Km): ");
		distancia = read.nextFloat();
		System.out.println();
		System.out.print("O tempo percorrido em hora: ");
		tempo = read.nextFloat();
		System.out.println();
		vm = distancia / tempo;
		System.out.printf("A velocidade média de %s foi de %.0f Km/h.",nome,vm);
		read.close();
	}
}
