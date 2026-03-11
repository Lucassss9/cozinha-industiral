package service;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos =  new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Produto buscarProdutoPorNome(String nome){
        for(Produto produto : produtos) {
            if(produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void removerProdutoPorNome(String nome) {
        Produto encontrado = buscarProdutoPorNome(nome);

        if(encontrado != null) {
            produtos.remove(encontrado);
        }
    }
}
