package Map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoque;

    EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoque.values().toString());
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                valorTotalEstoque += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for(Produto p : estoque.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantValEstoque = null;
        double maiorQuantidade = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() * p.getQuantidade() > maiorQuantidade) {
                    produtoMaiorQuantValEstoque = p;
                }
            }
        }
        return produtoMaiorQuantValEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos supermercado = new EstoqueProdutos();

        supermercado.adicionarProduto(1L, "Peito de Frango", 50, 22.69);
        supermercado.adicionarProduto(2L, "Feijão", 55, 10.99);
        supermercado.adicionarProduto(3L, "Pippos", 10, 4);
        supermercado.adicionarProduto(4L, "Arroz", 20, 8.68);

        supermercado.exibirProdutos();
        System.out.println(supermercado.calcularValorTotalEstoque());
        Produto p = supermercado.obterProdutoMaisBarato();
        System.out.println(p.getNome());
    }
}
