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
import java.sql.SQLException;
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

    public void atualizar(ClienteFisico cf, String oldCpf) throws Exception {
        
        Connection conn = conectarPrepareStatment();
        
        String sql = "Update CLIENTE_FISICO  set cpf = ?, nome = ?, email = ?,"
                + "telefonePrinc = ?, telefoneOpc = ?, cep = ?,"
                + "logradouro = ?, estado = ?, cidade = ?, bairro = ?,"
                + "numero = ? where cpf = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, cf.getCpf());
            stmt.setString(2, cf.getNome());
            stmt.setString(3, cf.getEmail());
            stmt.setString(4, cf.getTelefonePrinc());
            stmt.setString(5, cf.getTelefoneOpc());
            stmt.setString(6, cf.getCep());
            stmt.setString(7, cf.getLogradouro());
            stmt.setString(8, cf.getEstado());
            stmt.setString(9, cf.getCidade());
            stmt.setString(10,cf.getBairro());
            stmt.setString(11,cf.getNumero());
            stmt.setString(12, oldCpf);

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        
        
        
        
    }

    public void remover(ClienteFisico cf) throws Exception {

        Connection conn = conectarPrepareStatment();
        String sql = "Delete from CLIENTE_FISICO where cpf = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, cf.getCpf());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }

    }

    public ArrayList<ClienteFisico> listar() throws Exception {

        ArrayList<ClienteFisico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT nome, cpf, email, telefonePrinc, telefoneOpc, cep,"
                + "numero FROM CLIENTE_FISICO order by nome ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClienteFisico cf = new ClienteFisico();

            cf.setNome(rs.getString("nome"));
            cf.setCpf(rs.getString("cpf"));
            cf.setEmail(rs.getString("email"));
            cf.setTelefonePrinc(rs.getString("telefonePrinc"));
            cf.setTelefoneOpc(rs.getString("telefoneOpc"));
            cf.setCep(rs.getString("cep"));
            cf.setNumero((rs.getString("numero")));
           
            retorno.add(cf);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

}
