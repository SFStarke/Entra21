package oop_lista_quatro;

import java.util.Scanner;

public class MainAgenda {
	/*
	 * 4. Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
	 * Cada contato possui nome, telefone e email. A Agenda também possui um nome.
	 * Crie um programa teste que peça para o usuário entrar com o nome da Agenda e
	 * em seguida 3 contatos. Crie métodos que retornem uma String com a informação
	 * de cada contato e também de todos os contatos da agenda.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contatos[] = new Contato[3];// Se alterar valor do vetor, Não alterar tambêm na Classe "Agenda".

		System.out.print("De um nome á sua agenda: ");
		agenda.setNomeAgenda(read.nextLine());
		for (int i = 0; i < contatos.length; i++) {
			Contato x = new Contato();
			System.out.print("\nNome do " + (i + 1) + "º contato: ");
			x.setNomeContato(read.nextLine());
			System.out.print("\nNº do telefone de " + x.getNomeContato() + ": ");
			x.setTelefoneContato(read.nextLine());
			System.out.print("\nE-MAIL de " + x.getNomeContato() + ": ");
			x.setEmailContato(read.nextLine());
			contatos[i] = x;
		}
		agenda.setContatos(contatos);// Nunca esquecer de implementar.
		System.out.println("\n**************************\n" + agenda.showAgenda());

		read.close();
	}
}
