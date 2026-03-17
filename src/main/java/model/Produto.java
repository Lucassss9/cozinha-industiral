package model;

public class Produto {

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        setNome(nome);
        setPreco(preco);
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n---------" +
                "\nNome: " + nome +
                "\nPreço: " + preco +
                "\nCategoria: " + categoria;
    }
}
