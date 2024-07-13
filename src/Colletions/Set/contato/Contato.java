package Colletions.Set.contato;

public class Contato extends Telefone {

	private String nome;
	
	public Contato(String nome, String telefone) {
		super(telefone);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + "]";
	}
}