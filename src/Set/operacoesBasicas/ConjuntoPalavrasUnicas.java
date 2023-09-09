package Set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        // p indica a palavra a ser removida
        for(String p : palavrasUnicas) {
            if(p == palavra) {
                palavrasUnicas.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        boolean presente = false;
        for(String p : palavrasUnicas) {
            if(p.equalsIgnoreCase(palavra)) {
                System.out.println(palavra + " está presente no conjunto de palavras únicas.");
                presente = true;
                break;
            }
        }
        if(!presente) {
            System.out.println(palavra + " não está presente no conjunto de palavras únicas");
        }
    }

    public void exibirPalavrasUnicas() {
        for(String p : palavrasUnicas) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Comer");
        palavras.adicionarPalavra("Dormir");
        palavras.adicionarPalavra("Brincar");
        palavras.adicionarPalavra("Beber");
        palavras.adicionarPalavra("Amar");

        palavras.verificarPalavra("Amar");

        palavras.exibirPalavrasUnicas();
    }
}
