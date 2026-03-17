package model;

public class Empresa {

    private String nome;
    private int id;
    private String cnpj;
    private String email;
    private String endereco;

    public Empresa(String nome, String cnpj, String email, String endereco) {
        setNome(nome);
        setCnpj(cnpj);
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        cnpj = cnpj.replaceAll("[^0-9]", "");

        if (cnpj.length() != 14 || cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222") || cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
                cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888") || cnpj.equals("99999999999999")) {

            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.cnpj = cnpj;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empresa \n" +
                "Id: " + id + '\n' +
                "Nome: " + nome +
                "CNPJ: " + cnpj + '\n' +
                "E-mail:" + email + '\n' +
                "Endereço: " + endereco;
    }
}