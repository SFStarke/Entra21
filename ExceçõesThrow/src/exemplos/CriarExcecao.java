package exemplos;
/*
 * imagine que por algum motivo você precisa que uma exceção seja lançada quando
 * a letra B ou b não existe em determinada frase, como não existe nenhuma
 * exceção específica para este caso, será necessário criar uma exceção.
 */
public class CriarExcecao extends Exception {
/*PARA [ CRIAR ] NOVA EXCEÇÃO NA CLASSE PAI "Exception":
 *  A CLASSE DEVE "extends Exception"
 *  SOBRESCREVER MÉTODO "getMessage()"
 *  */
	@Override
	public String getMessage() {
		return "Não existe letra [ S ] na frase";
	}
}
