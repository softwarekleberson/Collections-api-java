package Colletions.Set.convite;

import java.util.Objects;

public class Convite {

	private String nome; 
	private int codigo;
	
	public Convite(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convite other = (Convite) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Convite [nome=" + nome + ", codigo=" + codigo + "]";
	}
}