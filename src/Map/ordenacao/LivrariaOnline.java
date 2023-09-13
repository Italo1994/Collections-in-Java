package Map.ordenacao;

import java.util.*;
import java.util.stream.*;

public class LivrariaOnline {
    Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        String[] linkFormatado = link.split(":", 2);
        String protocolo = linkFormatado[0];

        if(!protocolo.equalsIgnoreCase("https")) {
            throw new RuntimeException("O link informado não possui um protocolo seguro https");
        } else {
            livros.put(link, new Livro(titulo, autor, preco));
        }
    }

    public void removerLivro(String titulo) {
        if(livros.isEmpty()) {
            System.out.println("Não existe nenhum livro cadastrado na livraria online");
        } else {
            for(Map.Entry<String, Livro> entry : livros.entrySet()) {
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livros.remove(entry);
                    break;
                }
            }
        }
    }

    public Set<Livro> exibirLivrosOrdenadosPorPreco() {
        Set<Livro> livrosOrdenadosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            livrosOrdenadosPorPreco.add(entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Set<Livro> pesquisarLivrosPorAutor(String autor) {
        Set<Livro> livrosPorAutor = new HashSet<>();
        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorValor = Integer.MIN_VALUE;

        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if(entry.getValue().getPreco() > maiorValor) {
                maiorValor = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue();
            }
        }

        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorValor = Integer.MAX_VALUE;

        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if(entry.getValue().getPreco() < menorValor) {
                menorValor = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue();
            }
        }

        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://www.amazon.com.br/livrariaX-livroY", "Startup enxuta", "John Ryan", 28.98);
        livraria.adicionarLivro("https://www.amazon.com.br/livrariaX-livroA", "Startup A", "John Ryan", 21.69);
        livraria.adicionarLivro("https://www.amazon.com.br/livrariaX-livroB", "Startup B", "Ruben Ravier", 25.00);
        livraria.adicionarLivro("https://www.amazon.com.br/livrariaX-livroC", "Startup C", "Jack Nielsen", 18.98);

        //System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        System.out.println(livraria.pesquisarLivrosPorAutor("john ryan"));

        System.out.println("O livro mais caro é: " + livraria.obterLivroMaisCaro());
        System.out.println("O livro mais barato é: " + livraria.obterLivroMaisBarato());
    }
}
