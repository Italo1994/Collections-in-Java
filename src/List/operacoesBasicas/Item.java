package List.operacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item() {

    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
             "nome='" + this.nome + "\'" +
             "preco='" + this.preco + "\'" +
             "quantidade=" + this.quantidade +
             "}";
    }
}
