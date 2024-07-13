package Colletions.Set.contato;

import java.util.Objects;

public abstract class Telefone {

	private String telefone;
	
	public Telefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void updateTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(telefone, other.telefone);
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "Telefone [telefone=" + telefone + "]";
	}
}