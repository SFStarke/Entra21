package oop_lista_quatro;

public class Agenda {
	private Contato contatos[];
	private String nomeAgenda;
	
	public Agenda() {
		contatos = new Contato[2];
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public String showAgenda() {//Apresenta status da agenda
		String res = "";
		for (int i = 0; i < contatos.length; i++) {
			res +=  "CONTATO DE:\n"+contatos[i].showContatos()+"\n";
		}
		return "Nome da Agenda: "+this.getNomeAgenda()+"\n###########################\n"+res;
	}
}
