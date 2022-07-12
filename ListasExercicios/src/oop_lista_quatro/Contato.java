package oop_lista_quatro;

public class Contato {
	String nomeContato, telefoneContato, emailContato;

	public Contato() {}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String showContatos() {//Apresenta status do contato
		return this.getNomeContato()+".\nTelefone: "+this.getTelefoneContato()+"\n"
				+ "E-mail: "+this.getEmailContato()+"\n_________________________________";
	}
}
