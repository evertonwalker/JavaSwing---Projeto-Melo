/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Mecanico;
import estoque.modelos.MecanicoInterface;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author FHC
 */
public class MecanicoDao extends ConnectionFactory{
    
    public void cadastrar(Mecanico m) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO MECANICO (cpf, nome)";
        sql += "VALUES (?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
         stmt.setString(1, m.getCpf());
         stmt.setString(2, m.getNome());
         
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }
    
    
    
}
