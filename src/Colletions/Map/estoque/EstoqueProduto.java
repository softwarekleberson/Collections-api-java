package Colletions.Map.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> estoque;
	
	public EstoqueProduto() {
		this.estoque = new HashMap<>();
	}
	
	public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
		estoque.put(cod, new Produto(nome, preco, quantidade));
	}
	
	 public Produto exibirProdutoPeloCodigo(Long cod) {
	     Produto produto = null;   
		 if (!estoque.isEmpty()) {
	            produto = estoque.get(cod);
	     }
		 
		return produto; 
		
	}
	
	public double valorTotalNoEstoque() {
		double valorTotal = 0d;
		
		if(!estoque.isEmpty()) {
			for(Produto p : estoque.values()) {
				valorTotal += p.getQuantidade() * p.getPreco();
			}
		}
	
		return valorTotal;
	}
	
	public Produto produtoMaisCaroNoEstoque() {
		double maisCaro = Double.MIN_VALUE;
		Produto produto = null;
		
		if(!estoque.isEmpty()) {
			for(Produto p : estoque.values()) {
				if(p.getPreco() > maisCaro) {
					maisCaro = p.getPreco();
					produto = p;
				}
			}
		}
		
		return produto;
	}
	
	public Produto produtoMaisBaratoNoEstoque() {
		double maisBarato = Double.MAX_VALUE;
		Produto produto = null;
		
		if(!estoque.isEmpty()) {
			for(Produto p : estoque.values()) {
				if(p.getPreco() < maisBarato) {
					maisBarato = p.getPreco();
					produto = p;
				}
			}
		}
	
		return produto;
	}
}