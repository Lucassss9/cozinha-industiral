package service;

import model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaService {
    private List<Empresa> empresas = new ArrayList<>();

    int proximoId = 1;

    public void adicionarEmpresa(Empresa empresa) {
        empresa.setId(proximoId);
        proximoId++;
        empresas.add(empresa);
    }

    public void listarEmpresas() {
        for (Empresa e :  empresas) {
            System.out.println(e);
        }
    }

    public Empresa buscarEmpresaPorId(int id) {
        for (Empresa e :  empresas) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public Empresa buscarEmpresaPorNome(String nome) {
        for (Empresa e :  empresas) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }

    public void removerEmpresaPorNome(String nome) {
        Empresa encontrado = buscarEmpresaPorNome(nome);

        if (encontrado != null) {
            empresas.remove(encontrado);
        }
    }
}
