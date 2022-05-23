package ListaDoisEntradaSaida;

import java.util.Scanner;
// Receita e Despesa.

public class Quest16 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	float receita, despesa, porcento, lucro;
	
	System.out.print("Digite o valor da Receita: ");
	receita = read.nextFloat();
	System.out.println("");
	System.out.print("Digite o valor da Depesa: ");
	despesa = read.nextFloat();
	lucro = receita - despesa;
	porcento = (lucro / receita) * 100;
	System.out.println("");
	System.out.printf("O lucro foi de R$%.2f",lucro);
	System.out.println("");
	System.out.println("O percentual das despesas em relação é receita foi de "+porcento+"%.");
	read.close();
}
}
