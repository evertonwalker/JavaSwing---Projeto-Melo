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
    
    public void cadastrar(Mecanico m) throws Exception;
    
    public void atualizar(Mecanico m);
    
    public void remover(Mecanico filtro);
    
    public ArrayList<Mecanico> listar(Mecanico m);
    
}
