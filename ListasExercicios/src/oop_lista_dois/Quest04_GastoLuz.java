package oop_lista_dois;

public class Quest04_GastoLuz {
	private String dataLeitura[] = new String[12];
	private int numLeitura[] = new int[12];
	private int kwGasto[] = new int[12];
	private float valorPagar[] = new float[12];
	private String dataPago[] = new String[12];
	private float mediaConsumo[] = new float[12];
	private float nenorConsumo;
	private float maiorConsumo;
	private String dataConsMaior, dataConsMenor;
	
	

	public Quest04_GastoLuz() {}

	public void leitura() {
		/*
		 * Método em que serão implementados:
		 * Data em que a leitura do relógio de luz foi realizada,
		 * número da leitura, quantida de de Kw gasto no mês,
		 * valor a pagar pela conta, data do pagamento e média de consumo.
		 */
	}

	public void analisarMedia() {
		/*
		 * Avalia, na medida em que forem cadastrados, qual foi o 
		 * maior e o menor consumo entre os meses,
		 * com a implementação de suas respectivas datas.
		 */
	}

	public String showStatus() {
//Método para apresentação "mostrar" o resultado dos métodos anteriores.
		return "Sintaxe de apresentação...";
	}

	public String[] getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(String[] dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public int[] getNumLeitura() {
		return numLeitura;
	}

	public void setNumLeitura(int[] numLeitura) {
		this.numLeitura = numLeitura;
	}

	public int[] getKwGasto() {
		return kwGasto;
	}

	public void setKwGasto(int[] kwGasto) {
		this.kwGasto = kwGasto;
	}

	public float[] getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(float[] valorPagar) {
		this.valorPagar = valorPagar;
	}

	public String[] getDataPago() {
		return dataPago;
	}

	public void setDataPago(String[] dataPago) {
		this.dataPago = dataPago;
	}

	public float[] getMediaConsumo() {
		return mediaConsumo;
	}

	public void setMediaConsumo(float[] mediaConsumo) {
		this.mediaConsumo = mediaConsumo;
	}

	public float getNenorConsumo() {
		return nenorConsumo;
	}

	public void setNenorConsumo(float nenorConsumo) {
		this.nenorConsumo = nenorConsumo;
	}

	public float getMaiorConsumo() {
		return maiorConsumo;
	}

	public void setMaiorConsumo(float maiorConsumo) {
		this.maiorConsumo = maiorConsumo;
	}

	public String getDataConsMaior() {
		return dataConsMaior;
	}

	public void setDataConsMaior(String dataConsMaior) {
		this.dataConsMaior = dataConsMaior;
	}

	public String getDataConsMenor() {
		return dataConsMenor;
	}

	public void setDataConsMenor(String dataConsMenor) {
		this.dataConsMenor = dataConsMenor;
	}

}
