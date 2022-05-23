package Lista6EstruturasRepitição;

public class Quest10 {
	/*
	 * Questão 10 - Escreva um PROGRAMA que encontre o quinto número maior que 1000,
	 * cuja divisão por 11 tenha resto 5
	 */
	public static void main(String[] args) {
		int q = 0, l = 1001;
		
		do {
			l++;
			if(l % 11 == 5) {
				q++;
			}
		}while(q < 5);
		System.out.println("O quinto maior nº cujo resto de 11 é 5 foi: "+l);
	}
}
