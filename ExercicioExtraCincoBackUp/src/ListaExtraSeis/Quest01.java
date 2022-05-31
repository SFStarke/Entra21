package ListaExtraSeis;

import java.util.Scanner;

public class Quest01 {
/*Questao 1 - Escreva um programa que verifique a validade de uma senha 
fornecida pelo usuário. A senha válida é o número 1234. Se a senha 
informada pelo usuário for inválida, a mensagem ACESSO NEGADO deve ser 
impressa e repetida a solicitação de uma nova senha até que ela seja válida. 
Caso contrário, deve ser impressa a mensagem ACESSO PERMITIDO junto com 
um número que representa quantas vezes a senha foi informada.
 * */
	public static void main(String[] args) {
		int senha[] = {1,2,3,4};
		
		boolean confirma = false;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Senha: ");
		do {
			for (int i = 0; i < senha.length; i++) {
				System.out.print("");
				senha[i] = read.nextInt();
			}
			if(senha[i]== ){
				
			}
				
		}while(confirma == false);
		
		read.close();
	}
}
