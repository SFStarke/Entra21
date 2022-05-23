package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest08 {
	/*
	 * Questão_8: Pensando no grande número de motoristas que
viajam no feriado, um posto de combustíveis resolveu fazer
uma super promoção, oferecendo preços abaixo do mercado:
Tipo de
Combustível             Valor por Litro
Gasolina 				R$ 2,53
Etanol 					R$ 2,09
Diesel 					R$ 1,92

Além disso, todos os clientes que abastecerem seus veículos
com mais de 30 litros de etanol serão premiados com uma
troca de óleo.
Escreva um programa para esse posto de modo
que ele receba como entrada o combustível escolhido e a
quantidade de litros que deseja abastecer, calcule e informe
o total a pagar de combustível e uma mensagem indicando se
o cliente ganhou ou não a troca de óleo.
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char tipo;
		float litro, valor, g = 2.53f, e = 2.09f, d = 1.92f;
		
		System.out.println("Qual o tipo do combustíval?\n Gasolina[g], Etanol[e], Diesel[d]");
		tipo = read.next().charAt(0);
		System.out.print("Quantos litros? ");
		litro = read.nextFloat();
		
		if ((litro >= 30) && (tipo == 'e')) {
			valor = litro * e;
			System.out.println("Etanol: Total R$"+valor+". Brinde troca de óleo");
		}else if(tipo == 'e') {
			valor = litro * e;
			System.out.println("Etanol: Total R$"+valor);
		}else if(tipo == 'g') {
			valor = litro * g;
			System.out.println("Gasolina: Total R$"+valor);
		}else if(tipo == 'd') {
			valor = litro * d;
			System.out.println("Diesel: Total R$"+valor);
		}
		read.close();
	}
}
