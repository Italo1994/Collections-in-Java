package Map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> contatos;

    AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatos.isEmpty()) {
            contatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if(!contatos.isEmpty()) {
            numeroPorNome = contatos.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos minhaAgenda = new AgendaContatos();

        minhaAgenda.adicionarContato("Italo", 994203364);
        minhaAgenda.adicionarContato("Briana", 999120999);
        minhaAgenda.adicionarContato("Briana DIO", 988213411);
        minhaAgenda.adicionarContato("Briana DIO", 998214412);

//        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Briana DIO");
        minhaAgenda.exibirContatos();
    }
}
