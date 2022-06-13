package matriz;

import java.util.Scanner;

public class MinhaVelha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String[][] velha = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		int[] numDig = new int[9]; // Vetor para correção da posição dentro da matriz.
		int loop = 0, jogador = 1; // "loop" Repetição do conjunto dos algritmos | "jogador" Alterna entre um e dois.
		int a = 0;				   // "a" Referncia para posição do vetor numDig.
		int spot = 1, numero = 1;  // "spot" Variavel da posição selecionada pelo usuário. | "numero" Auxilia na correção e orientação, para ordem da matriz "velha".
		boolean loopnumDig = false;// Enquanto, false, repete o algoritmo para seleção do quadrante"local" do X ou O.

		System.out.println("        JOGO DA VELHA\n O Jogador [ X ] Sempre Começa:\nEscolha o local:");

		do {//Looping para avaliar todas as variáveis.
			numero = 1;
			
			for (int i = 0; i < velha.length; i++) {
				System.out.println();
				for (int j = 0; j < velha[i].length; j++) {
					System.out.print(velha[i][j] + " | ");
				}
			}
			do {//Looping para avaliar se posição, foi ou não, selecionada anteriormente.
			spot = read.nextInt();//Entrada para escolha da posição do tabuleiro.
			boolean alreadySet = false;
			for (int i = 0; i < numDig.length; i++) {
				if (numDig[i] == spot) {
					alreadySet = true;
					System.out.print("_____________________\n"
							+ "Posisão já selecionada...\nEscolha outro número:");
					loopnumDig = false;
					break;
				}
			}
			if(alreadySet == false){
				numDig[a] = spot;
				loopnumDig = true;
			}
			a++;
			}while(loopnumDig == false);//Fim da avalia.
			
			if (jogador == 1) {//Alterna entre os jogadores & Implementa o "X ou O".
				for (int i = 0; i < velha.length; i++) {
					for (int j = 0; j < velha[i].length; j++) {
						if (numero == spot) {
							velha[i][j] = "X";
						}
						numero++;
					}
				}
				System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨\nVez do [ O ]:\n");
				jogador++;
			} else {
				for (int i = 0; i < velha.length; i++) {
					for (int j = 0; j < velha[i].length; j++) {
						if (numero == spot) {
							velha[i][j] = "O";
						}
						numero++;
					}
				}
				System.out.print("\n¨¨¨¨¨¨¨¨¨¨¨¨¨\nVez do [ X ]:\n ");
				jogador--;
			}
			//CONDICIONAL QUE AVALIA GANHADOR
			if ((velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] == "X")
			 || (velha[1][0] == velha[1][1] && velha[1][0] == velha[1][2] && velha[1][0] == "X")
			 || (velha[2][0] == velha[2][1] && velha[2][0] == velha[2][2] && velha[2][0] == "X")
			 || (velha[0][0] == velha[1][0] && velha[0][0] == velha[2][0] && velha[0][0] == "X")
			 || (velha[0][1] == velha[1][1] && velha[0][1] == velha[2][1] && velha[0][1] == "X")
			 || (velha[0][2] == velha[1][2] && velha[0][2] == velha[2][2] && velha[0][2] == "X")
			 || (velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2] && velha[0][0] == "X")
			 || (velha[2][0] == velha[1][1] && velha[1][1] == velha[0][2] && velha[2][0] == "X")) {
				System.out.println("\nO [ X ] venceu! Parabéns!!!");
				break;
			} else if ((velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] == "O")
					|| (velha[1][0] == velha[1][1] && velha[1][0] == velha[1][2] && velha[1][0] == "O")
					|| (velha[2][0] == velha[2][1] && velha[2][0] == velha[2][2] && velha[2][0] == "O")
					|| (velha[0][0] == velha[1][0] && velha[0][0] == velha[2][0] && velha[0][0] == "O")
					|| (velha[0][1] == velha[1][1] && velha[0][1] == velha[2][1] && velha[0][1] == "O")
					|| (velha[0][2] == velha[1][2] && velha[0][2] == velha[2][2] && velha[0][2] == "O")
					|| (velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2] && velha[0][0] == "O")
					|| (velha[2][0] == velha[1][1] && velha[1][1] == velha[0][2] && velha[2][0] == "O")) {
				System.out.println("\nO [ O ] venceu! Parabéns!!!");
				break;
			}
			if (loop == 8) {//Condiciona que avalia empate.
				System.out.println("\nJogo empatado.\n--FIM--");
				break;
			}
			loop++;
		} while (loop <= 9);//Encerra quando termina todo o algorítmo.
			
		read.close();
		/*Linha: [1,2,3]-[4,5,6]-7,8,9]. Vertical: [1,4,7]-[2,5,8]-[3,6,9]. Diagonal[1,5,9]- [3,5,7]
			
			for (int i = 0; i < numDig.length; i+=2) {
				System.out.print("X: "+numDig[i]+". ");
				
			}
			System.out.println();
			for (int i = 1; i < numDig.length; i+=2) {
				System.out.print("O: "+numDig[i]+". ");
			}*/
	}
}
