package Map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            if (palavras.containsKey(palavra)) {
                // calcula o mapeamento da palavra contida no Map e atualiza o seu valor que está associado a chave palavra que foi passada por parâmetro
                palavras.compute(palavra, (k, v) -> (v == null) ? 1 : v + 1);
            } else {
                palavras.put(palavra, 1);
            }
        } else {
            // adicionar a primeira palavra
            palavras.put(palavra, 1);
        }
    }

    public void exibirContagemPalavras () {
        palavras.entrySet().forEach((p) -> System.out.println("A palavra " + p.getKey() + " aparece " + p.getValue() + " vezes."));
    }

    public void encontrarPalavraMaisFrequente() {

    }

    public static void main(String[] args) {
        ContagemPalavras c = new ContagemPalavras();

        c.adicionarPalavra("amor");
        c.adicionarPalavra("família");
        c.adicionarPalavra("correr");
        c.adicionarPalavra("igreja");
        c.adicionarPalavra("comer");
        c.adicionarPalavra("correr");
        c.adicionarPalavra("família");
        c.adicionarPalavra("igreja");

        c.exibirContagemPalavras();
    }
}
