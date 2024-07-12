package Colletions.List.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

	private List<Livro> livros;
	
	public CatalogoLivro() {
		this.livros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> pesquisa = new ArrayList<>();
		if(!livros.isEmpty()) {
			for(Livro livro : livros) {
				if(livro.getAutor().equals(autor)) {
					pesquisa.add(livro);
				}
			}			
		}
		
		return pesquisa;
	}
	
	public List<Livro> pesquisaLivroPorAnoMinimoMaximo(int menorAno, int maiorAno){
		List<Livro> pesquisa = new ArrayList<>();
		if(!livros.isEmpty()) {
			for(Livro livro : livros) {
				if(livro.getAnoPublicacao() >= menorAno && livro.getAnoPublicacao() <= maiorAno) {
					pesquisa.add(livro);
				}
			}
		}
		
		return pesquisa;
	}
	
	public Livro retornaPrimeiraOcorrenciaDoAutor(String autor) {
		if(!livros.isEmpty()) {
			for(Livro pesquisa : livros) {
				if(pesquisa.getAutor().equals(autor)) {
					Livro ocorrencia = new Livro();
					ocorrencia.setAnoPublicacao(pesquisa.getAnoPublicacao());
					ocorrencia.setAutor(pesquisa.getAutor());
					ocorrencia.setTitulo(pesquisa.getTitulo());				
					return ocorrencia;
				}
				
				break;
			}
		}
		return null;
		
	}

	@Override
	public String toString() {
		return "CatalogoLivro [livros=" + livros + "]";
	}
}

