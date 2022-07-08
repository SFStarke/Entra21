package testes;

public class TesteMain {

	public static void main(String[] args) {
		Cont c = new Cont();
		End e = new End();
		
		c.setFone("1234");
		
		e.setRua("Regente");
		
		c.setEnd(e);
		
		System.out.println(c.getFone() +"\n"+ c.getEnd().getRua());
		
	}

}
