package Set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(!agenda.isEmpty()) {
            for(Contato contato : agenda) {
                System.out.println(contato.toString());
            }
        } else {
            System.out.println("Agenda de contatos vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato contato : agenda) {
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for(Contato c : agenda) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos minhaAgenda = new AgendaContatos();

        minhaAgenda.adicionarContato("Italo", 994203364);
        minhaAgenda.adicionarContato("Briana", 999120999);
        minhaAgenda.adicionarContato("Briana DIO", 988213411);
        minhaAgenda.adicionarContato("Briana DIO", 998214412);

        minhaAgenda.exibirContatos();

        System.out.println(minhaAgenda.pesquisarPorNome("Italo"));
    }
}
