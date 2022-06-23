package matriz;

import java.util.Scanner;

public class Filhos {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int pessoas = 0, filhos = 0;

		System.out.print("Quantas pessoas serão entrevistadas? ");
		pessoas = read.nextInt();
		String fam[][][] = new String[pessoas][][];

		for (int i = 0; i < fam.length; i++) {
System.out.print(i + 1 + "º Entrevistado:\nQuantos filhos você tem? ");
			filhos = read.nextInt();
			fam[i] = new String [filhos][];
			for (int j = 0; j < fam[i].length; j++) {
				fam[i][j] = new String [2];
				for (int k = 0; k < fam[i][j].length; k++) {
					if (k == 0) {
						System.out.print("Nome do filho: ");
						fam[i][j][k] = read.next();
					} else if (k == 1) {
						System.out.print("Idade: ");
						fam[i][j][k] = read.next();
					}
				}
			}
		}
		for (int i = 0; i < fam.length; i++) {
			for (int j = 0; j < fam[i].length; j++) {
				System.out.println();
				for (int j2 = 0; j2 < fam[i][j].length; j2++) {
					System.out.print(fam[i][j][j2]+". ");
				}
			}
		}
		read.close();
	}
}
