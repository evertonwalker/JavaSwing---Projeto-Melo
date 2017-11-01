/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClientePessoaJuridicaDao;
import estoque.modelos.ClientePessoaJuridica;
import estoque.modelos.ClientePessoaJuridicaInterface;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author FHC
 */
public class ControladorClientePessoaJuridica implements ClientePessoaJuridicaInterface{
    
    @Override
    public void cadastrar(ClientePessoaJuridica c) {
        
        ClientePessoaJuridicaDao dao = new ClientePessoaJuridicaDao();
         try {
             dao.cadastrar(c);
         } catch (Exception ex) {
             ex.getMessage();
             //Logger.getLogger(ControladorClientePessoaJuridica.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void atualizar(ClientePessoaJuridica c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(ClientePessoaJuridica filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClientePessoaJuridica> listar(ClientePessoaJuridica c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
