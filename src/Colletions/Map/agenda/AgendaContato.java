package Colletions.Map.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

	private Map<String, Integer> contatos;
	
	public AgendaContato() {
		this.contatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer numero) {
		this.contatos.put(nome, numero);
	}
	
	public void excluirContato(String nome) {
		if(!contatos.isEmpty()) {
			this.contatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
	public Integer retornarNumeroPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!contatos.isEmpty()) {
			numeroPorNome = contatos.get(nome);
		}
		
		return numeroPorNome;
	}
}