package lista_sete_vetores;

public class Quest18 {
	/*
	 * Questão 18 - Faça um programa que gere os 10 primeiros números primos acima
	 * de 100 e armazene-os em um vetor X[10]. Ao final do programa, mostre então o
	 * vetor X
	 */
	public static void main(String[] args) {
		int[] x = new int[10];
		int primo = 0, init = 1, end = 101;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = init; j <=  end; j++) {
				primo = end % j == 0 ? primo += 1 : primo;
			}
			if(primo == 2) {
				x[i] = end;
			}else {
				i--;
			}
			primo = 0; 
			end +=1;
		}
		for(int i = 0; i < x.length; i++) {
			System.out.println("Vetor ["+i+"]: "+x[i]);
		}
		
		/*for(int i = 0; i < x.length; i++) {
			System.out.println("Vetor ["+i+"]: "+x[i]);
		}*/
		
		/*int primo = 0, loop = 1, n = 101, b = 0, completar = 0;
		
		do {
			
			do {
			primo = end % init == 0 ? primo += 1 : primo;
			
			//System.out.println("Loop: "+loop);
		loop++;
		}while(loop < 500);
			n++;
			if(primo == 2) {
				completar++;
				
			}
		}while(completar <= 10);
		
		
		System.out.println("Vetor "+x[b]+": ");
		System.out.println("Primo: "+primo);
			System.out.println(n);*/
		
		/*
		 * do {
		 * for (int i = 1; i < 155; i++) {
		 * primo = n % i == 0 ? primo += 1 : primo;
		 * }
		 * if (primo == 2) { 
		 * x[a] = n; a++; 
		 * } else if(x.length == 10) {
		 *  break;
		 * } n++;
		 * }while( n < 155);
		 * 
		 * for(int res: x) { 
		 * System.out.println("Vetor["+b+"]: "+res);
		 * b++;
		 *  }
		 * 
		 * 
		 * System.out.println("\nprimo: "+primo);
		 */
		}
	}

