package Excecoes;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Conta c = new Conta(100);
		String loop = "S", resposta = "";

		System.out.println("Informe qual será o valor para Saldo Especial [ Limite ]:");
		c.setLimiteTeto(read.nextDouble());
		c.setLimite(c.getLimiteTeto());
		System.out.println("Informe qual será o valor para o Saldo da Conta:");
		c.setSaldo(read.nextDouble());
		do {
			System.out.println("O que deseja realizar:\n[ S ] Saque\n[ D ] Depósito\n[ E ] Encerrar Transação");
			resposta = read.next();
			if (resposta.equalsIgnoreCase("d")) {
				System.out.print("Qual é o valor do depósito R$");
				c.Depositando(read.nextDouble());
			} else if (resposta.equalsIgnoreCase("s")) {
				try {
					System.out.println("Qual é o valor do Saque R$");
					c.Sacando(read.nextDouble());
				} catch (ContaExcecao e) {// Tratamento na exceção criada.
					System.out.println(e);
					System.out.println("FAÇA UM DEPÓSITO ANTES");
				}
			} else if(resposta.equalsIgnoreCase("e")) {
				break;
			} else {
				System.out.println("\n___________\nComando errado\nTente novamente:");
			}
			System.out.println(c.toString());
			System.out.println("Nova Transação?\n[ S ] SIM\n[ N ] NÃO");
			resposta = read.next();
			if (resposta.equalsIgnoreCase("s")) {
				loop = resposta;
			} else if (resposta.equalsIgnoreCase("n")) {
				loop = resposta;
			} else {
				System.out.println("\n_________________\nComando Invalido\nTente Novamente\n");
				loop = "s";
			}
		} while (loop.equalsIgnoreCase("s"));
		System.out.println("Transações encerradas...");
		read.close();
	}
}

//		c.setSaldo(100);
//		c.setLimite(100);
//		
//		c.Depositando(201);
//
//		try {
//			c.Sacando(300);
//		} catch (ContaExcecao e) {
//			System.out.println(e);
//		}
//		
//		System.out.println(c.toString());