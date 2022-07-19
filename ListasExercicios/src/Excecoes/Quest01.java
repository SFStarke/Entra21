package Excecoes;

public class Quest01 {

	public static void main(String[] args) {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("Início do método1");
		metodo2();
		System.out.println("Fim do método1");
	}

	static void metodo2() {
		System.out.println("Início do método2");
		try {
			int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
			System.out.println("Fim do método2");
		} catch (ArrayIndexOutOfBoundsException e) {
			int[] array = new int[10];
			for (int j = 0; j < array.length; j++) {
				array[j] = j;
				System.out.println(j);
			}
			// System.out.println("BUUURRRO:\nCorrija a referrencia do for:
			// \n**************\n");
		}
	}
}
