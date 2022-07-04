package oop_lista_dois;

/*1. Escreva uma classe para representar uma lâmpada. Desenvolva 
 *métodos para ligar, desligar a lampada
 */
public class Lampada {
	private int potencia;
	private String fabricante, modelo;
	private String status = "desligado";
	private boolean ligado;
	
	public Lampada(String fab, String mod, int power) {
		this.fabricante = fab;
		this.modelo = mod;
		this.potencia = power;
		this.ligado = false;
	}
	
	public void LigarDesligar() {
		if(ligado == false) {
			ligado = true;
			status = "ligado";
		}else if(ligado == true) {
			ligado = false;
			status = "desligado";
		}
	}
	public void statusLampada() {
		System.out.println("FABRICANTE: "+fabricante+
				"\nMODELO: "+modelo+". POTÊNCIA: "+
				potencia+"W\n\nA lampada está "+status);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
}
