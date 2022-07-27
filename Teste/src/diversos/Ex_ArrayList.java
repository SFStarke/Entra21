package diversos;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// INÍCIO EX. 01 | Atribuindo inf. aos vetores
		String[] nomes = { "Meu", "nome", "Sérgio" };
		Integer[] idade = { 46, 47, 48, 49 };
		Float[] certo = { 1.87f, 2f };

		print(nomes);
		System.out.println();
		print(idade);
		System.out.println();
		print(certo);// FIM EX. 01

		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨\nS E G U E  O U T R O   E X E M P L O\n");
		// ArrayList criado por "TIPO" Object. Recebendo assim TIPOS DIFERENTES "Sem warning".
		ArrayList<Object> a = new ArrayList<Object>();// INÍCIO EX.ARRAYLIST

		a.add("Sérgio");
		a.add(48);
		a.add(true);
		a.add(1.87f);

		for (Object x : a) {
			System.out.print(x + ". ");
		} // FIM EX.ARRAYLIST
	}
// F O R A   D O   M A I N ...
	public static <S> void print(S[] set) {// MÉTODO |GENÉRICO| ESTÁTICO PARA EX.01
		for (S y : set)
			System.out.printf("%s", y + " ");
	}
}
