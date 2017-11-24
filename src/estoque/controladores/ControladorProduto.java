/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ProdutoDao;
import estoque.modelos.Produto;
import estoque.modelos.interfaces.ProdutoInterFace;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ControladorProduto implements ProdutoInterFace {
    
    private ProdutoDao dao;
    
    public ControladorProduto(){
        this.dao = new ProdutoDao();
    }

    @Override
    public void cadastrarProduto(Produto p) throws Exception {

        if ("".equals(p.getFornecedor().getNomeFantasia().isEmpty())) {
            throw new Exception("Selecione o Fornecedor do Produto");
        }
        
        if ("".equals(p.getReferencia().trim())) {
            throw new Exception("Informe o código referênia do Produto");
        }
        
        if ("".equals(p.getDescricao().trim())) {
            throw new Exception("Informe a descrição do Produto");
        }
        
        
        
        ProdutoDao dao = new ProdutoDao();
        try {
            dao.cadastrarProduto(p);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public ArrayList<Produto> listar() throws Exception {
        return dao.listar();
        
    }

    @Override
    public void atualizar(Produto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Produto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
