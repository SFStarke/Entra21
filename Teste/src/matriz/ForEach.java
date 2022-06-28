package matriz;

public class ForEach {

	public static void main(String[] args) {
		
		int[][] x = new int[3][3];
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
			 
				x[i][j] = (int) (5+ Math.random() * (9 - 5));
			}
		}
		
		for(int[] y : x) {
			for(int y1 : y) {
				System.out.print(y1);
			}
		}
	}

}
