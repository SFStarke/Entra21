package testes;
import java.util.Scanner;
public class TesteMain {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Cont c = new Cont();
		End e = new End();

		c.setFone("1234");
		
		System.out.println("nome rua: ");
		e.setRua(read.next());
		
		for (int i = 0; i < 2; i++) {
			System.out.println(i+"º n: ");
			e.setNumeros(i, read.nextInt());
		}
		
		c.setEnd(e);
		System.out.println(c.show());
//		System.out.println(c.getEnd().getRua());
		
//		
//		e.setRua("Regente");
//		
//		c.setEnd(e);
		
//		System.out.println(c.getFone() +"\n"+ c.getEnd().getRua());
		
		read.close();
	}

}
