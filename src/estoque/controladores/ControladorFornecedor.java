/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.FornecedorDao;
import estoque.modelos.Fornecedor;
import estoque.modelos.FornecedorInterface;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ControladorFornecedor implements FornecedorInterface {

    @Override
    public void cadastrarFornecedor(Fornecedor f) throws Exception {
        FornecedorDao dao = new FornecedorDao();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Fornecedor f) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}