package List.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutorX = new ArrayList<>();

        if(listaLivros.isEmpty()) {
            System.out.println("Ainda não há nenhum livro no catálogo!");
        } else {
            for(Livro livro : listaLivros) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutorX.add(livro);
                }
            }
        }

        return livrosAutorX;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervalo = new ArrayList<>();

        if(listaLivros.isEmpty()) {
            System.out.println("Ainda não há nenhum livro no catálogo!");
        } else {
            for(Livro livro : listaLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosIntervalo.add(livro);
                }
            }
        }

        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = new Livro();

        if(listaLivros.isEmpty()) {
            System.out.println("Ainda não há nenhum livro no catálogo!");
        } else {
            for(Livro livro : listaLivros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    return livroEncontrado;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
        catalogo.adicionarLivro("Harry Potter e a Câmara Secreta", "J. K. Rowling", 1998);
        catalogo.adicionarLivro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 2003);
        catalogo.adicionarLivro("Harry Potter e o Enigma do Principe", "J. K. Rowling", 2005);
        catalogo.adicionarLivro("Harry Potter e as Relíquias da Morte", "J. K. Rowling", 2007);
        catalogo.adicionarLivro("Halloween - O Retorno de Michael Myers", "Stephen King", 1988);
        catalogo.adicionarLivro("Percy Jackson - O Ladrão de Raios", "John Culler", 2010);

        System.out.println(catalogo.pesquisarPorAutor("J. K. Rowling").toString());

        System.out.println(catalogo.pesquisarPorIntervaloAnos(1995, 2005));

        System.out.println(catalogo.pesquisarPorTitulo("Harry Potter e a Ordem da Fênix"));
    }
}
