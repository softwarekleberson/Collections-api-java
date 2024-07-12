package Colletions.List.carrinho;

import java.math.BigDecimal;

public class Item {

	private String nome;
	private BigDecimal preco;
	private int quantidade;
	
	public Item(String nome,BigDecimal preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}