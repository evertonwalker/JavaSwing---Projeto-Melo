/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaocombanco.dao;

import conexaocombanco.modelos.Cliente;
import conexaocombanco.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ClienteDAO extends ConnectionFactory {
    
    
    public void cadastrar(Cliente a) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO aluno (matricula, nome)";
        sql += "VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
      //  stmt.setInt(1, a.getMatricula());
       // stmt.setString(2, a.getNome());
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }

    public void atualizar(Cliente a) throws Exception {
    }

    public void remover(Cliente filtro) throws Exception {
    }

    public ArrayList<Cliente> listar(Cliente a) throws Exception {
        ArrayList<Cliente> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT matricula, nome ";
        sql += "FROM aluno order by nome ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Cliente al = new Cliente();
           // al.setMatricula(rs.getInt("matricula"));
           // al.setNome(rs.getString("nome"));
            retorno.add(al);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
    
    
}
