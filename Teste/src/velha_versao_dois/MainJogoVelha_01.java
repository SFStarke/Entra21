package velha_versao_dois;

public class MainJogoVelha_01 {

	public static void main(String[] args) {
		JogoVelha_01 x = new JogoVelha_01();
/*
 * Jogador [ nº 1 ] será [ X ]
 * Jogador [ nº 2 ] será [ O ]
 * 
 * A configuração inicial do tabuleitro é:
 *     
 *      1 | 2 | 3 | 
 *      4 | 5 | 6 | 
 *      7 | 8 | 9 | 
 * */		
		x.setPlayers(5, 1);
		x.setPlayers(3, 2);
		x.setPlayers(6, 1);
	//	x.setPlayers(2, 2);
	//	x.setPlayers(7, 1);
	//	x.setPlayers(1, 2);
//		x.setPlayers(4, 1);
		x.show();
		
		
	}
}
