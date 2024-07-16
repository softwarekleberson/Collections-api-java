package Colletions.Map.evento;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

	private Map<LocalDate, Evento> evento;
	
	public AgendaEvento() {
		this.evento = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate cod, String nome, String atracao) {
		evento.put(cod, new Evento(nome, atracao));
	}
	
	public Map<LocalDate, Evento> exibirEventoOrdenado() {
		Map<LocalDate, Evento> ordenado = new TreeMap<>(evento);
		return ordenado;
	}
	
	public Map<LocalDate, Evento> getEvento() {
		return evento;
	}
}