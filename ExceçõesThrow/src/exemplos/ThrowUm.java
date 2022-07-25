package exemplos;

public class ThrowUm {
	/*
	 * Pense na situação em que não é desejado que uma exceção seja tratada na
	 * própria classe ou método, mas sim em outro que venha lhe chamar. Para
	 * solucionar tal situação utilizamos a instrução throws na assinatura do método
	 * com a possível exceção que o mesmo poderá a vir lançar.
	 * 
	 * Neste exemplo será lançada uma exceção no método aumetarLetras(): E o mesmo
	 * será tratado no método main().
	 */
	public static void main(String[] args) {
		try {
			aumentarLetras();
		} catch (NullPointerException e) { // TRATANDO A EXCEÇÃO LANÇADA NO METODO aumentarLetras
			System.out.println("Ocorreu um NullPointerException ao executar o método aumentarLetras()\n" + e);
		}
	}
	// FOTRA DO MÉTODO MAIN...

	private static void aumentarLetras() throws NullPointerException {
// MÉTODO LANÇA EXCEÇÃO "ESPECÍFICA | "NullPointerException" ".
		// caixa baixa para CAIXA ALTA.
		// Porém, está null, causando um erro, para tratamento em outro local.
		String frase = null;
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}
}
