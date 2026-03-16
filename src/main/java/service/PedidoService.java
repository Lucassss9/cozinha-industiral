package service;

import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    int proximoId = 0;

    public void adicionarPedido(Pedido pedido) {
        pedido.setId(proximoId);
        proximoId++;
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
