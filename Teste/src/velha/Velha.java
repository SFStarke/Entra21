package velha;

import java.util.Scanner;

public class Velha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char velha[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		for (int i = 0; i < velha.length; i++) {
			System.out.println();
			for (int j = 0; j < velha[i].length; j++) {
				System.out.print(velha[i][j]+" |");
				//Quem perde começa.
			}
		}
		read.close();
	}

}
