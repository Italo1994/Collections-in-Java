package Set.pesquisa;

import java.util.HashSet;
import java.util.Set;
public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefas.remove(t);
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void exibirTarefas() {
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                System.out.println(t.toString());
            }
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void contarTarefas() {
        if(tarefas.size() == 0) {
            System.out.println("A lista de tarefas está vazia!");
        } else if(tarefas.size() == 1) {
            System.out.println("Existe " + tarefas.size() + " tarefa.");
        } else {
            System.out.println("Existem " + tarefas.size() + " tarefas.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t : tarefas) {
            if(t.getConcluido() == true) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefas) {
            if(t.getConcluido() == false) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                if(t.getConcluido() == true) {
                    t.setConcluido(false);
                }
            }
        }
    }

    public void limparListaTarefas() {
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        tarefas.removeAll(tarefasParaRemover);
    }

    public static void main(String[] args) {
        ListaTarefas minhasTarefas = new ListaTarefas();

        minhasTarefas.adicionarTarefa("Almoçar");
        minhasTarefas.adicionarTarefa("Estudar para o bootcamp da GFT");
        minhasTarefas.adicionarTarefa("Correr");
        minhasTarefas.adicionarTarefa("Ir ao A13");

        minhasTarefas.contarTarefas();
        System.out.println(minhasTarefas.obterTarefasPendentes());

//        minhasTarefas.marcarTarefaConcluida("Almoçar");
//        minhasTarefas.marcarTarefaConcluida("Ir ao A13");
//        System.out.println(minhasTarefas.obterTarefasConcluidas());
//        System.out.println(minhasTarefas.obterTarefasPendentes());
//        minhasTarefas.marcarTarefaPendente("Ir ao A13");

//        minhasTarefas.exibirTarefas();
        minhasTarefas.removerTarefa("Correr");
        minhasTarefas.exibirTarefas();
    }
}
