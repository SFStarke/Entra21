package oop_lista_cinco;

public class Professor extends Funcionario {
	private Disciplina[] disciplina;
	private String titulo;
	private String area;
	private double valorDedicacaoExclusiva;
	private double retribTitulacao;
	
	public Professor(int i) {
		this.disciplina = new Disciplina[i];
	}
	
	public Professor(String titulo, String area) {
		super();
		this.titulo = titulo;
		this.area = area;
	}

	public Disciplina getDisciplina(int i) {
		return disciplina[i];
	}

	public void setDisciplina(int i, Disciplina disciplina) {
		this.disciplina[i] = disciplina;
		disciplina.setProfessor(this);
	}

	public String getTituloProfessor() {
		return titulo;
	}
	
	public void setTituloProfessor(String tituloProfessor) {
		this.titulo = tituloProfessor;
	}
	
	public String getAreaProfessor() {
		return area;
	}
	
	public void setAreaProfessor(String areaProfessor) {
		this.area = areaProfessor;
	}
	
	public double getValorDedicacaoExclusiva() {
		return valorDedicacaoExclusiva;
	}

	public void setValorDedicacaoExclusiva(double valorDedicacaoExclusiva) {
		this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
	}

	public double getRetribTitulacao() {
		return retribTitulacao;
	}

	public void setRetribTitulacao(double retribTitulacao) {
		this.retribTitulacao = retribTitulacao;
	}
	
	@Override
	protected double calcSalario() {
		double salarioTotal = super.getSalarioBase() + this.valorDedicacaoExclusiva + this.retribTitulacao;
		return salarioTotal;
	}

	protected double calcSalario(double salarioBase, double valorDedicacaoExclusiva, double retribTitulacao) {
		super.setSalarioBase(salarioBase);
		this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
		this.retribTitulacao = retribTitulacao;
		double salarioTotal = super.getSalarioBase() + this.valorDedicacaoExclusiva + this.retribTitulacao;
		return salarioTotal;
	}

	@Override
	public String toString() {
		return " ##  PROFESSOR  ##" + "\n_____________________" + super.toString() + "\nTitulo=" + titulo + "\nÁrea=" + area;
	}
	
	public void exibirDisciplinas() {
		System.out.println("\n  Disciplinas");
		System.out.println("---------------");
		for (int i = 0; i < this.disciplina.length; i++) {
			if(this.disciplina[i] != null)
				System.out.println(" - " + this.disciplina[i].getNomeDisciplinas());
		}
		System.out.println();
	}
}
