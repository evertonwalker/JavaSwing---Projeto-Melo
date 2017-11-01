/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClienteFisicoDao;
import estoque.modelos.ClienteFisico;
import estoque.modelos.ClienteFisicoInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EWalker
 */
public class ControladorClienteFisico {
    
     
    public void cadastrar(ClienteFisico c) {
        
        ClienteFisicoDao dao = new ClienteFisicoDao();
         try {
             dao.cadastrar(c);
         } catch (Exception ex) {
             Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    

    public void atualizar(ClienteFisico c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void remover(ClienteFisico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ArrayList<ClienteFisico> listar() throws Exception {
           
        ClienteFisicoDao dao = new ClienteFisicoDao();  
        return dao.listar();
                
    }
          
    
}
