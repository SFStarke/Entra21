package Excecoes;

// Esta Classe está Estendendo da classe "Exception".
// Tornando assim esta classe uma  Classe de Especialização.
public class ContaExcecao extends Exception {

// Criando uma NOVA EXCEÇÃO para a classe "Exception" atravéz da sobrescrição do método "getMessage".
	@Override
	public String getMessage() {
		// Ao invocar este método, deverá ser pelo nome da classe "ContaExecao"
		return "Saldo insuficiente para saque...";
	}
}
