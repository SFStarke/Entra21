package oop_lista_cinco;

import java.util.Scanner;

public class TesteUniversidade {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Curso c = new Curso(3, 6);//Só para teste
		c.setNomeCurso("Java");//Só para teste
		Curso c2 = new Curso(3, 6);//Só para teste
		c2.setNomeCurso("C++");//Só para teste
	
		Curso[] cursos = new Curso[2]; //Linha necessária ################
		cursos[0] = c;//Só para teste
		cursos[1] = c2;//Só para teste
		
		Disciplina d = new Disciplina(2);//Só para teste
		d.setNomeDisciplinas("Lógica");//Só para teste
		Disciplina d1 = new Disciplina(2);//Só para teste
		d1.setNomeDisciplinas("Laços");//Só para teste
		Disciplina d2 = new Disciplina(2);//Só para teste
		d2.setNomeDisciplinas("Métodos");//Só para teste
		Disciplina d3 = new Disciplina(2);//Só para teste
		d3.setNomeDisciplinas("Algoritimos");//Só para teste
		
		cursos[0].setDisciplina(0, d);//Só para teste
		cursos[0].setDisciplina(1, d1);//Só para teste
		cursos[0].setDisciplina(2, d2);//Só para teste
		cursos[1].setDisciplina(0, d);//Só para teste
		cursos[1].setDisciplina(1, d2);//Só para teste
		cursos[1].setDisciplina(2, d3);//Só para teste
		
		d.setCurso(0, c);//Só para teste
		d.setCurso(1, c2);//Só para teste
		d1.setCurso(0, c);//Só para teste
		d2.setCurso(0, c);//Só para teste
		d2.setCurso(1, c2);//Só para teste
		d3.setCurso(0, c2);//Só para teste
		
//		Professor p1 = new Professor(2);
//		p1.setNomeFuncionario("Carlos");
//		p1.setDisciplina(0, d);
//		Professor p2 = new Professor(2);
//		p2.setNomeFuncionario("Alberto");
//		p2.setDisciplina(0, d1);
//		Professor p3 = new Professor(2);
//		p3.setNomeFuncionario("Manoel");
//		p3.setDisciplina(0, d2);
//		Professor p4 = new Professor(2);
//		p4.setNomeFuncionario("João");
//		p4.setDisciplina(0, d3);
		
		Aluno a1 = new Aluno(2);
		a1.setNomeAluno("Carlos");
		a1.setCurso(0, c);
		a1.setCurso(1, c2);
		Aluno a2 = new Aluno(2);
		a2.setNomeAluno("Ana");
		a2.setCurso(0, c);
		Aluno a3 = new Aluno(2);
		a3.setNomeAluno("Mike");
		a3.setCurso(0, c);
		Aluno a4 = new Aluno(2);
		a4.setNomeAluno("Bia");
		a4.setCurso(0, c2);
		a4.setCurso(1, c);
		Aluno a5 = new Aluno(2);
		a5.setNomeAluno("Paulo");
		a5.setCurso(0, c2);
		Aluno a6 = new Aluno(2);
		a6.setNomeAluno("Mauro");
		a6.setCurso(0, c2);
		
		c.setAluno(0, a1);
		c.setAluno(1, a2);
		c.setAluno(2, a3);
		c.setAluno(3, a4);
		c2.setAluno(0, a1);
		c2.setAluno(1, a4);
		c2.setAluno(2, a5);
		c2.setAluno(3, a6);
		
		int cont = 0;
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
				if(cont != 0)
					cursos[0].getDisciplina(pos).getProfessor().setDisciplina(cont, cursos[0].getDisciplina(i));
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
					if(ver0 != 0 && ver1 != 0) 
						cursos[1].getDisciplina(pos1).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
					else if(ver0 == 0 && ver1 != 0) 
						cursos[1].getDisciplina(pos1).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
					else if(ver0 != 0 && ver1 == 0) 
						cursos[0].getDisciplina(pos).getProfessor().setDisciplina(cont, cursos[1].getDisciplina(i - 3));
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
		
		Tecnico[] tecnicos = new Tecnico[4];
		
//		System.out.print("Informe o valor do auxílio alimentação pago pela universidade: ");
//		Tecnico.setAuxAlimentacao(ent.nextDouble());
//		System.out.println(ent.nextLine());
//		
//		for (int i = 0; i < tecnicos.length; i++) {
//			Tecnico tec = new Tecnico();
//			int cont = 0;
//			
//			System.out.printf("Informe o nome do %dº auxiliar técnico ou \"sair\": ", (i + 1));
//			tec.setNomeFuncionario(ent.nextLine());
//			
//			if(tec.getNomeFuncionario().equalsIgnoreCase("sair"))
//				break;
//			
//			for (int j = 0; j < tecnicos.length; j++) {
//				if(tecnicos[j] != null) {
//					if(tec.getNomeFuncionario().equalsIgnoreCase(tecnicos[j].getNomeFuncionario())) {
//						System.out.println("Técnico já cadastrado.");
//						i--;
//						cont++;
//					}
//				}
//			}
//			
//			if(cont == 0) {
//				System.out.print("Telefone: ");
//				tec.setTelefoneFuncionario(ent.nextInt());
//				System.out.print("CPF: ");
//				tec.setCpfFuncionario(ent.nextInt());
//				System.out.print("CTPS: ");
//				tec.setCtpsFuncionario(ent.next());
//				System.out.print("Endereço: ");
//				ent.nextLine();
//				tec.setEnderecoFuncionario(ent.nextLine());
//				System.out.print("Cargo: ");
//				tec.setCargoTecnico(ent.nextLine());
//				System.out.print("Departamento: ");
//				tec.setDepartamentoTecnico(ent.nextLine());
//				System.out.print("Salário base: ");
//				tec.setSalarioBase(ent.nextDouble());
//				System.out.print("Auxílio transporte: ");
//				tec.setAuxTransporte(ent.nextDouble());
//				ent.nextLine();
//				
//				tecnicos[i] = tec;
//			}
//			System.out.println();
//		}
		cont = 0;
//	Algorítimo para exibir informações
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
//	Informações sobre cursos				
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
//	Informações sobre disciplinas			
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
//	Informações sobre técnicos				
			case '3':
				for (int i = 0; i < tecnicos.length; i++) {
					if(tecnicos[i] != null) {
						System.out.println("_________________");
						System.out.println(tecnicos[i]);
						System.out.printf("Salário total: %.2f%n%n", tecnicos[i].calcSalario());
					}
				}
				break;
//	Informações sobre professores				
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
//	Informações sobre alunos				
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
