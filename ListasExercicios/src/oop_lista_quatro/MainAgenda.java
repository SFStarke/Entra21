package oop_lista_quatro;

import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contatos[] = new Contato[2];

		System.out.print("De um nome á sua agenda: ");
		agenda.setNomeAgenda(read.nextLine());
		for (int i = 0; i < contatos.length; i++) {
			Contato x = new Contato();
			System.out.print("\nNome do " + (i + 1) + "º contato: ");
			x.setNomeContato(read.nextLine());
			System.out.print("\nNº do telefone de "+x.getNomeContato()+": ");
			x.setTelefoneContato(read.nextLine());
			System.out.print("\nE-MAIL de "+x.getNomeContato()+": ");
			x.setEmailContato(read.nextLine());
			contatos[i] = x;
		}
		agenda.setContatos(contatos);//Nunca esquecer de implementar.
		System.out.println("\n**************************\n"
		+ agenda.showAgenda());

		read.close();
	}
}
