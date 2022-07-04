package getao_academica;

public class Professor {
	private String titulacao, areaPesquisa;
	Funcionario fun = new Funcionario();

	public Professor() {}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}

	public void setAreaPesquisa(String areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}
	
	
}
