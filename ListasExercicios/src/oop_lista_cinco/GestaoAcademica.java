package oop_lista_cinco;

import java.util.Scanner;

public class GestaoAcademica {
public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Curso[] cursos = new Curso[2]; 
		Tecnico[] tecnicos = new Tecnico[4];
		int cont = 0;

//	Entrada de dados dos técnicos
		System.out.println("  ==  TÉCNICOS  ==");
		System.out.println("____________________");
		System.out.print("Informe o valor do auxílio alimentação pago pela universidade: ");
		Tecnico.setAuxAlimentacao(ent.nextDouble());
		System.out.println(ent.nextLine());
		
		for (int i = 0; i < tecnicos.length; i++) {
			Tecnico tec = new Tecnico();
			cont = 0;
			
			System.out.printf("Informe o nome do %dº auxiliar técnico ou digite \"sair\": ", (i + 1));
			tec.setNomeFuncionario(ent.nextLine());
			
			if(tec.getNomeFuncionario().equalsIgnoreCase("sair")) {
				System.out.println();
				break;
			}
			
			for (int j = 0; j < tecnicos.length; j++) {
				if(tecnicos[j] != null) {
					if(tec.getNomeFuncionario().equalsIgnoreCase(tecnicos[j].getNomeFuncionario())) {
						System.out.println("Técnico já cadastrado.");
						i--;
						cont++;
					}
				}
			}
			
			if(cont == 0) {
				System.out.print("Telefone: ");
				tec.setTelefoneFuncionario(ent.nextInt());
				System.out.print("CPF: ");
				tec.setCpfFuncionario(ent.nextInt());
				System.out.print("CTPS: ");
				tec.setCtpsFuncionario(ent.next());
				System.out.print("Endereço: ");
				ent.nextLine();
				tec.setEnderecoFuncionario(ent.nextLine());
				System.out.print("Cargo: ");
				tec.setCargoTecnico(ent.nextLine());
				System.out.print("Departamento: ");
				tec.setDepartamentoTecnico(ent.nextLine());
				System.out.print("Salário base: ");
				tec.setSalarioBase(ent.nextDouble());
				System.out.print("Auxílio transporte: ");
				tec.setAuxTransporte(ent.nextDouble());
				
				ent.nextLine();
				tecnicos[i] = tec;
			}
			System.out.println();
		}

//	Entrada de dados dos cursos
		System.out.println("  ==  CURSOS  ==");
		System.out.println("__________________");
		for (int i = 0; i < cursos.length; i++) {
			Curso curso = new Curso(3, 6);
			
			System.out.printf("Informe o nome do %dº curso: ", i + 1);
			curso.setNomeCurso(ent.nextLine());
			System.out.printf("Informe o código do %dº curso: ", i + 1);
			curso.setCodigoCurso(ent.next());
			System.out.printf("Informe a duração do %dº curso: ", i + 1);
			ent.nextLine();
			curso.setDuracaoCurso(ent.nextLine());
			
			System.out.println();
			cursos[i] = curso;
		}
		
//	Entrada de dados das disciplinas
		System.out.println("  ==  DISCIPLINAS  ==");
		System.out.println("_______________________");
		for (int i = 0; i < 3; i++) {
			Disciplina disc = new Disciplina(2);
		
			System.out.printf("Informe o nome da %dª disciplina do curso de %s: ", (i + 1), cursos[0].getNomeCurso());
			disc.setNomeDisciplinas(ent.nextLine());
			System.out.print("Informe o código: ");
			disc.setCodigoDisciplina(ent.next());
			System.out.print("Informe a carga horária: ");
			ent.nextLine();
			disc.setCargaHorariaDisciplina(ent.nextLine());
			System.out.println();
			
			cursos[0].setDisciplina((i), disc);
			disc.setCurso(0, cursos[0]);
		}
		
		for (int i = 0; i < 3; i++) {
			Disciplina disc = new Disciplina(2);
			
			System.out.printf("Informe o nome da %dª disciplina do curso de %s: ", (i + 1), cursos[1].getNomeCurso());
			disc.setNomeDisciplinas(ent.nextLine());
			
			for (int j = 0; j < 3; j++) {
				cursos[0].getDisciplina(j);
				if(cursos[0].getDisciplina(j).getNomeDisciplinas().equalsIgnoreCase(disc.getNomeDisciplinas())) {
					cursos[1].setDisciplina(i, cursos[0].getDisciplina(j));
					cursos[0].getDisciplina(j).setCurso(1, cursos[1]);
					System.out.println();
				}
			}
			
			if(cursos[1].getDisciplina(i) == null) {
				System.out.print("Informe o código: ");
				disc.setCodigoDisciplina(ent.next());
				System.out.print("Informe a carga horária: ");
				ent.nextLine();
				disc.setCargaHorariaDisciplina(ent.nextLine());
				System.out.println();
				cursos[1].setDisciplina(i, disc);
				disc.setCurso(0, cursos[1]);
			}
		}

//	Entrada de dados dos professores
		System.out.println("  ==  PROFESSORES  ==");
		System.out.println("_______________________");
		for (int i = 0; i < 6; i++) {
			Professor prof = new Professor(6);
			int pos = 0;
			cont = 0;
			
			if(i <= 2) {
				System.out.printf("Informe o nome do professor da disciplina %s: ", cursos[0].getDisciplina(i).getNomeDisciplinas());
				prof.setNomeFuncionario(ent.nextLine());
				for (int j = 0; j < 3; j++) {
					if(cursos[0].getDisciplina(j).getProfessor() != null ) {
						if(cursos[0].getDisciplina(j).getProfessor().getNomeFuncionario().equalsIgnoreCase(prof.getNomeFuncionario())) {
							cont++;
							pos = j;
						}
					}
				}
				if(cont != 0) {
					cursos[0].getDisciplina(pos).getProfessor().setDisciplina(cont, cursos[0].getDisciplina(i));
					System.out.println();
				}
			}else {
				for (int x = 0; x < 3; x++) {
					if(cursos[1].getDisciplina(i - 3).getNomeDisciplinas().equalsIgnoreCase(cursos[0].getDisciplina(x).getNomeDisciplinas()))
						cont++;
				}
					
				if(cont == 0) {
					int pos1 = 0;
					int ver0 = 0;
					int ver1 = 0;
					System.out.printf("Informe o nome do professor da disciplina %s: ", cursos[1].getDisciplina(i - 3).getNomeDisciplinas());
					prof.setNomeFuncionario(ent.nextLine());
					for (int j = 0; j < 3; j++) {
						if(cursos[0].getDisciplina(j).getProfessor() != null) {
							if(cursos[0].getDisciplina(j).getProfessor().getNomeFuncionario().equalsIgnoreCase(prof.getNomeFuncionario())) {
								cont++;
								pos = j;
								ver0++;
							}
						}
						if(cursos[1].getDisciplina(j).getProfessor() != null) {
							if(cursos[1].getDisciplina(j).getProfessor().getNomeFuncionario().equalsIgnoreCase(prof.getNomeFuncionario())) {
								cont++;
								pos1 = j;
								ver1++;
							}
						}
					}
					if(ver0 != 0 && ver1 != 0) {
						cursos[1].getDisciplina(pos1).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
						System.out.println();
					}else if(ver0 == 0 && ver1 != 0) { 
						cursos[1].getDisciplina(pos1).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
						System.out.println();
					}else if(ver0 != 0 && ver1 == 0) { 
						cursos[0].getDisciplina(pos).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
						System.out.println();
					}
				}
			}
			
			if(cont == 0) {		
				System.out.print("Telefone: ");
				prof.setTelefoneFuncionario(ent.nextInt());
				System.out.print("CPF: ");
				prof.setCpfFuncionario(ent.nextInt());
				System.out.print("CTPS: ");
				prof.setCtpsFuncionario(ent.next());
				System.out.print("Endereço: ");
				ent.nextLine();
				prof.setEnderecoFuncionario(ent.nextLine());
				System.out.print("Título: ");
				prof.setTituloProfessor(ent.next());
				System.out.print("Área de titulação: ");
				ent.nextLine();
				prof.setAreaProfessor(ent.nextLine());
				System.out.print("Salário base: ");
				prof.setSalarioBase(ent.nextDouble());
				System.out.print("Valor recebido por dedicação exclusiva: ");
				prof.setValorDedicacaoExclusiva(ent.nextDouble());
				System.out.print("Retribuição por titulação: ");
				prof.setRetribTitulacao(ent.nextDouble());
				System.out.println();
				
				if(i <= 2) {
					ent.nextLine();
					prof.setDisciplina(0, cursos[0].getDisciplina(i));
				}else {	
					ent.nextLine();
					prof.setDisciplina(0, cursos[1].getDisciplina(i - 3));
				}
			}
		}
		
//	Entrada de dados dos alunos
		System.out.println("       ==  ALUNOS  ==");
		System.out.println("     __________________");
		System.out.println("MÁXIMO DE 06 ALUNOS POR CURSO");
		System.out.println("-----------------------------");
		cont = 0;
		int c0 = 0;
		int c1 = 0;
		while (cont <= 12) {
			int marc0 = 0;
			int marc1 = 0;
			cont++;
			Aluno aluno = new Aluno(2);
			
			System.out.printf("Informe o nome do %dº aluno ou digite \"sair\": ", cont);
			aluno.setNomeAluno(ent.nextLine());
			
			if(aluno.getNomeAluno().equalsIgnoreCase("sair"))
				break;
			
			for (int i = 0; i < 6; i++) {
				if(cursos[0].getAluno(i) != null) {
					if(aluno.getNomeAluno().equalsIgnoreCase(cursos[0].getAluno(i).getNomeAluno()))
						marc0++;
				}
				if(cursos[1].getAluno(i) != null) {
					if(aluno.getNomeAluno().equalsIgnoreCase(cursos[1].getAluno(i).getNomeAluno()))
						marc1++;
				}
			}
			
			if(marc0 == 0 && marc1 != 0) {
				for (int i = 0; i < 6; i++) {
					if(cursos[1].getAluno(i) != null) {
						if(aluno.getNomeAluno().equalsIgnoreCase(cursos[1].getAluno(i).getNomeAluno())) {
							cursos[0].setAluno(c0, cursos[1].getAluno(i));
							cursos[1].getAluno(i).setCurso(1, cursos[0]);
							c0++;
							System.out.println();
						}
					}
				}
			}else if(marc1 == 0 && marc0 != 0) {
				for (int i = 0; i < 6; i++) {
					if(cursos[0].getAluno(i) != null) {
						if(aluno.getNomeAluno().equalsIgnoreCase(cursos[0].getAluno(i).getNomeAluno())) {
							cursos[1].setAluno(c1, cursos[0].getAluno(i));
							cursos[0].getAluno(i).setCurso(1, cursos[1]);
							c1++;
							System.out.println();
						}
					}
				}
			}else if(marc1 != 0 && marc0 != 0) {
				cont--;
				System.out.println("O aluno já está matriculado nos 2 cursos\n");
			}else {
				System.out.print("Informe o cpf: ");
				aluno.setCpfAluno(ent.nextInt());
				System.out.print("Informe a matrícula: ");
				aluno.setMatriculaAluno(ent.next());
				System.out.print("Informe o curso: ");
				ent.nextLine();
				String curso = ent.nextLine();
				System.out.println();
				
				if(curso.equalsIgnoreCase(cursos[0].getNomeCurso())) {
					cursos[0].setAluno(c0, aluno);
					aluno.setCurso(0, cursos[0]);
					c0++;
				}else if(curso.equalsIgnoreCase(cursos[1].getNomeCurso())) {
					cursos[1].setAluno(c1, aluno);
					aluno.setCurso(0, cursos[1]);
					c1++;
				}else {
					cont--;
					System.out.println("Curso inexistente.\n");
				}
			}
		}
		
//		Algorítimo para exibir informações
			ext: while(true) {
				System.out.println("\n-----------------------------");
				System.out.println(" == CONSULTAR INFORMAÇÕES == ");
				System.out.println("_____________________________");
				System.out.println("(5) -> Cursos \n(4) -> Disciplinas \n(3) -> Técnicos "
									+ "\n(2) -> Professores \n(1) -> Alunos \n(0) -> Sair");
				System.out.print("Digite a opção solicitada: ");
				char op = ent.next().charAt(0);
				
				switch (op) {
				case '0':
					System.out.println("\nEncerrando o programa...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("...");
					System.out.println("Programa encerrado.");
					break ext;
//		Informações sobre cursos				
				case '5':
					for (int i = 0; i < cursos.length; i++) {
						if(cursos[i] != null) {
							System.out.println("_______________");
							System.out.println(cursos[i]);
							cursos[i].exibirDisciplinas();
							cursos[i].exibirAlunos();;
						}
					}
					break;
//		Informações sobre disciplinas			
				case '4':
					for (int i = 0; i < 3; i++) {
						if(cursos[0].getDisciplina(i) != null) {
							System.out.println("____________________");
							System.out.println(cursos[0].getDisciplina(i));
							cursos[0].getDisciplina(i).exibirCursos();
						}
					}
					for (int i = 0; i < 3; i++) {
						cont = 0;
						for (int j = 0; j < 3; j++) {
							if(cursos[1].getDisciplina(i) != null) {
								if(cursos[0].getDisciplina(j) != null) {
									if(cursos[1].getDisciplina(i).getNomeDisciplinas().equalsIgnoreCase(cursos[0].getDisciplina(j).getNomeDisciplinas())) {
										cont ++;
									}
								}
							}
						}
						if(cont == 0) {
							System.out.println("____________________");
							System.out.println(cursos[1].getDisciplina(i));
							cursos[1].getDisciplina(i).exibirCursos();
						}
					}
					break;
//		Informações sobre técnicos				
				case '3':
					for (int i = 0; i < tecnicos.length; i++) {
						if(tecnicos[i] != null) {
							System.out.println("_________________");
							System.out.println(tecnicos[i]);
							System.out.printf("Salário total: %.2f%n%n", tecnicos[i].calcSalario());
						}
					}
					break;
//		Informações sobre professores				
				case '2':
					Professor[] prof = new Professor[6];
					int num = 0;
					
					for (int i = 0; i < 3; i++) {
						cont = 0;
						for (int j = 0; j < 3; j++) {
							if(cursos[0].getDisciplina(i).getProfessor() != null) {
								if(prof[j] != null) {
									if(prof[j].getNomeFuncionario().equalsIgnoreCase(cursos[0].getDisciplina(i).getProfessor().getNomeFuncionario())) {
										cont++;
									}
								}
							}
						}
						if(cont == 0) {
							prof[num] = cursos[0].getDisciplina(i).getProfessor();
							num++;
						}
					}
					for (int i = 0; i < 3; i++) {
						cont = 0;
						for (int j = 0; j < 3; j++) {
							if(cursos[1].getDisciplina(i).getProfessor() != null) {
								if(prof[j] != null) {
									if(prof[j].getNomeFuncionario().equalsIgnoreCase(cursos[1].getDisciplina(i).getProfessor().getNomeFuncionario())) {
										cont++;
									}
								}
							}
						}
						if(cont == 0) {
							prof[num] = cursos[1].getDisciplina(i).getProfessor();
							num++;
						}
					}
					for (Professor p : prof) {
						if(p != null) {
							System.out.println("_____________________");
							System.out.println(p);
							System.out.printf("Salário total: %.2f%n", p.calcSalario());
							p.exibirDisciplinas();
						}
					}
					break;
//		Informações sobre alunos				
				case '1':
					for (int i = 0; i < 3; i++) {
						if(cursos[0].getAluno(i) != null) {
							System.out.println("_______________");
							System.out.println(cursos[0].getAluno(i));
							cursos[0].getAluno(i).cursosDisciplinas();;
						}
					}
					for (int i = 0; i < 3; i++) {
						cont = 0;
						for (int j = 0; j < 3; j++) {
							if(cursos[1].getAluno(i) != null) {
								if(cursos[0].getAluno(j) != null) {
									if(cursos[1].getAluno(i).getNomeAluno().equalsIgnoreCase(cursos[0].getAluno(j).getNomeAluno())) {
										cont ++;
									}
								}
							}
						}
						if(cont == 0) {
							System.out.println("_______________");
							System.out.println(cursos[1].getAluno(i));
							cursos[1].getAluno(i).cursosDisciplinas();;
						}
					}
					break;
					
				default:
					System.out.println("\nComando invalido...");
				}
			}
			
		ent.close();
	}
}
