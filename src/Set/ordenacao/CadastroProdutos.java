package Set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> conjuntoProdutos;

    CadastroProdutos() {
        this.conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        conjuntoProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>();

        for(Produto p : conjuntoProdutos) {
            System.out.println(p.toString());
        }
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(conjuntoProdutos);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto("Produto 1", 123, 4.50, 10);
        produtos.adicionarProduto("Produto 2", 124, 5.80, 14);
        produtos.adicionarProduto("Produto 3", 120, 7.75, 13);
        produtos.adicionarProduto("Produto 4", 121, 9.90, 18);

       produtos.exibirProdutosPorNome();
       System.out.println(produtos.exibirProdutosPorPreco());
    }
}
