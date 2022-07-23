package Excecoes;

// Esta Classe está Estendendo da classe "Exception".
// Tornando assim esta classe uma  Classe de Especialização.
public class ContaExcecao extends Exception {

	@Override
	public String getMessage() {// Sobrescrição do Método "getMessage" da classe "Throwable"
		// Ao invocar este método, deverá ser pelo nome da classe "ContaExecao"
		return "Saldo inssuficiênte em conta...";
	}
}
