package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest07 {

	/*
	 * Questão_7: Natália abriu uma loja de bijuterias recentemente
e as vendas vão muito bem. Pensando em atrair uma clientela
ainda maior, ela deseja oferecer um desconto de 10% para os
clientes que gastarem R$ 100 ou mais e pagarem em dinheiro.
Escreva um programa que receba como entrada o valor do
produto comprado e a forma de pagamento escolhida (dinheiro
ou cheque). calcule o desconto devido (caso necessário), e
exiba o valor final a ser pago.
Lembrete: 10% de um valor = (10/100) * valor
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float valorTot;
		System.out.print("Qual foi o valor pago pela bijuteria? R$");
		float valor = read.nextFloat();
		System.out.printf("\nForma de pagamento? Dinheiro[d] ou Cheque[c]");
		char forma = read.next().charAt(0);
		
		if((forma == 'd') && (valor >= 100)) {
			valorTot = (float) (valor - (valor * 0.10));
			System.out.println("Sua compra teve um desconto de 10% e o valor total a pagar é R$"+valorTot);
		}else {
			valorTot = valor;
			System.out.printf("Total a pagar é de R$%.2f\n",valorTot);
		}
		read.close();
	}
}
