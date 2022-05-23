package ListaCincoEstruturasDeSelecao;

public class SalarioBonus {

	public static void main(String[] args) {
		float salario = 1002, bonus;
		// Condicional if else...
			
			if (salario > 1000) {
				bonus = (float) (salario * 0.10);
				System.out.print("Seu porcentual de bonus é de 10%: ");
			}else {
				bonus = (float)(salario * 0.15);
				System.out.print("Seu porcentual de bonus é de 15%: ");
			}
			System.out.println("");
			System.out.printf("No Procedimento if else: R$%.2f\n",bonus);

		// Operador L�gico Relacional Tern�rio...
			
			System.out.println("###################################################");
			
			bonus = (float) ((salario > 1000) ? (salario * 0.10) : (salario * 0.15));
			System.out.println("No ternário: R$"+bonus);
	}
}
