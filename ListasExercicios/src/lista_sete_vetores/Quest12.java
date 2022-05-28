package lista_sete_vetores;

import java.util.Scanner;

public class Quest12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[10];
		boolean conf = true;
		String resPar = "";
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + 1 + "º Valor");
			a[i] = read.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			conf = a[i] % 2 == 0 ? true : false;
			if(conf == false) {
				break;
			}
		}
		resPar = conf == true ? "TODOS os números do vetor são pares." :
			"NEM todos os números do vetor são pares.";
		System.out.println(resPar);
		read.close();
	}
}
