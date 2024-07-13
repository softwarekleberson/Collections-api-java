package Colletions.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> pessoas;
	
	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList<>();
	}
	
	public void adcionarPessoa(String nome, int idade, double altura) {
		this.pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenaPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordernarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
		return pessoasPorAltura;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}