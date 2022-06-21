package matriz;

import java.util.Scanner;

public class Filhos {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        int pessoas = 0, filhos = 0;
        String fam[][][] = new String[pessoas][][];
        
        System.out.print("Quantas pessoas serão entrevistadas? ");
        pessoas = read.nextInt();
        
        for (int i = 0; i < pessoas; i++) {
            System.out.print("Quantos filhos você tem? ");
            filhos = read.nextInt();
            for (int j = 0; j < filhos; j++) {
                for (int k = 0; k < filhos; k++) {
                    
                   //fam[i][j][k]=  
                    
                }
            }
        }
        
        read.close(); 
	}

}
