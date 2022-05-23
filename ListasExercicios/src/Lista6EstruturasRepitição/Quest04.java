package Lista6EstruturasRepitição;

import java.util.Scanner;

/*Questão 4 - Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de 
altura e sexo (0=masc, 1=fem)
das pessoas. Faça um programa que leia 5 dados diferentes e informe:
a maior e a menor altura encontradas;
a média de altura das mulheres;
a média de altura da população;
o percentual de homens na população*/
public class Quest04 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float menorAltura = Float.MAX_VALUE, maiorAltura = Float.MIN_VALUE, altura = 0f, mediaAlturaMu = 0f, mediaAlturaPop = 0f;
		float totAltura = 0f, totAltMulheres = 0f;
		int l = 1, homens = 0, mulheres = 0, porcentoHomensPop = 0;
		String genero;
		System.out.println("Pesquisa populacional:\n" + "#################### ");
		while (l <= 5) {
			System.out.println("\n" + l + "º Questionário:");
			System.out.print("Sua altura? ");
			altura = read.nextFloat();
			totAltura += altura;
			maiorAltura = (maiorAltura < altura) ? altura : maiorAltura;
			menorAltura = (altura < menorAltura) ? altura : menorAltura;

			System.out.print("Seu genero é? Maculino[m] Feminino[f] ");
			genero = read.next();
			if ((!genero.equalsIgnoreCase("m")) && (!genero.equalsIgnoreCase("f"))) {
				System.out.println("ERRO: Caracter não procedente...");
				break;
			} else {
				if (genero.equalsIgnoreCase("m")) {
					homens++;
				} else if (genero.equalsIgnoreCase("f")) {
					mulheres++;
					totAltMulheres += altura;
				}
			}
			l++;
		}
		mediaAlturaPop = totAltura / 5;
		mediaAlturaMu = totAltMulheres / mulheres;
		porcentoHomensPop = (homens * 100) / 5;

		System.out.printf(
				"\n#################################\n" + "A maior altura é de %.2f m. O menor é de %.2f m.\n" + "",
				maiorAltura, menorAltura);
		System.out.printf("A média de altura das mulheres é %.2f m.", mediaAlturaMu);
		System.out.printf("\nA média da altura populacional é de %.2f m \n", mediaAlturaPop);
		System.out.println(porcentoHomensPop + "% da população é de homens.");
		read.close();
	}
}
