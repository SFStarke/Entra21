package diversos;

import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) {
		
		Calendar d = Calendar.getInstance();
		System.out.println(d.get(Calendar.DAY_OF_MONTH));// Retorna apenas o dia.
	}

}
