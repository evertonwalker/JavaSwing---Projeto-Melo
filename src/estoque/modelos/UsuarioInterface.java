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
public interface UsuarioInterface {
    
    public void cadastrar(Usuario u) throws Exception;
    
    public void atualizar(Usuario u);
    
    public void remover(Usuario filtro);
    
    public ArrayList<Usuario> listar(Usuario u);    
    
}
