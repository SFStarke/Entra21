package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest09 {
	/*
	 * Questão_9 Sabendo-se que:
a. uma caixa de laranja contém 60 unidades
b. uma caixa de limão contém 80 unidades
c. uma caixa de morango contém 20 unidades
Faça um PROGRAMA em que o usuário
irá informar o fruto e o respectivo preço unitário e obtenha como 
resultado a fruta e o preço da caixa
	 * */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String fruto;
		float pUnitario, caixa = 0f;
		int laranja = 60, limao = 80, morango = 20;
		System.out.print("Qual o fruto?\nLaranja[la], Limão[li], Morango[m] ");
		fruto = read.nextLine();
		System.out.println();
		System.out.print("Qual o preço unitário do fruto? ");
		pUnitario = read.nextFloat();
		System.out.println();
		
		if (fruto.equals("la")) {
			caixa = pUnitario * laranja;
			fruto = "laranja";
		} else if(fruto.equals("li")){
			caixa = pUnitario * limao;
			fruto = "limão";
		}else if(fruto.equals("m")) {
			caixa = pUnitario * morango;
			fruto = "morango";
		}
		
		System.out.println("A caixa do(a) "+fruto+", custa R$"+ caixa);
		read.close();
	}
}
