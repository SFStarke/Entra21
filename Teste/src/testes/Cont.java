package testes;

public class Cont {
	private String fone;
	private End end;

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public End getEnd() {
		return end;
	}

	public void setEnd(End end) {
		this.end = end;
	}
	
	public String show() {
		return "Endereço: "+this.getEnd().getRua()+". Fone: "+this.getFone()+"\n"
				+ "Numeros: "+this.getEnd().getNumeros()[0]+". e : "+this.getEnd().getNumeros()[1];
	}

}
