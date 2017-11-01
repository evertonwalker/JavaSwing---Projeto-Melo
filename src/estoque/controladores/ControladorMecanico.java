/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.MecanicoDao;
import estoque.modelos.Mecanico;
import estoque.modelos.MecanicoInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FHC
 */
public class ControladorMecanico implements MecanicoInterface {

    @Override
    public void cadastrar(Mecanico m) throws Exception {
            
    if (m.getNome().isEmpty()){
        throw new Exception("Informe o Nome do Mecânico");
    }
    if (!m.getCpf().isEmpty()){
        throw new Exception("O Cpf deverá conter 11 dígitos");
    } 
    if ("".equals(m.getNome().trim())){
        throw new Exception("Informar o nome do Mecânico");
    }
    
    MecanicoDao dao = new MecanicoDao();
         try {
             dao.cadastrar(m);
         } catch (Exception ex) {
             Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
         }    
 
        
    }

    @Override
    public void atualizar(Mecanico m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Mecanico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Mecanico> listar(Mecanico m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
