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
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClientePessoaJuridicaDao extends ConnectionFactory{
    
    public void cadastrar(ClientePessoaJuridica c) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE_JURIDICO (cnpj, nomeFantasia,"
                + " razaoSocial, email, telefonePrinc, telefoneOpc, cep,"
                + " logradouro, estado, cidade, bairro, numero)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
         stmt.setString(1, c.getCnpf());
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
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }
      
    
    public void atualizar(ClientePessoaJuridica a) throws Exception {
    }
         
    public void remover(ClientePessoaJuridica filtro) throws Exception {
    }     
         
    public ArrayList<ClientePessoaJuridica> listar(ClientePessoaJuridica a) throws Exception {
        ArrayList<ClientePessoaJuridica> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT * ";
        sql += "FROM CLIENTE_JURIDICO order by nomeFantasia ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClientePessoaJuridica pessoaJuridica = new ClientePessoaJuridica();
           // al.setMatricula(rs.getInt("matricula"));
           // al.setNome(rs.getString("nome"));
            retorno.add(pessoaJuridica);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
}
