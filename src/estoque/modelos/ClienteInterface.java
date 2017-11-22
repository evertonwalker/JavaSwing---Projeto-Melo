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
public interface ClienteInterface {
    
    public void cadastrarFisico(ClienteFisico c) throws Exception;
    
    public void cadastrarJuridico(ClientePessoaJuridica c) throws Exception;
    
    public void atualizar(Cliente c) throws Exception;
    
    public void remover(Cliente filtro) throws Exception;
    
    public ArrayList<Cliente> listarCliente() throws Exception;
    
    public boolean verificarCnpj(String cnpj) throws Exception;
    
    public boolean verificarCpf(String cpf) throws Exception;
    
}
