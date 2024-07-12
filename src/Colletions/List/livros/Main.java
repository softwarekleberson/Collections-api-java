package Colletions.List.livros;

public class Main {

	public static void main(String[] args) {
		
		int menorAno = 1930;
	    int maiorAno = 2000;
		
		CatalogoLivro catalogoLivro = new CatalogoLivro();
		catalogoLivro.adicionarLivro("Vidas secas",
                					 "Graciliano Ramos",
                					 2000);
		
		catalogoLivro.adicionarLivro("São Bernardo",
									"Graciliano Ramos",
									1934);
		
        catalogoLivro.adicionarLivro("Angústia",
        							 "Graciliano Ramos",
        							 1936);
        
        catalogoLivro.adicionarLivro("Dom Casmurro",
        							 "Machado de Assis",
        							 1899);
        
        catalogoLivro.adicionarLivro("Memorias Postonas",
				 					 "Machado de Assis",
				 					 1899);
        
        catalogoLivro.adicionarLivro("O Guarani",
        							 "José de Alencar", 
        							 1857);
        
        System.out.println("Lista todos os livros" + catalogoLivro.toString());
        System.out.println("Primeira ocorrencia " + catalogoLivro.retornaPrimeiraOcorrenciaDoAutor("Graciliano Ramos"));
        System.out.println("Pesquisa todos livros do autor" + catalogoLivro.pesquisarPorAutor("Machado de Assis"));
		System.out.println("Pesquisa por ano menor ano e maior ano  " +  catalogoLivro.
						   pesquisaLivroPorAnoMinimoMaximo
						   (menorAno, maiorAno));
	}
}
