package app;

import model.Empresa;
import model.ItemPedido;
import model.Pedido;
import model.Produto;
import service.EmpresaService;
import service.PedidoService;

public class Main {
    public static void main(String[] args) {
        Produto produtoTeste = new Produto("Produto teste", 20.99, "Teste");
        Empresa empresaTeste = new Empresa("Empresa teste", "12345678910123",
                "empresa.teste@gmail.com", "Santo André, SP - Rua copas, 450");
        Pedido pedidoTeste = new Pedido(empresaTeste);
        ItemPedido itemTeste = new ItemPedido(produtoTeste, produtoTeste.getPreco(), 25);

        PedidoService pedidoServiceT = new PedidoService();
        EmpresaService empresaServiceT = new EmpresaService();

        empresaServiceT.adicionarEmpresa(empresaTeste);

        pedidoTeste.adicionarItem(itemTeste);
        pedidoServiceT.adicionarPedido(pedidoTeste);

        pedidoServiceT.listarPedidos();
    }
}
