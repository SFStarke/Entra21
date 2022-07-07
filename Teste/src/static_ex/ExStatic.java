package static_ex;

public class ExStatic {
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int menos(int a, int b) {
		return a - b;
	}
	public static int somaVet(int[] vet) {
		int tot = 0;
		for (int i = 0; i < vet.length; i++) {
			tot += vet[i];
		}
		return tot;
	}
}
