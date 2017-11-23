/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos.interfaces;

import estoque.modelos.ClienteFisico;
import java.util.ArrayList;

/**
 *
 * @author Ewalker
 */
public interface ClienteFisicoInterface {
    
    public void cadastrar(ClienteFisico c);
    
    public void atualizar(ClienteFisico c);
    
    public void remover(ClienteFisico filtro);
    
    public ArrayList<ClienteFisico> listar(ClienteFisico c);
    
  
}
