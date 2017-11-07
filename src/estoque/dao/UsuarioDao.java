/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Usuario;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author FHC
 */
public class UsuarioDao extends ConnectionFactory {
    
    public void cadastrar(Usuario u) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO Usuario (nome, senha)";
        sql += "VALUES (?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
         stmt.setString(1, u.getNome());
         stmt.setString(2, u.getSenha());
         
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }
        
}
