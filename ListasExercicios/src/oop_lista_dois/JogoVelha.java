package oop_lista_dois;

public class JogoVelha {
	private String[][] velha = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
	private int[] numDig = new int[9]; // Vetor que recebe numeros de locais já digitados.
	private int numeroDig = 0; // Alterna as posições do vetor " numGig[] "
	private int players = 0;   // Adiciona o nº de modo que alterne entre par e impar que serão:"X" ou "O" no jogo.
	private String player = "o"; // "player" Etabelece se é "X" ou "O" dentro da matriz "velha"
	private String winner; // Informa por escrito quem venceu o jogo.
	
	public JogoVelha() {}
	
	public void getBoard() {// Método para apresentar tabuleiro
		for (int i = 0; i < velha.length; i++) {
			System.out.println();
			for (int j = 0; j < velha[i].length; j++) {
				System.out.print(velha[i][j] + " | ");
			}
		}
	}
	
	public boolean checkWinner() {
		//CONDICIONAL QUE AVALIA GANHADOR
		if ((velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] == "X")
				|| (velha[1][0] == velha[1][1] && velha[1][0] == velha[1][2] && velha[1][0] == "X")
				|| (velha[2][0] == velha[2][1] && velha[2][0] == velha[2][2] && velha[2][0] == "X")
				|| (velha[0][0] == velha[1][0] && velha[0][0] == velha[2][0] && velha[0][0] == "X")
				|| (velha[0][1] == velha[1][1] && velha[0][1] == velha[2][1] && velha[0][1] == "X")
				|| (velha[0][2] == velha[1][2] && velha[0][2] == velha[2][2] && velha[0][2] == "X")
				|| (velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2] && velha[0][0] == "X")
				|| (velha[2][0] == velha[1][1] && velha[1][1] == velha[0][2] && velha[2][0] == "X")) {
			winner = "\n[ X ] venceu! Parabéns!!!";
			return true;
			
		} else if ((velha[0][0] == velha[0][1] && velha[0][0] == velha[0][2] && velha[0][0] == "O")
				|| (velha[1][0] == velha[1][1] && velha[1][0] == velha[1][2] && velha[1][0] == "O")
				|| (velha[2][0] == velha[2][1] && velha[2][0] == velha[2][2] && velha[2][0] == "O")
				|| (velha[0][0] == velha[1][0] && velha[0][0] == velha[2][0] && velha[0][0] == "O")
				|| (velha[0][1] == velha[1][1] && velha[0][1] == velha[2][1] && velha[0][1] == "O")
				|| (velha[0][2] == velha[1][2] && velha[0][2] == velha[2][2] && velha[0][2] == "O")
				|| (velha[0][0] == velha[1][1] && velha[0][0] == velha[2][2] && velha[0][0] == "O")
				|| (velha[2][0] == velha[1][1] && velha[1][1] == velha[0][2] && velha[2][0] == "O")) {
			winner = "\n[ O ] venceu! Parabéns!!!";
			return true;
		}
		return false;
	}

	public void setPlay(int spot) { // Método que realiza o jogo.
		if(this.checkWinner() == false) {
			boolean continuar = false;
		 for (int x = 0; x < numDig.length; x++) {//Verefica se houve numero digitado anteriormente. 
			 if(spot == numDig[x]) {
				System.out.println("\n'''''''''''''''''''''''''''''''\n"
						+ "Nº DO TABULEIRO JÁ SELECIONADO ANTERIORMENTE\n"
						+ "TENTE NOVAMENTE\n"
						+ "'''''''''''''''''''''''''''''''\n");
				continuar = false;
				break;
			}else {
				continuar = true;
				
			}
		}
		if(continuar == true) {
			 numDig[numeroDig] = spot;
			int numero = 1;
			player = players%2 == 0 ? "X" : "O";
			for (int i = 0; i < velha.length; i++) {
				for (int j = 0; j < velha[i].length; j++) {
					if (numero == spot) {
						velha[i][j] = player;
					}
					numero++;
				}
			}	
			players++;
		}
		numeroDig++;
		}
		
	}
	// Métodos especiais Getters & Setters
	public String getPlayer() {
		return player;
	}
	
	public void setPlayer(String player) {
		this.player = player;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
}
