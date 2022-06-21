package livrodelivraria;
import livro.Livro;
public class LivroDeLivraria {
	/*3. Usando o resultado do exercício anterior como base, crie uma classe 
	 *“LivroDeLivraria” que represente os dados básicos de um livro que está à 
	 *venda em uma livraria
	 */
	public static void main(String[] args) {
		Livro um = new Livro();
		Livro dois = new Livro();
		
		um.autor = "Sérgio";
		um.assunto = "Gospel";
		um.paginas = 10;
		um.preço = 50;
		
		System.out.println("Autor: "+um.autor+", Assunto: "+um.assunto+"\n"
				+ "Nº de paginas: "+um.paginas+". R$"+um.preço+"\n");
		
		
	}

}
