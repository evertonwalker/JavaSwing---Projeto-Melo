/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.ClienteFisico;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ClienteFisicoDao extends ConnectionFactory {
        
    public void cadastrar(ClienteFisico c) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE_FISICO (cpf, nome, email,"
                + " telefonePrinc, telefoneOpc, cep, logradouro, estado,"
                + "cidade, bairro, numero)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
         stmt.setString(1, c.getCpf());
         stmt.setString(2, c.getNome());
         stmt.setString(3, c.getEmail());
         stmt.setString(4, c.getTelefonePrinc());
         stmt.setString(5, c.getTelefoneOpc());
         stmt.setString(6, c.getCep());
         stmt.setString(7, c.getLogradouro());
         stmt.setString(8, c.getEstado());
         stmt.setString(9, c.getCidade());
         stmt.setString(10, c.getBairro());
         stmt.setString(11, c.getNumero());
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }

    public void atualizar(ClienteFisico a) throws Exception {
    }

    public void remover(ClienteFisico filtro) throws Exception {
    }

    public ArrayList<ClienteFisico> listar(ClienteFisico a) throws Exception {
        ArrayList<ClienteFisico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT matricula, nome ";
        sql += "FROM aluno order by nome ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClienteFisico al = new ClienteFisico();
           // al.setMatricula(rs.getInt("matricula"));
           // al.setNome(rs.getString("nome"));
            retorno.add(al);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
    
    
}
