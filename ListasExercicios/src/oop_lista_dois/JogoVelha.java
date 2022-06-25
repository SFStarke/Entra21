package oop_lista_dois;

public class JogoVelha {
	String[][] velha = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
	int alreadyPlay = 0; // Atributo responsavel em guardar nº do ultimo jogador.
	int[] numDig = new int[9]; // Vetor que recebe numeros de locais já digitados.
	int numeroDig = 0; // Alterna as posições do vetor " numGig[] "

	void show() {// Método para apresentar tabuleiro
		for (int i = 0; i < velha.length; i++) {
			System.out.println();
			for (int j = 0; j < velha[i].length; j++) {
				System.out.print(velha[i][j] + " | ");
			}
		}
	}

	void setPlayers(int spot, int players) {// Método para realizar as operações do jogo.
		boolean continuar = false;
		 for (int x = 0; x < numDig.length; x++) {//Verefica se houve numero digitado anteriormente. 
			 if(spot == numDig[x]) {
				System.out.println("\n'''''''''''''''''''''''''''''''\n"
						+ "LOCAL JÁ SELECIONADO ANTERIORMENTE\n"
						+ "TENTE NOVAMENTE\n"
						+ "'''''''''''''''''''''''''''''''\n");
				continuar = false;
				break;
			}else {
				continuar = true;
			}
		}
		 if(continuar == true) {// Caso resultado " true " o jogo continua.
			 numDig[numeroDig] = spot;
				if (players != alreadyPlay) {
					if ((players == 1) || (players == 2)) {// Verefica se não é digitado nº diferente de 1 ou 2.
						int numero = 1;
						String player = players == 1 ? "X" : "O";
						for (int i = 0; i < velha.length; i++) {
							for (int j = 0; j < velha[i].length; j++) {
								if (numero == spot) {
									velha[i][j] = player;
								}
								numero++;
							}
						}
					} else {
						System.out.println("\n''''''''''''''''''''''\n"+
					"Nº DO JOGADOR INCORRETO\nTENTE NOVAMENTE\n"
								+ "\n'''''''''''''''''''''''");
					}
				} else {
					System.out.println("\n''''''''''''''''''''''\n"+
				"JOGADOR JÁ FEZ JOGADA ANTERIOR\nTENTE NOVAMENTE\n"
							+ "\n'''''''''''''''''''''''");
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
					System.out.println("\n[ X ] venceu! Parabéns!!!");
				} else if ((velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] == "O")
						|| (velha[1][0] == velha[1][1] && velha[1][0] == velha[1][2] && velha[1][0] == "O")
						|| (velha[2][0] == velha[2][1] && velha[2][0] == velha[2][2] && velha[2][0] == "O")
						|| (velha[0][0] == velha[1][0] && velha[0][0] == velha[2][0] && velha[0][0] == "O")
						|| (velha[0][1] == velha[1][1] && velha[0][1] == velha[2][1] && velha[0][1] == "O")
						|| (velha[0][2] == velha[1][2] && velha[0][2] == velha[2][2] && velha[0][2] == "O")
						|| (velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2] && velha[0][0] == "O")
						|| (velha[2][0] == velha[1][1] && velha[1][1] == velha[0][2] && velha[2][0] == "O")) {
					System.out.println("\n[ O ] venceu! Parabéns!!!");
				}
			
				
				numeroDig++;
				alreadyPlay = players; 
		 }

	}
}
