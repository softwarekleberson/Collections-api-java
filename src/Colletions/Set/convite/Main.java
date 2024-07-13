package Colletions.Set.convite;

public class Main {
	public static void main(String[] args) {
		ListaConvite listaConvite = new ListaConvite();
		listaConvite.adicionarConvidado("Kleberson", 123);
		listaConvite.adicionarConvidado("jose", 124);
		listaConvite.adicionarConvidado("ana", 125);
		listaConvite.adicionarConvidado("ana", 125);
		
		//listaConvite.removerConvite(125);
		System.out.println(listaConvite.listaConvidados());
	}
}
