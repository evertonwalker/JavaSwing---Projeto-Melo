/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.controladores.ControladorClientePessoaJuridica;
import estoque.modelos.ClientePessoaJuridica;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Flávio
 */
public class ClientePessoaJuridicaDao extends ConnectionFactory {

    public void cadastrar(ClientePessoaJuridica c) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE_JURIDICO (cnpj, nomeFantasia, "
                + "razaoSocial, email, telefonePrinc, telefoneOpc, cep,"
                + " logradouro, estado, cidade, bairro, numero)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
        stmt.setString(1, c.getCnpj());
        stmt.setString(2, c.getNomeFantasia());
        stmt.setString(3, c.getRazaoSocial());
        stmt.setString(4, c.getEmail());
        stmt.setString(5, c.getTelefonePrinc());
        stmt.setString(6, c.getTelefoneOpc());
        stmt.setString(7, c.getCep());
        stmt.setString(8, c.getLogradouro());
        stmt.setString(9, c.getEstado());
        stmt.setString(10, c.getCidade());
        stmt.setString(11, c.getBairro());
        stmt.setString(12, c.getNumero());
        // executa
        try {
            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (Exception e) {
            e.getMessage();
        }   

    }

    public void atualizar(ClientePessoaJuridica cpj, String oldCnpj) throws Exception {

        Connection conn = conectarPrepareStatment();

        String sql = "Update CLIENTE_JURIDICO  set cnpj = ?, nomeFantasia = ?, razaoSocial = ? "
                + " email = ?, telefonePrinc = ?, telefoneOpc = ?, cep = ?,"
                + "logradouro = ?, estado = ?, cidade = ?, bairro = ?,"
                + "numero = ? where cnpj = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, cpj.getCnpj());
            stmt.setString(2, cpj.getNomeFantasia());
            stmt.setString(3, cpj.getRazaoSocial());
            stmt.setString(4, cpj.getEmail());
            stmt.setString(5, cpj.getTelefonePrinc());
            stmt.setString(6, cpj.getTelefoneOpc());
            stmt.setString(7, cpj.getCep());
            stmt.setString(8, cpj.getLogradouro());
            stmt.setString(9, cpj.getEstado());
            stmt.setString(10, cpj.getCidade());
            stmt.setString(11, cpj.getBairro());
            stmt.setString(12, cpj.getNumero());
            stmt.setString(13, oldCnpj);

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }

    }

    public void remover(ClientePessoaJuridica cpj) throws Exception {
        Connection conn = conectarPrepareStatment();
        String sql = "Delete from CLIENTE_JURIDICO where cnpj = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, cpj.getCnpj());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }
    }

    public ArrayList<ClientePessoaJuridica> listarPessoaJuridica() throws Exception {
        
        ArrayList<ClientePessoaJuridica> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT cnpj, nomeFantasia, razaoSocial, email,"
                + " telefonePrinc, telefoneOpc, cep, numero ";
        sql += "FROM CLIENTE_JURIDICO order by nomeFantasia ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClientePessoaJuridica cpj = new ClientePessoaJuridica();

            cpj.setNomeFantasia(rs.getString("nomeFantasia"));
            cpj.setCnpj(rs.getString("cnpj"));
            cpj.setRazaoSocial(rs.getString("razaoSocial"));
            cpj.setEmail(rs.getString("email"));
            cpj.setTelefonePrinc(rs.getString("telefonePrinc"));
            cpj.setTelefoneOpc(rs.getString("telefoneOpc"));
            cpj.setCep(rs.getString("cep"));
            cpj.setNumero((rs.getString("numero")));

            retorno.add(cpj);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

}
