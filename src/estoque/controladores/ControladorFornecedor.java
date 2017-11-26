/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.FornecedorDao;
import estoque.modelos.Fornecedor;
import estoque.modelos.interfaces.FornecedorInterface;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ControladorFornecedor implements FornecedorInterface {

    @Override
    public void cadastrarFornecedor(Fornecedor f) throws Exception {
        FornecedorDao dao = new FornecedorDao();
        
        if (f.getCnpj().replace(" ", "").length() < 14) {
            throw new Exception("Informe o CNPJ do Fornecedor com 14 dígitos");
        }
        if ("".equals(f.getNomeFantasia().trim())) {
            throw new Exception("Informe o Nome Fantasia do Fornecedor");
        }
        if ("".equals(f.getRazaoSocial().trim())) {
            throw new Exception("Informe a Razão Social do Fornecedor");
        }

        if ("".equals(f.getEmail().trim())) {
            throw new Exception("Informe o email do Fornecedor");
        }

        if (f.getTelefonePrincipal().replace(" ", "").length() < 10 || f.getTelefonePrincipal().replace(" ", "").length() > 11) {
            throw new Exception("Informe o Telefone Principal do Fornecedor com DDD, máximo 11 dígitos");
        }

        if ((f.getTelefoneOpcional().replace(" ", "").length() < 10 && f.getTelefoneOpcional().length() != 0)
                || (f.getTelefoneOpcional().replace(" ", "").length() > 11 && f.getTelefoneOpcional().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do Fornecedor com DDD, máximo 11 dígitos");
        }

        if (f.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do Fornecedor com 8 dígitos");
        }

        if ("".equals(f.getNomeResponsaveis().trim())) {
            throw new Exception("Informe o nome do responsável pelo Fornecedor");
        }

        /*if (dao.verificarCnpj(f.getCnpj())) {
            throw new Exception("CNPJ do CLIENTE JURIDICO já cadastrado");
        }*/
        
        try {
            dao.cadastrarFornecedor(f);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public ArrayList<Fornecedor> listar() throws Exception {
        FornecedorDao dao = new FornecedorDao();
        ArrayList<Fornecedor> retorno = new ArrayList<>();
        try {
            retorno = dao.listar();
        } catch (Exception e) {
            e.getMessage();
        }
        return retorno;
    }

    @Override
    public void atualizar(Fornecedor f, String oldCnpj) throws Exception {

        FornecedorDao dao = new FornecedorDao();
        try {
            dao.atualizar(f, oldCnpj);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public void remover(Fornecedor f) throws Exception {

        FornecedorDao dao = new FornecedorDao();
        try {
            dao.remover(f);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public boolean verificarCnpj(String cnpj) throws Exception {

        boolean verificador = false;

        FornecedorDao dao = new FornecedorDao();
        try {
            verificador = dao.verificarCnpj(cnpj);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return verificador;
    }
}
