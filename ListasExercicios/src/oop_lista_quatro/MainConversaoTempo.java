package oop_lista_quatro;

public class MainConversaoTempo {

	/*
	 * 3. Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para
	 * conversão aproximada das unidades de velocidade segundo a lista abaixo. 
	 * • 1 minuto = 60 segundos 
	 * • 1 hora = 60 minutos 
	 * • 1 dia = 24 horas 
	 * • 1 semana = 7 dias
	 * • 1 mês = 30 dias
	 * • 1 ano = 365.25 dias
	 */
	public static void main(String[] args) {
		
		System.out.println(ConversaoTempo.minuteToSeconds(2));
		System.out.println(ConversaoTempo.hourToMinutes(2));
		System.out.println(ConversaoTempo.dayToHours(2));
		System.out.println(ConversaoTempo.weekToDays(2));
		System.out.println(ConversaoTempo.monsToDays(2));
		System.out.println(ConversaoTempo.yearToDays(2));
		
	}
	
}
