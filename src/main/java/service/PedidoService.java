package service;

import model.Empresa;
import model.Pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoService {
    private Map<Integer, Pedido> pedidos = new HashMap<>();

    int proximoId = 1;

    public void adicionarPedido(Pedido pedido) {
        pedido.setId(proximoId);
        proximoId++;
        pedidos.put(pedido.getId(), pedido);
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos.values()) {
            System.out.println(pedido);
        }
    }

    public List<Pedido> listarPedidosPorEmpresa(Empresa empresa) {
        List<Pedido> resultados = new ArrayList<>();

        for (Pedido pedido : pedidos.values()) {
            if (pedido.getEmpresa().getId() == empresa.getId()) {
                resultados.add(pedido);
            }
        }
        return resultados;
    }

    public Pedido buscarPedidoPorId(int id) {
        return pedidos.get(id);
    }
}
