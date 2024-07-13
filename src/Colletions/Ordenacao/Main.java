package Colletions.Ordenacao;

public class Main {

	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adcionarPessoa("João", 25, 1.75);
        ordenacaoPessoa.adcionarPessoa("Pedro", 20, 1.80);
        ordenacaoPessoa.adcionarPessoa("Maria", 30, 1.65);
        
        System.out.println(ordenacaoPessoa.ordenaPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
	}
}
