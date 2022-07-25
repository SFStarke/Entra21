package exemplos;

public class MainCriarExcecao {
	/*
	 * imagine que por algum motivo você precisa que uma exceção seja lançada quando
	 * a letra S ou s não existe em determinada frase, como não existe nenhuma
	 * exceção específica para este caso, será necessário criar uma exceção.
	 */
	public static void main(String[] args) {
		
		try {
			searchS();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public static void searchS() throws CriarExcecao{
		String frase = "Um tete!";
	    if(!frase.contains("s") && !frase.contains("S")) {
	    throw new CriarExcecao();
	    }else {
	    	System.out.println("A frase contém letra [ S ]");
	    }
	}

}
