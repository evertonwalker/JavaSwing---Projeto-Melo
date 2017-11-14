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
    
    public void atualizar(ClientePessoaJuridica c, String oldCnpj) throws Exception;
    
    public void remover(ClientePessoaJuridica filtro) throws Exception;
    
    public ArrayList<ClientePessoaJuridica> listarPessoaJuridica() throws Exception;
    
    public boolean verificarCnpj(String cnpj) throws Exception;
    
}
