package Lista6EstruturasRepitição;

import java.util.Scanner;

public class Quest15 {
	/*
	 * Questao 15 – Faça um programa que leia o código e a senha de um usuário. Não
	 * aceite a senha igual ao código do usuário. Mostrando uma mensagem de erro e
	 * voltando a pedir as informações. Ob.: Código e senha números positivos
	 * inteiros
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int codigo = 0, senha = 0;
		boolean vereficar;
		String res = "";

		System.out.println("Conferência de codigo e senha.\n");

		do {
			System.out.print("\n#########################\n" 
		+ "Informe seu CÓDIGO: ");
			codigo = read.nextInt();
			System.out.print("\nInforme sua SENHA: ");
			senha = read.nextInt();
			vereficar = (codigo == senha) ? false : true;
			if ((codigo < 0) && (senha < 0)) {
				vereficar = false;
				System.out.println("\n*********************\n"
						+ "ERRO: Nº negativo não é aceito para codigo e ou senha..."
						+ "\n************************\n" );
			}else {
				vereficar = true;
			}
			res = (vereficar == false) ? "ERRO: Redundância cadastral entre senha e código"
					: "Cadastro bem sucedido...";
			System.out.println("*************************\n" + res);
		} while (vereficar == false);

		read.close();
	}

}
