package oop_lista_dois;

import java.util.Scanner;

public class MainJogoVelha {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		JogoVelha x = new JogoVelha();
		int loop = 0;
		
		System.out.print("\n**********************\nO [ X ] é o que começa:");
		do {
			if(x.checkWinner() == true) {
				System.out.print(x.getWinner());
				x.getBoard(); // Apresenta o tabuleiro;
				break;
			}else {
				String res = x.getPlayer().equalsIgnoreCase("x") ? 
					"\n********************\n[ O ] Escolha o nº do tabuleiro: ":
						"\n********************\n[ X ] Escolha o nº do tabuleiro: ";
			System.out.print("\n"+ res+"\n");
			x.getBoard();              // Apresenta o tabuleiro;
			x.setPlay(read.nextInt()); // Efetiva a entrada do número para a escolha no tabuleiro.
			loop++;
			}
			if (loop == 9) {
				System.out.println("\nO JOGO EMPATOU...");
			}
		}while((loop < 9));
		read.close();
	}
}
