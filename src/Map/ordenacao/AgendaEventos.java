package Map.ordenacao;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);

        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " ocorrerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2023, Month.JULY, 10), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 12), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 22), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 8), "Evento 4", "Atração 4");

        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
