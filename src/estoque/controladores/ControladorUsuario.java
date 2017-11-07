/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.UsuarioDao;
import estoque.modelos.Usuario;
import estoque.modelos.UsuarioInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FHC
 */
public class ControladorUsuario implements UsuarioInterface {

    @Override
    public void cadastrar(Usuario u) throws Exception {
        if (u.getNome().isEmpty()) {
            throw new Exception("Informe o Nome/Login do Usuário");
        }
        if ("".equals(u.getNome().trim())) {
            throw new Exception("Informar o Nome/Login do Usuário");
        }
        if (u.getSenha().replace(" ", "").length() < 8) {
            throw new Exception("A Senha deverá conter 8 dígitos");
        }

        UsuarioDao dao = new UsuarioDao();
        try {
            dao.cadastrar(u);
        } catch (Exception ex) {
            Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Usuario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> listar(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}