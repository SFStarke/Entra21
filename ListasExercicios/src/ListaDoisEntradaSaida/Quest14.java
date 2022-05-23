package ListaDoisEntradaSaida;

public class Quest14 {
public static void main(String[] args) {
	System.out.println("Ex: 14(A).");
	float a = 10;
	float b = 20;
	float c;
	System.out.println("Valor em B: "+b);
	b = 5f;
	System.out.println("Valor em A :"+a+". Valor em B: "+b);
	System.out.println("#################################\nEx: 14(B).");
	a = 30;
	b = 20;
	c = a + b;
	System.out.println("Valor de C: "+c);
	b = 10;
	System.out.println("Valor de B:"+b+". Valor de C: "+c);
	c = a + b;
	System.out.println("Valor de A: "+a+". Valor de B: "+b+". Valor de C: "+c);
	System.out.println("#################################\nEx: 14(C).");
	a = 10;
	b = 20;
	c = a;
	b = c;
	a = b;
	System.out.println("Valor de A: "+a+". Valor de B: "+b+". Valor de C: "+c);
	System.out.println("#################################\nEx: 14(D).");
	a = 10;
	b = a + 1;
	a = b + 1;
	b = a + 1;
	System.out.println("Valor de A: "+a);
	a = b + 1;
	System.out.println("Valor de A: "+a+". Valor de B: "+b);
	System.out.println("#################################\nEx: 14(E).");
	a = 10;
	b = 5;
	c = a + b;
	b = 20;
	a = 10;
	System.out.println("Valor de A: "+a+". Valor de B: "+b+". Valor de C: "+c);
	System.out.println("#################################\nEx: 14(F).");
	float x,y,z;
	x = 1;
	y = 2;
	z = y - x;
	System.out.println("Valor de Z: "+z);
	x = 5;
	y = x + z;
	System.out.println("Valor de X: "+x+". Valor de Y: "+y+". Valor de Z: "+z);
	System.out.println("#################################");
	
}
}
