package Colletions.Set.convite;

import java.util.HashSet;
import java.util.Set;

public class ListaConvite {

	private Set<Convite> convites;
	
	public ListaConvite() {
		this.convites = new HashSet<>();
	}
	
	public int quantidadeConvite(){
		return convites.size();
	}
	
	public void adicionarConvidado(String nome, int codigo) {
		this.convites.add(new Convite(nome, codigo));
	}
	
	public String listaConvidados() {
		StringBuilder sb = new StringBuilder();
		for(Convite convidados : convites) {
			sb.append(convidados).append("\n");
		}
		
		return sb.toString();
	}
	
	public void removerConvite(int codigo) {
		Convite removerConvite = null;
		for(Convite convidados : convites) {
			if(convidados.getCodigo() == codigo) {
				removerConvite = convidados;
				break;
			}
		}
		
		this.convites.remove(removerConvite);
	}
	
	public Set<Convite> getConvites() {
		return convites;
	}

	public void setConvites(Set<Convite> convites) {
		this.convites = convites;
	}
}