package matriz;

import java.util.Scanner;

public class MinhaVelha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String[][] velha = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		int[] numDig = new int[9];
		int loop = 0, jogador = 2;
		int spot = 1, init = 0, numero = 1;
		boolean loopnumDig = false;

		System.out.println("        JOGO DA VELHA\n O Jogador [ X ] Sempre Começa:");

		while (loop <= 9) {
			spot = 1;
			numero = 1;
			for (int i = 0; i < velha.length; i++) {
				System.out.println();
				for (int j = 0; j < velha[i].length; j++) {
					System.out.print(velha[i][j] + " | ");
				}
			}
			do {
				System.out.print("\nEscolha o local: ");
				spot = read.nextInt();
				for (int i = 0; i < numDig.length; i++) {
					if(spot == numDig[i]) {
						loopnumDig = false;
						System.out.println("Posisão já selecionada...");
						break;
					}else {
						numDig[i] = spot;
						loopnumDig = true;
					}
				}
			} while (loopnumDig == false);
			
			if(jogador == 2) {
				for (int i = 0; i < velha.length; i++) {
					for (int j = 0; j < velha[i].length; j++) {
						if (numero == spot) {
							velha[i][j] = "X";
						}
						numero++;
					}
				}
				System.out.print("\n____________________________"
						+ "\nJogador [ O ]:\n");
				jogador--;
			}else {
				for (int i = 0; i < velha.length; i++) {
					for (int j = 0; j < velha[i].length; j++) {
						if (numero == spot) {
							velha[i][j] = "O";
						}
						numero++;
					}
				}
				System.out.print("\n____________________________"
						+ "\nJogador [ X ]:\n ");
				jogador++;
			}

			loop++;
			
		}

		read.close();
	}
}
