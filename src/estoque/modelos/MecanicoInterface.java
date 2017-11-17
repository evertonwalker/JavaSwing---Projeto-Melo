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
public interface MecanicoInterface {
    
    public void cadastrar(Mecanico mec) throws Exception;
    
    public void atualizar(Mecanico mec, String oldCpf) throws Exception;
    
    public void remover(Mecanico mec)throws Exception;
    
    public ArrayList<Mecanico> listarMecanico() throws Exception;
    
    public boolean verificarCpf(String cpf) throws Exception;
    
    public ArrayList<Mecanico> filtragem(String filtro) throws Exception;
    
}
