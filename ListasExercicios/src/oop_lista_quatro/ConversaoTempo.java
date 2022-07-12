package oop_lista_quatro;

public class ConversaoTempo {

	public static String minuteToSeconds(int n) {
		return n+" minuto(s) = "+n * 60+" segundos.";
	}

	public static String hourToMinutes(int n) {
		return n+" hora(s) = "+n * 60+" minutos.";
	}

	public static String dayToHours(int n) {
		return n+" dia(s) = "+n * 24+" horas.";
	}

	public static String weekToDays(int n) {
		return n+" semana(s) = "+n * 7+" dias.";
	}

	public static String monsToDays(int n) {
		return n+" mês(es) = "+n * 30+" dias.";
	}
	public static String yearToDays(int n) {
		return n+" ano(s) = "+n * 365+" dias.";
	}
}
