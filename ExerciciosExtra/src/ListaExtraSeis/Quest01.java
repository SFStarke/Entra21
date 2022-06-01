package ListaExtraSeis;

import java.util.Scanner;

public class Quest01 {
	/*
	 * Questao 1 - Escreva um programa que verifique a validade de uma senha
	 * fornecida pelo usuário. A senha válida é o número 1234. Se a senha informada
	 * pelo usuário for inválida, a mensagem ACESSO NEGADO deve ser impressa e
	 * repetida a solicitação de uma nova senha até que ela seja válida. Caso
	 * contrário, deve ser impressa a mensagem ACESSO PERMITIDO junto com um número
	 * que representa quantas vezes a senha foi informada.
	 */
	public static void main(String[] args) {
		int senha[] = { 1234 };
		int numero[] = new int[senha.length];
		String res = "";
		int vezesDigitado = 1;
		boolean confirma = false;
		Scanner read = new Scanner(System.in);

		do {
			System.out.print("Senha: ");
			for (int i = 0; i < numero.length; i++) {
				numero[i] = read.nextInt();
			}
			for (int i = 0; i < senha.length; i++) {
				if (senha[i] == numero[i]) {
					confirma = true;
				} else {
					confirma = false;
				}
				if (confirma == true) {
					System.out.println("\n###############\nACESSO PERMITIDO");
				} else {
					System.out.println("\n###############\nACESSO NEGADO:\nRefaça sua senha.\n###############\n");
					vezesDigitado++;
				}
			}
			System.out.println(res);
		} while (confirma == false);
		res = (vezesDigitado == 1) ? "Foi realizada "+vezesDigitado+" tentativa para o acesso." :
			"Foram realizadas "+vezesDigitado+" tentativas para o acesso.";
		System.out.println(res);
		read.close();
	}
}
