package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest06 {
	/*
	 * Questão_6: O IMC – Índice de Massa Corporal é um critério
da Organização Mundial de Saúde para dar uma indicação
sobre a condição de peso de uma pessoa adulta. A fórmula é
IMC = peso/(altura)2
. Elabore um PROGRAMA que leia o peso
e a altura de um adulto e mostre sua condição.
	 * */

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		float peso = read.nextFloat();
		System.out.println("");
		System.out.print("Informe sua altura: ");
		float altura = read.nextFloat();
		System.out.println("");
		double alturaQuadrado = Math.pow(altura, 2);
		double imc = peso/alturaQuadrado;

		System.out.println("Seu IMC é de "+ (int)imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso...");
		}else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("Peso normal...");
		}else if ((imc >= 25) && (imc < 30)) {
			System.out.println("Acima peso...");
		}else if(imc >= 30) {
			System.out.println("Obeso...");
		}
		read.close();

	}

}
