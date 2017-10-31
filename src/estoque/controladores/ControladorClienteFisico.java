/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClienteFisicoDao;
import estoque.modelos.ClienteFisico;

/**
 *
 * @author EWalker
 */
public class ControladorClienteFisico {
    
    
    public void cadastrarFisico(ClienteFisico clienteFisico ) throws Exception{
        
        ClienteFisicoDao dao = new ClienteFisicoDao();
        dao.cadastrar(clienteFisico);
       
    }
    
    
    
    
}
