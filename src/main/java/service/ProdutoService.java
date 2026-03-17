package service;

import model.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoService {
    private Map<String, Produto> produtos =  new HashMap<>();

    public void adicionarProduto(Produto produto){
        produtos.put(produto.getNome().toLowerCase(), produto);
    }

    public void listarProdutos(){
        for(Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }

    public Produto buscarProdutoPorNome(String nome){
        return produtos.get(nome.toLowerCase());
    }

    public void removerProdutoPorNome(String nome) {
        Produto encontrado = buscarProdutoPorNome(nome);

        produtos.remove(encontrado.getNome());
    }
}
