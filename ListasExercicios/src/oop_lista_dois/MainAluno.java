package oop_lista_dois;

public class MainAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		 
// No Método aluno(), são informados: Nome do aluno, Nº da matricula e Curso exercido.
		a.aluno("Sérgio Felipe Starke", 1, "Java Avançado");
		
		a.disciplinas[0] = "Inglês";
		a.disciplinas[1] = "Desv. Humano";
		a.disciplinas[2] = "Java";
		
		a.notas[0] = 6;
		a.notas[1] = 7;
		a.notas[2] = 7;

		System.out.println(a.status());
		
	}
}
