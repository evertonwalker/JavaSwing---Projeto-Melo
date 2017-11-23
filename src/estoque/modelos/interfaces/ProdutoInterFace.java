/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos.interfaces;

import estoque.modelos.Produto;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public interface ProdutoInterFace {
    
     public void cadastrarProduto(Produto p) throws Exception;

    public ArrayList<Produto> listar() throws Exception;
    
    public void atualizar(Produto p) throws Exception;
    
    public void remover(Produto p) throws Exception;
    
}
