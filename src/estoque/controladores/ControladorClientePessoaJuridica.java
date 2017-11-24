/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClienteDao;
import estoque.dao.ClientePessoaJuridicaDao;
import estoque.modelos.ClienteFisico;
import estoque.modelos.ClientePessoaJuridica;
import estoque.modelos.interfaces.ClientePessoaJuridicaInterface;
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
    public void cadastrar(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception {

        if (pj.getCnpj().replace(" ", "").length() < 14) {
            throw new Exception("Informe o CNPJ do cliente com 14 dígitos");
        }
        if ("".equals(pj.getNomeFantasia().trim())) {
            throw new Exception("Informe o Nome Fantasia do Cliente");
        }
        if ("".equals(pj.getRazaoSocial().trim())) {
            throw new Exception("Informe a Razão Social do Cliente");
        }

        if ("".equals(pj.getEmail().trim())) {
            throw new Exception("Informe o email do Cliente");
        }

        if (pj.getTelefonePrinc().replace(" ", "").length() < 10 || pj.getTelefonePrinc().replace(" ", "").length() > 11) {
            throw new Exception("Informe o Telefone Principal do cliente com DDD, máximo 11 dígitos");
        }

        if ((pj.getTelefoneOpc().replace(" ", "").length() < 10 && pj.getTelefoneOpc().length() != 0)
                || (pj.getTelefoneOpc().replace(" ", "").length() > 11 && pj.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (pj.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }
        
        if ("".equals(pj.getNumero())) {
            throw new Exception("Informe o número do Endereço do Cliente");
        }

        ClienteDao dao = new ClienteDao();
        try {
            dao.cadastrar(pf, pj);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void atualizar(ClienteFisico cf, ClientePessoaJuridica pj, String oldCpf, String oldCnpj) throws Exception {

        if (pj.getCnpj().replace(" ", "").length() < 14) {
            throw new Exception("Informe o CNPJ do cliente com 14 dígitos");
        }
        if ("".equals(pj.getNomeFantasia().trim())) {
            throw new Exception("Informe o Nome Fantasia do Cliente");
        }

        if ("".equals(pj.getRazaoSocial().trim())) {
            throw new Exception("Informe a Razão Social do Cliente");
        }

        if ("".equals(pj.getEmail().trim())) {
            throw new Exception("Informe o email do Cliente");
        }

        if (pj.getTelefonePrinc().replace(" ", "").length() < 10 || pj.getTelefonePrinc().replace(" ", "").length() > 11) {
            throw new Exception("Informe o Telefone Principal do cliente com DDD, máximo 11 dígitos");
        }

        if ((pj.getTelefoneOpc().replace(" ", "").length() < 10 && pj.getTelefoneOpc().length() != 0)
                || (pj.getTelefoneOpc().replace(" ", "").length() > 11 && pj.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (pj.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }
        
        if ("".equals(pj.getNumero())) {
            throw new Exception("Informe o número do Endereço do Cliente");
        }

        ClienteDao dao = new ClienteDao();
        try {
            dao.atualizar(cf, pj, oldCpf, oldCnpj);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void remover(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception {

        ClienteDao dao = new ClienteDao();

        try {
            dao.remover(pf, pj);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    @Override
    public ArrayList<ClientePessoaJuridica> listarPessoaJuridica() throws Exception {

        ClienteDao dao = new ClienteDao();
        return dao.listarPessoaJuridica();

    }

}
