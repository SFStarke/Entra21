package ListaDoisEntradaSaida;

import java.util.Scanner;
// Orçamento de fotos.
public class Quest12 {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int pacote, avulso;
	float total;
	
	System.out.print("Quantidade de fotos avulsas para revelação: ");
	avulso = read.nextInt();
	System.out.println();
	System.out.print("Quantidade de pacotes (100 fotos cada) para revelação: ");
	pacote = read.nextInt();
	System.out.println();
	total = (float)((pacote * 44) + (avulso * 0.7));
	System.out.print("A quantidade de pacotes foi de "+ pacote+"\n");
	System.out.print("A quantidade de fotos avulsass foi de "+ avulso+"\n");
	System.out.printf("O valor total pelas fotos será de R$%.2f",total);
	read.close();
}
}
