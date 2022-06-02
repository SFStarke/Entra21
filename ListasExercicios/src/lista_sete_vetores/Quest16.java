package lista_sete_vetores;

import java.util.Scanner;

public class Quest16 {
/*Questao 16 - Criar um programa que leia um vetor A[20]. A seguir, compacte este vetor A,
retirando todos os valores nulos ou negativos e mostre então o vetor compactado.
*/
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner read = new Scanner(System.in);
		//int aleatorio = 0;
		
		
		System.out.println("Compactador de valores:\n"
				+ "##########################\n");
		System.out.print("Vetor A: \n");
		for(int i = 0; i < a.length; i++) {
			int x = i;
			System.out.print("Digite o "+(x+=1)+"º valor: ");
			a[i] = read.nextInt();
			//aleatorio = (int)(-100 + Math.random() *(100 - -100));
			//a[i] = aleatorio;
		}
		System.out.print("\n#################################\n"
				+ "Vetor A Compactado: ");
		for(int i = 0; i < a.length; i++) {
			if(a[i]<=0) {
				continue;
			}else {
				a[i] = a[i];
				System.out.print(a[i]+". ");
			}
		}
		read.close();
	}
}
