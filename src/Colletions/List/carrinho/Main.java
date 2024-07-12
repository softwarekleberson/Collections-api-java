package Colletions.List.carrinho;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("oculos", new BigDecimal("50"), 2));
		itens.add(new Item("celular", new BigDecimal("2500"), 3));
		
		/*Adiciona Item ao carrinho*/
		Carrinho meuCarrinho = new Carrinho(itens);
		meuCarrinho.adicionarItem(new Item("play 5", new BigDecimal("5000"), 2));
		
		/*Remoção de item no carrinho*/
		meuCarrinho.removerItem("oculos");
		
		/*Exibe os itens*/
		System.out.println(meuCarrinho.toString());
		
		System.out.println("Preço total " + meuCarrinho.valorTotalCarrinho());
		System.out.println("Quantidade de itens " + meuCarrinho.quantidadeItensCarrinho());
		
	}
}
