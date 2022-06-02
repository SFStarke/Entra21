package lista_sete_vetores;

import java.util.Scanner;

/*Questão 17 - Escreva um programa que receba o nome de cinco clientes e armazene-os em
um vetor. Em um segundo vetor, armazene a quantidade de DVDs locados em 2022 por cada
um dos cinco clientes. Sabe-se que, para cada dez locações, o cliente tem direito a uma
locação grátis. O programa deverá mostrar todos os nomes dos clientes com a quantidade de
locação grátis que ele tem direito.
*/
public class Quest17 {

	public static void main(String[] args) {
		String cliente[] = new String[1];
		int dvd[] = new int[5];
		int prom = 0;
		Scanner read = new Scanner(System.in);

		System.out.println("Cadastro promocional de locação de DVDs:\n"
		+ "##########################\n");

		for (int i = 0; i < cliente.length; i++) {
			System.out.print("Nome do Cliente: ");
			cliente[i] = read.nextLine();
			if(i > 0) {
				cliente[i] =  read.nextLine();
			}
			System.out.print("Quantos DVDs foram locados este ano? ");
			dvd[i] = read.nextInt();
		}
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
		for(int i = 0 ; i < dvd.length; i++) {
			if(dvd[i] > 0 && dvd[i] < 10) {
				prom = 0;
				System.out.print("O cliente "+cliente[i]+" ainda não tem direito a locação gratis.\n");
			}else if(dvd[i] >= 10 && dvd[i] < 1000){
				prom = dvd[i]/10;
				System.out.print("O cliente "+cliente[i]+" tem direito a "+prom+" locação gratis.\n");
			}
		}
		read.close();
	}
}
/*for(int i = 0; i < cliente.length; i++) {
			System.out.println("Cliente: "+cliente[i]);
			System.out.println("DVDs: "+dvd[i]);
		}
		/*for (int i = 0; i < cliente.length; i++) {
			
			for (int j = 10; j <= dvd[i]; j += 10) {
				if (j == dvd[i]) {
					prom++;
					System.out.println(prom);
				} else {
					continue;
				}
			}
		}*/

/*
 * do { System.out.print("Nome do Cliente: "); cliente[x] = read.nextLine();
 * System.out.print("Quantos DVDs foram locados este ano? "); dvd[x] =
 * read.nextInt(); x++; }while(x < cliente.length);
 */
