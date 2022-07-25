package exemplos;

public class ThrowDois {
	/*
	 * Nesse exemplo temos o caso em que seja necessário lançar uma exceção padrão
	 * ao invés de uma especifica. Para resolver este problema, utilizamos a
	 * instrução throw dentro do bloco catch que desejamos converter a exceção.
	 * 
	 * Neste será lançada uma NullPointerException e a mesma será convertida para
	 * Exception e relançada como Exception no método aumentarLetras() e, por fim, a
	 * mesma é tratada no método main().
	 */
	public static void main(String[] args) {

		try {
			aumentarLetras();
		} catch (Exception e) {// TRATANDO A EXCEÇÃO LANÇADA NO METODO aumentarLetras
			System.out.println("Ocorreu uma exceção ao executar o método aumentarLetras()\n" + e);
		}
	}
// FOTRA DO MÉTODO MAIN...

	private static void aumentarLetras() throws Exception {
// MÉTODO LANÇA EXCEÇÃO "GENÉRICA "exceção padrão"| "Exception" ".
		// caixa baixa para CAIXA ALTA.
		// Porém, está null, causando um erro, para tratamento em outro local.
		String frase = null;
		String novaFrase = null;
/*
 * IMPORTANTE: MÉTODO INVOCA "throws Exception". Dentro do método é implementado "tray ctach"
 * para então tratar exceção específica.
 * */
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) {
			throw new Exception(e); //Instrução throw dentro do bloco catch
		}
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

}
