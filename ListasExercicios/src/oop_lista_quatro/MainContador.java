package oop_lista_quatro;

public class MainContador {

	 static void showCont() {
		System.out.println(Contador.showResult());
	}
	public static void main(String[] args) {
		//Contador c = new Contador();
		
		Contador.setMore();
		Contador.setZero();
		Contador.setMore();
		showCont();
		
	}

}
