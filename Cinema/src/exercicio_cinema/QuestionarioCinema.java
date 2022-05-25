package exercicio_cinema;

import java.util.Scanner;

public class QuestionarioCinema {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int capacidadeMax = 5, idade = 0, loop = 0;
		int qtdOtimos = 0, qtdBom=0, qtdBomRegular = 0, qtdRegular=0, qtdRuim = 0, qtdPessimo = 0;
		int maiorIdadePessimo = 0, DifIdadeMaiorOtimoRuim = 0, maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0, opiniao = 0;
		float percentBomReg = 0, mediaIdadeRuim = 0,percentRespPessimo = 0;
		
		for(int i = 1; i <=capacidadeMax; i++ ) {
			
			System.out.println ("INFORME SUA IDADE (VÁLIDA SEMPRE MAIOR QUE ZERO)");
			idade = read.nextInt();
			
			while(idade <= 0 ) {
            	System.out.println ("VALOR INVÁLIDA. INFORME NOVAMENTE SUA IDADE (SEMPRE MAIOR QUE ZERO)");
            	idade = read.nextInt();
            }
			
			System.out.println("Selecione sua opinião!");
            System.out.println("5 - ***** Ótimo!");
            System.out.println("4 - **** Bom!");
            System.out.println("3 - *** Regular!");
            System.out.println("2 - ** Ruim!");
            System.out.println("1 - * Péssimo!");
            opiniao = read.nextInt();
            while( opiniao < 1 || opiniao > 5 ) {
            	System.out.println ("INFORME UMA OPINIAO VÁLIDA. ");
            	System.out.println("Selecione sua opinião!");
	            System.out.println("5 - ***** Ótimo!");
	            System.out.println("4 - **** Bom!");
	            System.out.println("3 - *** Regular!");
	            System.out.println("2 - ** Ruim!");
	            System.out.println("1 - * Péssimo!");
            	opiniao = read.nextInt();
            }
            
            switch(opiniao) {
            case 5:
            	qtdOtimos++;
            	if(idade > maiorIdadeOtimo) {
            		maiorIdadeOtimo = idade;
            	}	
            	//System.out.println (qtdOtimos);
            	break;
            case 4:
            	qtdBom++;
            	qtdBomRegular++;
            	//System.out.println (qtdBom);
            	break;
            case 3:
            	qtdRegular++;
            	qtdBomRegular++;
            	//System.out.println (qtdRegular);
            	break;
            case 2:
            	qtdRuim++;
            	mediaIdadeRuim += idade;
            	if(idade > maiorIdadeRuim) {
            		maiorIdadeRuim = idade;
            	}	
            	//System.out.println (qtdRuim);
            	break;
            case 1:
            	qtdPessimo++;
            	//System.out.println (qtdPessimo);
            	if(idade > maiorIdadePessimo) {
            		maiorIdadePessimo = idade;
            	}	
            	break;
            default:
            }

		}
		
		 percentBomReg = qtdBomRegular/(qtdBom - qtdRegular);
		 mediaIdadeRuim /= qtdRuim;
		 //mediaIdadeRuim = mediaIdadeRuim/qtdRuim;
		 percentRespPessimo =  (qtdPessimo*100)/capacidadeMax;
		 DifIdadeMaiorOtimoRuim = maiorIdadeOtimo - maiorIdadeRuim; 
		 System.out.println ("A quantidade de respostas Ótimo: " + qtdOtimos);
     	 System.out.println("A diferença percentual entre respostas bom e regular: " +percentBomReg);
         System.out.println("A média de idade das pessoas que responderam ruim: "+ mediaIdadeRuim);
         System.out.println("A percentagem de respostas péssimo é de "+percentRespPessimo+" . A maior idade que utilizou esta opinião: "+ maiorIdadePessimo );
         System.out.println("A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim: " + DifIdadeMaiorOtimoRuim );

		read.close();
	}
}
