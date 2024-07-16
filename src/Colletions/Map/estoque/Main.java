package Colletions.Map.estoque;

public class Main {
	public static void main(String[] args) {
		
		EstoqueProduto estoqueProduto = new EstoqueProduto();
		estoqueProduto.adicionarProduto(1234l, "Celular", 1500.80, 5);
		estoqueProduto.adicionarProduto(19234l, "Play 5", 4000, 20);
		estoqueProduto.adicionarProduto(9103785l, "computador", 9500.40, 2);
		
		Produto produtoMaisCaro = estoqueProduto.produtoMaisCaroNoEstoque();
		Produto produtoMaisBarato = estoqueProduto.produtoMaisBaratoNoEstoque();
		Produto exibirProduto = estoqueProduto.exibirProdutoPeloCodigo(1234l);
		
		System.out.println("O valor total do estoque é " + estoqueProduto.valorTotalNoEstoque());
		System.out.println("O produto mais caro " + produtoMaisCaro);
		System.out.println("O produto mais barato " + produtoMaisBarato);
		System.out.println("Exibir produto " + exibirProduto);
	}
}
