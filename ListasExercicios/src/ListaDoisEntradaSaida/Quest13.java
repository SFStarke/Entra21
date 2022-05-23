package ListaDoisEntradaSaida;

public class Quest13 {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int c;
	
	System.out.println("A: "+a+" | B: "+b);
	
	c = a;
	a = b;
	b = c;
	System.out.println("A: "+a+" | B: "+b);
}
}
