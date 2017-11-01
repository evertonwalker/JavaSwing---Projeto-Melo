/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos;

import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public interface ClientePessoaJuridicaInterface {
    
    public void cadastrar(ClientePessoaJuridica c) throws Exception;
    
    public void atualizar(ClientePessoaJuridica c);
    
    public void remover(ClientePessoaJuridica filtro);
    
    public ArrayList<ClientePessoaJuridica> listar(ClientePessoaJuridica c);
    
}
