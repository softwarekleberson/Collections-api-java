package Colletions.Map.agenda;

public class Main {
	public static void main(String[] args) {
		AgendaContato agendaContato = new AgendaContato();
		
		agendaContato.adicionarContato("Kleberson", 4444);
		agendaContato.adicionarContato("Antonio", 4962);
		agendaContato.adicionarContato("Ana", 9820);
		agendaContato.adicionarContato("Cleusa", 1479);	
		
		agendaContato.exibirContatos();
		agendaContato.excluirContato("Cleusa");
		agendaContato.exibirContatos();
		System.out.println("Retorna o numero " + agendaContato.retornarNumeroPorNome("Kleberson"));
	}
}
