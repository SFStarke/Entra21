package oop_lista_quatro;

public class Contador {

	 private static int contador; // Atributo estático.

	    public Contador() { // Sempre que instanciado, atributo recebe seu valor mais um.
	        contador++;
	    }

	    public static void setMore(){ 
	        contador++;
	    }
	    
	    public static void setZero(){
	        contador = 0;
	    }
	    
	    public static int showResult(){
	        return contador;
	    }
}
