package exercicio_cinema;

import java.util.Scanner;

public class QuestionarioCinema {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int capacidadeMax = 2, idade = 0, loop = 0;
		int quantOtima = 0, quantBom=0, quantRegular=0, quantRuim;
		int maiorIdadePessimo = 0, DifIdadeMaiorOtimoRuim = 0, maiorIdadeOtimo;
		int maiorIdadeRuim, opiniao = 0;
		float porcBomReg = 0, mediaIdadeRuim = 0,porcRespoPessimo = 0;
		String otimo="*****", bom="****", regular="***", ruim="**", pessimo="*";
		
		for(int i = 1; i <= capacidadeMax; i++) {
			while(idade <= 0) {
				System.out.println("Idade Inválida.\nInforme sua Idade: Sempre maior que zero[ 0 ]");
				idade = read.nextInt();
			}
			System.out.println("Selecione uma opinião:\n[5] ***** Ótimo:\n"
					+ "[4] **** Bom:\n[3] *** Regular:\n[2] ** Ruim:\n[1] * Péssimo:");
			while(opiniao < 1 || opiniao > 5) {
				opiniao = read.nextInt();
				System.out.println("Informe uma opinião válida:\n###########\n");
				System.out.println("Selecione uma opinião:\n[5] ***** Ótimo:\n"
						+ "[4] **** Bom:\n[3] *** Regular:\n[2] ** Ruim:\n[1] * Péssimo:");
			}
			
		}

		read.close();
	}
}
