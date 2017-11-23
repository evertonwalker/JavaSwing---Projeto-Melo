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
 * @author Walker
 */
public class ControladorProduto implements ProdutoInterFace{

    @Override
    public void cadastrarProduto(Produto p) throws Exception {
        ProdutoDao dao = new ProdutoDao();
       try{
           dao.cadastrarProduto(p);
       } catch(Exception e ){
           e.getMessage();
       }
        
    }

    @Override
    public ArrayList<Produto> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
