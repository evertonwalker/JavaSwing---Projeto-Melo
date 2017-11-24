/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos.interfaces;

import estoque.modelos.ClienteFisico;
import estoque.modelos.ClientePessoaJuridica;
import java.util.ArrayList;

/**
 *
 * @author Ewalker
 */
public interface ClienteFisicoInterface {
    
    public void cadastrar(ClienteFisico c, ClientePessoaJuridica pj) throws Exception;
    
    public void atualizar(ClienteFisico c, ClientePessoaJuridica pj, String oldCpf, String oldCnpj) throws Exception;
    
    public void remover(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception;
    
    public ArrayList<ClienteFisico> listar() throws Exception;
    
    public boolean verificarCpf(String cpf) throws Exception;
    
  
}
