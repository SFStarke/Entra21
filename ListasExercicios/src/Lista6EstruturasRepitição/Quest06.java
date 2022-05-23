package Lista6EstruturasRepitição;

public class Quest06 {
	/*
	 * Questão 6 - Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem
	 * 1,10m e cresce 3 centímetros por ano. Construir um programa que calcule e
	 * imprima quantos anos serão necessários para que Juca seja maior que Chico.
	 */
	public static void main(String[] args) {
		float chico = 1.5f, juca = 1.1f;
		int anos = 0;
		while (chico > juca) {
			chico += 0.02f;
			juca += 0.03f;
			anos++;
			
		}
		System.out.printf("Foram necessários %d anos\n" 
		+ "para que Juca ultrapaçasse a altura de Chico.", anos);
	}
}
