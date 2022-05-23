package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest15 {
	/*
 Questão 15 – Faça um programa que peça ao usuário 
 para escolher o tipo de carne, e digite a quantidade em kg .
 O programa deverá:
imprimir a quantidade e o tipo de carne que foi escolhida;
Dependendo do tipo de carne e quantidade;
Definir qual será o valor da carne;
Calcular o valor de carne com quantidade;
Imprimir na mesma linha o calculo feito e o total;
Informar que se pagamento no cartão digitar a opção 1 e conceder o desconto
de 5% no total
imprimir o valor de desconto caso teve
imprimir o total a pagar.
Seguindo as informações abaixo:
Tipo de carne: Preço kg
Qtd < 5kg Qtd > 5kg
File duplo; 4,9 5,8
Alcatra; 5,9 6,8
Picanha 6,9 7,8
(VARIAÇÃO DA QUESTAO 11)
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float kg, valor = 0f;
		String tipo, formaPagamento;
		float precoKg = 0f, desconto = 0f;
		
		System.out.println("Orçamento de carnes.\n"
				+ "**************************************\n");
		System.out.print("Qual o tipo da carne? \n"
				+ "File duplo [ f ]. Alcatra [ a ].  Picanha [ p ]. ");
		tipo = read.next();
		if((!tipo.equalsIgnoreCase("f"))&&(!tipo.equalsIgnoreCase("a"))&&(!tipo.equalsIgnoreCase("p"))) {
			System.out.println("\n!!!!!!!!!!!!!!!!!!\nERRO... Digito não correspondente.\n!!!!!!!!!!!!!!");
			System.exit(0);
		}
		System.out.print("\nQuantos quilos? ");
		kg = read.nextFloat();
		System.out.print("\nO pagamento será no cartão?\n"
				+ "Caso sim [ 1 ]. Senão qualquer outra tecla... ");
		formaPagamento = read.next();
		
		if (kg < 5) {
			if (tipo.equalsIgnoreCase("f")) {
				precoKg = 4.9f;
				valor = kg * precoKg;
			} else if(tipo.equalsIgnoreCase("a")){
				precoKg = 5.9f;
				valor = kg * precoKg;
			}else if(tipo.equalsIgnoreCase("p")) {
				precoKg = 6.9f;
				valor = kg * precoKg;
			}
		} else {
			if (tipo.equalsIgnoreCase("f")) {
				precoKg = 5.8f;
				valor = kg * precoKg;
			} else if(tipo.equalsIgnoreCase("a")){
				precoKg = 6.8f;
				valor = kg * precoKg;
			}else if(tipo.equalsIgnoreCase("p")) {
				precoKg = 7.8f;
				valor = kg * precoKg;
			}
		}
		tipo = tipo.equalsIgnoreCase("f") ? "File duplo" :
			   tipo.equalsIgnoreCase("a") ? "Alcatra" : "Picanha";
		System.out.println("################################################\n");
		
		if (formaPagamento.equals("1")) {
			System.out.printf("Foi selecionado %s na quantidade de %.2f kg",tipo, kg);
			System.out.printf("\nSeu preço por quilo é de R$%.2f. Seu custo total é de R$%.2f",precoKg,valor);
			desconto = valor * 0.05f;
			valor = (float) (formaPagamento.equalsIgnoreCase("1") ? valor - (valor * 0.05) : valor);
			System.out.printf("\nSua forma de pagamento concedeu um desconto de R$%.2f \n "
					+ "    Combinando no total á pagar de R$%.2f",desconto, valor);
		} else {
			System.out.printf("Foi selecionado %s na quantidade de %.2f kg",tipo, kg);
			System.out.printf("\nSeu preço por quilo é de R$%.2f. Seu custo total é de R$%.2f",precoKg, valor);
		}
	read.close();
	}
}
