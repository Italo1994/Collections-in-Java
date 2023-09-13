package Map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

import java.util.Comparator;

public class Dicionario {
    Map<String, String> dicionario;

    Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra) {
        String def = null;

        if(!dicionario.isEmpty()) {
            def = dicionario.get(palavra);
        }

        return def;
    }

    public static void main(String[] args) {
        Dicionario meuDicionario = new Dicionario();

        meuDicionario.adicionarPalavra("Expressar", "O ato de comunicar algo através dos seus pensamentos");
        meuDicionario.adicionarPalavra("Finalizar", "Terminar algo");
        meuDicionario.adicionarPalavra("Guerrear", "Batalha para combater oponentes através da guerra");
        meuDicionario.adicionarPalavra("Estudar", "Método usado para adquirir conhecimento");

//        meuDicionario.exibirPalavras();
        System.out.println( meuDicionario.pesquisarPorPalavra("Estudar"));
        meuDicionario.removerPalavra("Guerrear");
//        meuDicionario.exibirPalavras();
    }
}