package Colletions.List.listatarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefas = new ArrayList<>(5);
	
	public ListaTarefa(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	public void adicionarTarefas(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public int numeroTotalTarefas() {
		return tarefas.size();
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaRemover = new ArrayList<>();
		for(Tarefa item : tarefas) {
			if(item.getDescricao().equals(descricao)) {
				tarefaRemover.add(item);
			}		
		}
		
		if(tarefaRemover != null) {
			tarefas.removeAll(tarefaRemover);
		}	
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Tarefa item : tarefas) {
			sb.append(item.toString()).append("\n");
		}
		
		return sb.toString();
	}
}