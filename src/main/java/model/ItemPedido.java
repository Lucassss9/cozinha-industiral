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
}
