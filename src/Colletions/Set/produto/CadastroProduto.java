package Colletions.Set.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	private Set<Produto> produtos;
	
	public CadastroProduto() {
		this.produtos = new HashSet<>();
	}
	
	public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
		this.produtos.add(new Produto(codigo, nome, quantidade, preco));
	}
	
	public Set<Produto> exibirProdutoPorNome(){
		/*O TreeSet sabe que vai ter que colocar tudo em order natural
		 * e ele sabe que a uma implementação da interface Comparable
		 * e que nele a um metodo compareTo então ele sobreescreve esse metodo 
		 * com a logica que nós implementamos
		 * O TreeSet recebe um Set por isso ele recebe produtos na TreeSets*/
		Set<Produto> produtosOrdenados = new TreeSet<>(produtos);
		return produtosOrdenados;
	}
	
	public Set<Produto> exibirProdutoPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtos);
		return produtoPorPreco;
	}
}