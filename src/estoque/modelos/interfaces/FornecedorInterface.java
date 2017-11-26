/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos.interfaces;

import estoque.modelos.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public interface FornecedorInterface {
    
    public void cadastrarFornecedor(Fornecedor f) throws Exception;

    public ArrayList<Fornecedor> listar() throws Exception;
    
    public void atualizar(Fornecedor f,String oldCnpj) throws Exception;
    
    public void remover(Fornecedor f) throws Exception;
    
    public boolean verificarCnpj(String cnpj) throws Exception;
}
