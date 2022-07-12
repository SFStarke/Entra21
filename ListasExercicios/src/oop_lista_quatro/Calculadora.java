package oop_lista_quatro;

public class Calculadora {

	public static int setSoma(int a, int b) {
		return a + b;
	}

	public static int sestSubtracao(int a, int b) {
		return a - b;
	}

	public static int setMultiplicacao(int a, int b) {
		return a * b;
	}

	public static int setDivisao(int a, int b) {
		return a / b;
	}

	public static int setPotenciacao(int a, int b) {
		//   Potenciação, também chamada de exponenciação, representa a
		// multiplicação de um número feita " N " vezes por ele mesmo.
		int total = 1;
		for (int i = 1; i <= b; i++) {
			total *= a;
		}

		return total;
	}

}
