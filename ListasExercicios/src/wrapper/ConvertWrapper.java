package wrapper;

public class ConvertWrapper {

	public static void main(String[] args) {
		//cria um objeto wrapper
		Integer velocidade = new Integer(587);
		//converte a variável velocidade para tipo primitivo
		double total = velocidade.doubleValue();
		short total1 = velocidade.shortValue();
		byte total2 = velocidade.byteValue();
		Float pi = new Float(3.14f);
		int valorPi = pi.intValue();
		System.out.println("Valor de PI arredondado: " + valorPi);
		System.out.println("Total: " + total);
		
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨\nExercício 04\n");
		double soma = Double.parseDouble("685.65");
		System.out.println("Soma: "+soma);
		
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨\nExercício 05\n");
		Integer idade = new Integer(39);
		String idadeString = String.valueOf(idade);
		String velocidades = new String("568.55");
		Double velocidadeDouble = Double.valueOf(velocidades);
		System.out.println("Idade string: "+idadeString);
		System.out.println("Velocidade double: "+velocidadeDouble);
	
	}

}
