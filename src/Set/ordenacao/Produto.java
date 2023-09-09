package Set.ordenacao;

import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto() {

    }

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public String toString() {
        return "Produto{ " +
                "nome='" + this.nome + "\'" +
                "codigo='" + this.codigo + "\'" +
                "preco='" + this.preco + "\'" +
                "quantidade='" + this.quantidade + "\'" +
                "}";
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
