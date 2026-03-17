package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Empresa empresa;
    private List<ItemPedido> itens;
    private LocalDateTime dataHoraPedido;

    public Pedido(Empresa empresa) {
        this.empresa = empresa;
        dataHoraPedido = LocalDateTime.now();
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularTotalPedido() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n========================================" +
                "\n          DETALHE DO PEDIDO #" + id +
                "\n========================================" +
                "\nCLIENTE: " + empresa +
                "\nDATA: " + dataHoraPedido +
                "\n----------------------------------------" +
                "\nITENS:" + itens +
                "\n----------------------------------------" +
                "\nTOTAL DO PEDIDO: R$ " + calcularTotalPedido() +
                "\n========================================\n";
    }
}
