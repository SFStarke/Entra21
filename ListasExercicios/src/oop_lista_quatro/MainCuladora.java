package oop_lista_quatro;

public class MainCuladora {
	/*
	 * 2. Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
	 * subtrair, multiplicar, dividir (dois números), elevar à potência n.
	 * Desenvolva um programa para testar essa classe.
	 */
	public static void main(String[] args) {
		
		
		System.out.println(Calculadora.setSoma(2, 3));
		System.out.println(Calculadora.sestSubtracao(2, 1));
		System.out.println(Calculadora.setDivisao(25, 5));
		System.out.println(Calculadora.setMultiplicacao(5, 2));
		System.out.println(Calculadora.setPotenciacao(5, 3));
	}
//	static void showResult() {
//		System.out.println("O resultado é: "+ Calculadora.);
//	}
}
