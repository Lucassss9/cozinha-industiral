package service;

import model.Empresa;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    int proximoId = 1;

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

    public List<Pedido> listarPedidosPorEmpresa(Empresa empresa) {
        List<Pedido> resultados = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getEmpresa().getId() == empresa.getId()) {
                resultados.add(pedido);
            }
        }
        return resultados;
    }
}
