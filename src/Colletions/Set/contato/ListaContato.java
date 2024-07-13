package Colletions.Set.contato;

import java.util.HashSet;
import java.util.Set;

public class ListaContato {

	private Set<Contato> contatos;
	
	public ListaContato() {
		this.contatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, String telefone) {
		this.contatos.add(new Contato(nome, telefone));
	}
	
	public void updateTelefone(String telefone, String novoNumero) {
		for(Telefone telef : contatos) {
			if(telef.getTelefone().equals(telefone)) {
				telef.updateTelefone(novoNumero);
				break;
			}
		}
	}
	
	public String pesquisaPorNome(String nome) {
		StringBuilder sb = new StringBuilder();
		for(Contato contato : contatos) {
			if(contato.getNome().trim().equalsIgnoreCase(nome.trim())) {
				sb.append(contato.getNome()).append(" ")
				 .append(contato.getTelefone())
				 .append(" ")
				 .append("\n");
				break;
			}			
		}
		
		return sb.toString();
	}
	
	public String listarContatos() {
		StringBuilder sb = new StringBuilder();
		for(Contato contato : contatos) {
			sb.append(contato.getNome()).append(" ")
					 .append(contato.getTelefone())
					 .append(" ")
					 .append("\n");
		}
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return "ListaContato [contatos=" + contatos + "]";
	}
}