package List.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listItems;

    public CarrinhoDeCompras() {
        this.listItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsToRemove = new ArrayList<>();

        for(Item item : listItems) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                itemsToRemove.add(item);
            }
        }

        listItems.removeAll(itemsToRemove);
    }

    public double calcularValorTotal() {
        double totalPrice = 0;

        for(Item item : listItems) {
            totalPrice += ( item.getPreco() * item.getQuantidade() );
        }

        return totalPrice;
    }

    public void exibirItens() {
        for(Item item : listItems) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Notebook Dell", 5000.00, 1);
        carrinho.adicionarItem("Headset", 298.50, 2);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ " +carrinho.calcularValorTotal());
        
        carrinho.removerItem("Headset");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ " +carrinho.calcularValorTotal());
    }
}
