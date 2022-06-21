package oop_lista_um;

public class Main {

	public static void main(String[] args) {
		Lampada lamUm = new Lampada();
		Livro livUm = new Livro();
		LivroLivraria livraUm = new LivroLivraria();
		LivroBiblioteca biblUm = new LivroBiblioteca();
		ContaCorrente cc = new ContaCorrente();
		Contatos contacto = new Contatos();
		
		lamUm.fabricante = "Philips";
		lamUm.modelo = "LED";
		lamUm.potencia = 16;
		System.out.println("LAMPADA:\nFabricante: "+lamUm.fabricante+".\n"
				+ "Modelo: "+lamUm.modelo+". Potência: "+lamUm.potencia+"W");
		
		System.out.println("\n############\n");
		livUm.assunto = "Gospel";
		livUm.autor = "Sérgio";
		livUm.paginas = 50;
		System.out.println("LIVRO:\nAutor: "+livUm.autor+". Assunto: "+livUm.assunto+"\n"
				+ "Total de Paginas: "+livUm.paginas);
		
		System.out.println("\n############\nLIVRARIA:\n");
		livraUm.genero = "Desenvolvimento de Programação";
		livraUm.autor = "Felipe";
		livraUm.preço = 185;
		livraUm.cliente = "Dagmar Mesquita";
		livraUm.cpf = 123456789;
		livraUm.titulo = "Java para estúpidos";
		System.out.println("Cliente: "+livraUm.cliente+". CPF: "+livraUm.cpf+"\n"
				+ "Genero Literário: "+livraUm.genero+". Titulo: "+livraUm.titulo+".\n"
						+ "Preço R$"+livraUm.preço);
		
		System.out.println("\n############\nBIBLIOTECA:\n");
		biblUm.usuario = "Taisa Tatiana Berendz";
		biblUm.cpf = 987654321;
		biblUm.endereco = "rua Procópio Gomes, 123. Jaragua do Sul SC";
		biblUm.fone = 999119233;
		biblUm.data = "30/06/2022";
		biblUm.genero = "Desenvolvumento Humano";
		biblUm.titulo = "Como Lidar com Toimosos";
		biblUm.autor = "Biblia Sagrada";
		System.out.println("Associado(a): "+biblUm.usuario+". CPF: "+biblUm.cpf+".\nCONTATO:\nEndereço: "+biblUm.endereco+".\n"
				+ "Telefone: "+biblUm.fone+". Data para Devolução: "+biblUm.data+".\n"
						+ "LIVRO EMPRESTADO:\nGenero Literário: "+biblUm.genero+". Titulo: "+biblUm.titulo+".\n"
								+ "Autor: "+biblUm.autor);
		
		System.out.println("\n############\nCONTA CORRENTE:\n");
		cc.limite = 1500;
		cc.nome = "Starke";
		cc.cpf = 1233214;
		cc.numero = 123456;
		cc.saldo = 18000;
		cc.status = "Ativo";
		cc.classe = "Especial";
		System.out.println("Correntista: "+cc.nome+". CPF: "+cc.cpf+". Conta nº: "+cc.numero+"\n"
				+ "Saldo: R$"+cc.saldo+" | Limite para saques: R$"+cc.limite+"\n"
						+ "Classificação da conta: "+cc.classe+". STATUS DA CONTA: "+cc.status);
		
		System.out.println("\n############\nAGENDA DE CONTATOS:\n");
		contacto.email = "algumacoisa@outlook.com";
		contacto.endereco = "rua Alcantara de Queirois, nº 321";
		contacto.nome = "Ana Carina";
		contacto.numero = 9894365;
		System.out.println("Nome: "+contacto.nome+". nº: "+contacto.numero+"\n"
				+ "Endereço: "+contacto.endereco+"\n"
						+ "E_mail: "+contacto.email);
	}

}
