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
		System.out.println("LAMPADA: Fabricante:"+lamUm.fabricante+".\n"
				+ "Modelo: "+lamUm.modelo+". Potência: "+lamUm.potencia);
		
		System.out.println("\n############\n");
		livUm.assunto = "Gospel";
		livUm.autor = "Sérgio";
		livUm.paginas = 50;
		System.out.println("LIVRO: Autor: "+livUm.autor+". Assunto: "+livUm.assunto+"\n"
				+ "Total de Paginas: "+livUm.paginas);
		
		System.out.println("\n############\n");
		livraUm.assunto = "Java";
		livraUm.autor = "Felipe";
		livraUm.paginas = 200;
		livraUm.preço = 185;
	}

}
