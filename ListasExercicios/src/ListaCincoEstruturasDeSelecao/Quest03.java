package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Quest03 {

	/*
	 * Quest�o_3: Tendo como dados de entrada a altura e o sexo de uma pessoa,
	 * construa um PROGRAMA que calcule seu peso ideal, utilizando as seguintes f�rmulas: 
	 * Para homens: (72.7*alt) - 58;
	 * Para mulheres: (62.1*alt) - 44.7;
	 * */
	
	public static void main(String[] args) {
		float altura, imc = 0f;
		char genero;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Saiba qual seria seu peso ideal:\n"
				+ "Informe sua altura? ");
		altura = read.nextFloat();
		System.out.println("Informe seu genero? Masculino(m) ou Feminino (f): ");
		genero = read.next().charAt(0);
		
		if ((genero == 'm')||(genero == 'M')) {
			imc = (float) (72.7 * altura) - 58f;
		}else if ((genero == 'f')||(genero == 'F')){
			imc = (float) (62.1 * altura) - 44.7f;
		}else {
			System.out.println("Erro ao informar seu genero...");
		}
		
		System.out.printf("O peso ideal para voçê seria de %.2f",imc);
		
		read.close();
	}
}
