package model;

public class Empresa {

    private String nome;
    private int id;
    private int cnpj;
    private String email;
    private String endereço;

    public Empresa(String nome, int cnpj, String email, String endereço) {
        setNome(nome);
        setCnpj(cnpj);
        this.email = email;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public void setCnpj(int cnpj) {
        if (cnpj < 14 || cnpj > 14) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.cnpj = cnpj;
    }
}
