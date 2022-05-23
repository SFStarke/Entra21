package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest10 {
	/*
	 * Questao 10 - Suponha que um caixa disponha apenas de notas de
1, 10 e 100.
Considerando que alguém está pagando uma compra.
Escreva um Programa que mostre
o número mínimo de cada nota que o caixa deve fornecer como
troco. O programa receberá como entrada o Valor da Compra e Valor
do pagamento, ambos os valores são inteiro.
Caso o valor do pagamento seja inferior ao valor da compra
o cálculo não será efetuado deverá imprimir a seguinte mensagem:
“Pagamento Negado”. Por Exemplo:
valor da compra = 725
valor do pagamento = 1.000
Troco = 275
Neste caso deve exibir 2 notas de R$ 100, 7 notas de R$ 10 E 5
NOTAS DE R$ 1
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int vCompra, vPago, tot, tiraCem, tiraDes;
		int um=0, des=0, cen=0;
		
		System.out.print("Troco de Caixa\n###############\n"
				+ "\nQual o valor da compra? R$");
		vCompra = read.nextInt();
		System.out.println();
		System.out.print("Informe o valor do pagamento: R$");
		vPago = read.nextInt();
		System.out.println();
		tot = vPago - vCompra;
		
		if (vPago < vCompra) {
			System.out.println("Pagamento Negado...");
		} else{
			if((tot > 100)) {
				cen = tot / 100;
				des = (tot - (cen * 100)) / 10;
				tiraCem = cen * 100;
				tiraDes = des * 10;
				um = tot - (tiraCem + tiraDes);
				System.out.println("Seu troco deve ser de "+cen+" notas de R$100. "+des+" notas de R$10 e "+
						um+" notas de R$1");
			}else if((tot > 10) && (tot < 100)) {
					des = tot / 10;
					tiraDes = des * 10;
					um = tot - tiraDes;
					System.out.println("Seu troco deve ser de "+des+" notas de R$10 e "+
							um+" notas de R$1");
			}else if((tot > 0) && (tot <= 10)) {
				um = tot;
				System.out.println("Seu troco deve ser de "+
						um+" notas de R$1");
			}
		}	
		read.close();
	}
}
