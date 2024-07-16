package Colletions.Map.evento;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		AgendaEvento agendaEvento = new AgendaEvento();
		agendaEvento.adicionarEvento(LocalDate.now(), "Novela", "Final da novela");
		agendaEvento.adicionarEvento(LocalDate.now(), "Futebol", "final da liberta");
		System.out.println(agendaEvento.exibirEventoOrdenado());
	}
}
