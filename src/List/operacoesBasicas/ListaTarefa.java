package List.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : listaTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        listaTarefas.toString();
    }

    public static void main(String[] args) {
        ListaTarefa tarefaList = new ListaTarefa();

        //System.out.println(tarefaList.obterTotalTarefas());

        tarefaList.adicionarTarefa("Tarefa 1");
        tarefaList.adicionarTarefa("Tarefa 2");
        tarefaList.adicionarTarefa("Tarefa 3");
        tarefaList.adicionarTarefa("Tarefa 4");

        System.out.println("O total de elementos na lista é: " + tarefaList.obterTotalTarefas());
        
        tarefaList.removerTarefa("Tarefa 1");

        System.out.println("O total de elementos na lista é: " + tarefaList.obterTotalTarefas());
        
        tarefaList.obterDescricoesTarefas();
    }
}