package oop_lista_dois;

public class MainLampada {

	public static void main(String[] args) {
		Lampada l = new Lampada();
		l.fabricante = "Philips";
		l.modelo = "LED";
		l.potencia = 26;
		
		l.LigarDesligar();
		l.LigarDesligar();
		l.statusLampada();
	}
}
