package projetoToDo;

public class Agenda {
	
	String data;
	int index;
	Tarefas[] tarefas;
	
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Tarefas[] getTarefas() {
		return tarefas;
	}
	public void setTarefas(Tarefas[] tarefas) {
		this.tarefas = tarefas;
	}
	
	Agenda(){
		
	}
	
	Agenda(Tarefas[] tarefas){
		this.tarefas = tarefas;
		this.index = 0;
	}
	
	public void imprimir(int tam, Tarefas[] tarefas) {
		int aux2 = 0;
		System.out.println("Dia: " + data);
	    for (int i = 0; i < tam; i++) {
	        if (tarefas[i] != null) {
	            System.out.println((i+1) + "a tarefa -> " + tarefas[i].getAtividade());
	            }
	        else {
	        	aux2++;
	        	if(aux2 == tam) {
	            	System.out.println("###Agenda vazia porque voce excluiu todas as tarefas###");
	            	}
	        }
	    	}
		}

	public void adicionar(Tarefas tarefa) {
		if(index < tarefas.length) {
			tarefas[index] = tarefa;
			index++;
		}
	}
	
	public void excluir(int excluir, int tam, Tarefas[] tarefa) {
		if(excluir-1 >= 0 && excluir-1 <= tam) {
			tarefas[excluir-1] = null;
			System.out.println("###Excluido com sucesso###\n");
		}else{
			System.out.println("###Tarefa não encontrada###");
		}
	}
	
		public void check(int checar, int tam, Tarefas[] tarefa) {
			if(checar-1 >= 0 && checar-1 <= tam) {
			for(int i = 0; i<tam; i++) {
				if(tarefa[checar-1] != null) {
		        tarefas[checar - 1].setAtividade("Concluido");
					}
				}
			System.out.println("...................................");
			if(tarefa[checar-1] == null) {
				System.out.println("Não tem como marcar como concluido uma tarefa que voce excluiu");
				}
			}
			else {
				System.out.println("Tarefa não encontrada");
				}
			}
		}
		