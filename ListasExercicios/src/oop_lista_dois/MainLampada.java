package oop_lista_dois;

public class MainLampada {

	public static void main(String[] args) {
		//Para inicialisar o construtor:  String fabriante, String modelo, int potencia

		Lampada l = new Lampada("Philips", "LED", 26);
		
	//	l.LigarDesligar();
	//	l.LigarDesligar();
		
		l.statusLampada();
		
	}
}
