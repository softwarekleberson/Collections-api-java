package Colletions.List.carrinho;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Item> itens = new ArrayList<>();
	
	public Carrinho(List<Item> itens) {
		this.itens = itens;
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public int quantidadeItensCarrinho() {
		return itens.size();
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemocao = new ArrayList<>();
		for(Item item : itens) {
			if(item.getNome().equals(nome)) {
				itensRemocao.add(item);
			}
		}
		
		if(itensRemocao != null) {
			itens.removeAll(itensRemocao);
		}
	}
	
	public BigDecimal valorTotalCarrinho() {
		BigDecimal precoTotal = BigDecimal.ZERO;
	    for (Item item : itens) {
	         BigDecimal quantidadeItem = BigDecimal.valueOf(item.getQuantidade());
	         BigDecimal subtotalItem = item.getPreco().multiply(quantidadeItem);
	         precoTotal = precoTotal.add(subtotalItem); // Acumula o subtotalItem em precoTotal
	   }
	   return precoTotal;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Item item : itens) {
			sb.append(item.toString()).append("\n");
		}
		return sb.toString();
	}
}