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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FHC
 */
public class ControladorClientePessoaJuridica implements ClientePessoaJuridicaInterface {

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

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        try {
            dao.cadastrar(c);
        } catch (Exception ex) {
            ex.getMessage();
            Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(ClientePessoaJuridica cpj) {

        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
        try {
            dao.atualizar(cpj);
        } catch (Exception ex) {
            ex.getMessage();
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
