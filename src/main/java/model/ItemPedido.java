package model;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(Produto produto, double precoUnitario, int quantidade) {
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        if (precoUnitario <= 0 || quantidade <= 0) {
            throw new IllegalArgumentException("Valor ou Quantidade inválidos.");
        }
        return precoUnitario * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item Pedido" +
                "\nProduto: " + produto +
                "\nQuantidade: " + quantidade +
                "\nPreço Unitário: " + precoUnitario;
    }
}
