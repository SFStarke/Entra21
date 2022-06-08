package lista_oito_matriz;

import java.util.Scanner;

public class Quest06 {
	/*
	 * 6. Faça um programa para jogar o jogo da velha. O programa deve permitir que
	 * dois jogadores façam uma partida do jogo da velha, usando o computador para
	 * ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde
	 * deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas
	 * inválidas e determinar automaticamente quando o jogo terminou e quem foi o
	 * vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve
	 * atualizar a situação do tabuleiro na tela.
	 */
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		char[][] mat = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		int cont = 0;
		char jog = 0;
		char x = 'X';
		char o = 'O';

		while (true) {
			cont++;

			for (int i = 0; i < mat.length; i++) {
				System.out.println("---------------");

				for (int j = 0; j < mat[i].length; j++) {

					if (mat[i][j] == jog && cont % 2 == 1)
						mat[i][j] = x;
					else if (mat[i][j] == jog && cont % 2 == 0)
						mat[i][j] = o;

					System.out.print("| " + mat[i][j] + " |");
				}

				System.out.println("\n---------------");
			}

			if ((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == x)
					|| (mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == x)
					|| (mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == x)
					|| (mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == x)
					|| (mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == x)
					|| (mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == x)
					|| (mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == x)
					|| (mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == x)) {
				System.out.println("\nO 'X' venceu! Parabéns!!!");
				break;
			} else if ((mat[0][0] == mat[0][1] && mat[0][0] == mat[0][2] && mat[0][0] == o)
					|| (mat[1][0] == mat[1][1] && mat[1][0] == mat[1][2] && mat[1][0] == o)
					|| (mat[2][0] == mat[2][1] && mat[2][0] == mat[2][2] && mat[2][0] == o)
					|| (mat[0][0] == mat[1][0] && mat[0][0] == mat[2][0] && mat[0][0] == o)
					|| (mat[0][1] == mat[1][1] && mat[0][1] == mat[2][1] && mat[0][1] == o)
					|| (mat[0][2] == mat[1][2] && mat[0][2] == mat[2][2] && mat[0][2] == o)
					|| (mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2] && mat[0][0] == o)
					|| (mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] && mat[2][0] == o)) {
				System.out.println("\nO 'O' venceu! Parabéns!!!");
				break;
			}

			if (cont == 10) {
				System.out.println("\nJogo empatado.");
				break;
			}

			System.out.println();

			lacoW: while (true) {
				if (cont % 2 == 1) {
					System.out.print("Informe a posição onde quer jogar (O): ");
					jog = ent.next().charAt(0);
				} else {
					System.out.print("Informe a posição onde quer jogar (X): ");
					jog = ent.next().charAt(0);
				}

				for (char[] cs : mat) {
					for (char cs2 : cs) {
						if (cont % 2 == 1 && cs2 == jog && jog != x)
							break lacoW;
						else if (cont % 2 == 0 && cs2 == jog && jog != o)
							break lacoW;
					}
				}
				System.out.println("Jogada inválida.");
			}

		}
		System.out.println("\nFim de jogo.");

		ent.close();
	}
}
