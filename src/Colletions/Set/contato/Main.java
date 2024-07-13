package Colletions.Set.contato;

public class Main {
	public static void main(String[] args) {
		
		ListaContato listaContato = new ListaContato();
		listaContato.adicionarContato("kleberson", "43803369");
		listaContato.adicionarContato("Kaw", "47403268");
		
		listaContato.updateTelefone("43803369", "123");
		System.out.println("Pesquisa por nome " + listaContato.pesquisaPorNome("kaw"));
		System.out.println("Todos os contatos " + listaContato.listarContatos());
	}
}
