package Colletions.List.listatarefa;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Tarefa> afazeres = new ArrayList<>();
		afazeres.add(new Tarefa("ir ao cinema"));
		afazeres.add(new Tarefa("Estudar"));
		afazeres.add(new Tarefa("Cozinhar"));
		afazeres.add(new Tarefa("ir ao cinema"));
		afazeres.add(new Tarefa("ir ao cinema"));
		
		ListaTarefa listaTarefa = new ListaTarefa(afazeres);
		listaTarefa.adicionarTarefas(new Tarefa("Pagar conta"));
		listaTarefa.removerTarefa("ir ao cinema");
		
		System.out.println(listaTarefa.toString());
		System.out.println(listaTarefa.numeroTotalTarefas());
	}
}