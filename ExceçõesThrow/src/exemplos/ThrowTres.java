package exemplos;

public class ThrowTres {
	/*
	 * Nesse exemplo é criada uma exceção especifica
	 * dentro do bloco if do método e
	 * em seguida lançada na instrução throw.
	 */
	public static void main(String[] args) {
		saque(400);
//		try {
//			saque(401);
//		} catch (Exception e) {
//			System.out.println("Saldo insuficiênte "+ e);
//		}
	}
// FOTRA DO MÉTODO MAIN...
	public static void saque(double valor) {// MÉTODO SEM LANCE DE EXCEÇÃO "throws".
	    if(valor > 400) {//É criada uma exceção especifica "IllegalArgumentException".
	      IllegalArgumentException deuRuim = new IllegalArgumentException();
	      throw deuRuim;//É lançada na instrução throw "deuRuim" sem o uso do "new"
	    }else {
	      System.out.println("Valor retirado da conta: R$"+valor);
	    }
	  }
}
