/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClientePessoaJuridicaDao;
import estoque.modelos.ClientePessoaJuridica;
import estoque.modelos.ClientePessoaJuridicaInterface;
import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public class ControladorClientePessoaJuridica implements ClientePessoaJuridicaInterface {

    public boolean verificarCnpj(String cnpj) throws Exception {

        boolean verificador = false;

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        try {
            verificador = dao.verificarCnpj(cnpj);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return verificador;
    }
    
    @Override
    public void cadastrar(ClientePessoaJuridica c) throws Exception {

        if (c.getCnpj().replace(" ", "").length() < 14) {
            throw new Exception("Informe o CNPJ do cliente com 14 dígitos");
        }
        if ("".equals(c.getNomeFantasia().trim())) {
            throw new Exception("Informe o Nome Fantasia do Cliente");
        }
        if ("".equals(c.getRazaoSocial().trim())) {
            throw new Exception("Informe a Razão Social do Cliente");
        }

        if ("".equals(c.getEmail().trim())) {
            throw new Exception("Informe o email do Cliente");
        }

        if (c.getTelefonePrinc().replace(" ", "").length() < 10 || c.getTelefonePrinc().replace(" ", "").length() > 11) {
            throw new Exception("Informe o Telefone Principal do cliente com DDD, máximo 11 dígitos");
        }

        if ((c.getTelefoneOpc().replace(" ", "").length() < 10 && c.getTelefoneOpc().length() != 0)
                || (c.getTelefoneOpc().replace(" ", "").length() > 11 && c.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (c.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        try {
            dao.cadastrar(c);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void atualizar(ClientePessoaJuridica cpj, String oldCnpj) throws Exception {

        if (cpj.getCnpj().replace(" ", "").length() < 14) {
            throw new Exception("Informe o CNPJ do cliente com 14 dígitos");
        }
        if ("".equals(cpj.getNomeFantasia().trim())) {
            throw new Exception("Informe o Nome Fantasia do Cliente");
        }

        if ("".equals(cpj.getRazaoSocial().trim())) {
            throw new Exception("Informe a Razão Social do Cliente");
        }

        if ("".equals(cpj.getEmail().trim())) {
            throw new Exception("Informe o email do Cliente");
        }

        if (cpj.getTelefonePrinc().replace(" ", "").length() < 10 || cpj.getTelefonePrinc().replace(" ", "").length() > 11) {
            throw new Exception("Informe o Telefone Principal do cliente com DDD, máximo 11 dígitos");
        }

        if ((cpj.getTelefoneOpc().replace(" ", "").length() < 10 && cpj.getTelefoneOpc().length() != 0)
                || (cpj.getTelefoneOpc().replace(" ", "").length() > 11 && cpj.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (cpj.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        try {
            dao.atualizar(cpj, oldCnpj);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void remover(ClientePessoaJuridica cpj) throws Exception {

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();

        try {
            dao.remover(cpj);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    @Override
    public ArrayList<ClientePessoaJuridica> listarPessoaJuridica() throws Exception {

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        return dao.listarPessoaJuridica();

    }

}
