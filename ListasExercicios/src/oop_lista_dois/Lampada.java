package oop_lista_dois;

/*1. Escreva uma classe para representar uma lâmpada. Desenvolva 
 *métodos para ligar, desligar a lampada
 */
public class Lampada {
	int potencia;
	String fabricante, modelo;
	String status;
	boolean ligado;
	
	void LigarDesligar() {
		if(ligado == false) {
			ligado = true;
			status = "ligado";
		}else if(ligado == true) {
			ligado = false;
			status = "desligado";
		}
	}
	void statusLampada() {
		System.out.println("FABRICANTE: "+fabricante+
				"\nMODELO: "+modelo+". POTÊNCIA: "+
				potencia+"W\n\nA lampada está "+status);
	}
	
}
