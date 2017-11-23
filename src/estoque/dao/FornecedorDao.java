/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Fornecedor;
import estoque.modelos.interfaces.FornecedorInterface;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class FornecedorDao implements FornecedorInterface {

    private ConnectionFactory conexao;

    public FornecedorDao() {
        this.conexao = new ConnectionFactory();
    }

    @Override
    public void cadastrarFornecedor(Fornecedor f) throws Exception {
        //abrindo a conexão
        Connection conn = this.conexao.conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO FORNECEDOR (cnpj, nomeFantasia, razaoSocial,"
                + " nomeResponsaveis, cep, logradouro, estado, cidade, bairro, "
                + " email, telefonePrinc, telefoneOpc) ";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, f.getCnpj());
            stmt.setString(2, f.getNomeFantasia());
            stmt.setString(3, f.getRazaoSocial());
            stmt.setString(4, f.getNomeResponsaveis());
            stmt.setString(5, f.getCep());
            stmt.setString(6, f.getLogradouro());
            stmt.setString(7, f.getEstado());
            stmt.setString(8, f.getCidade());
            stmt.setString(9, f.getBairro());
            stmt.setString(10, f.getEmail());
            stmt.setString(11, f.getTelefonePrincipal());
            stmt.setString(12, f.getTelefoneOpcional());
            // executa
            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public ArrayList<Fornecedor> listar() throws Exception {

        ArrayList<Fornecedor> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT cnpj, nomeFantasia, razaoSocial,"
                + " nomeResponsaveis, cep, logradouro, estado, cidade, bairro, "
                + " email, telefonePrinc, telefoneOpc  FROM FORNECEDOR order by nomeFantasia";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor f = new Fornecedor();

                f.setCnpj(rs.getString("cnpj"));
                f.setNomeFantasia(rs.getString("nomeFantasia"));
                f.setRazaoSocial(rs.getString("razaoSocial"));
                f.setNomeResponsaveis(rs.getString("nomeResponsaveis"));
                f.setCep(rs.getString("cep"));
                f.setLogradouro(rs.getString("logradouro"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setBairro(rs.getString("bairro"));
                f.setEmail(rs.getString("email"));
                f.setTelefonePrincipal(rs.getString("telefonePrinc"));
                f.setTelefoneOpcional(rs.getString("telefoneOpc"));

                retorno.add(f);
            }

            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (Exception e) {
            e.getMessage();
        }
        return retorno;
    }

    @Override
    public void atualizar(Fornecedor f, String oldCnpj) throws Exception {
       
        Connection conn = conexao.conectarPrepareStatment();

        String sql = "Update FORNECEDOR  set cnpj = ?, nomeFantasia = ?, razaoSocial = ?,"
                + " email = ?, telefonePrinc = ?, telefoneOpc = ?, cep = ?,"
                + "logradouro = ?, estado = ?, cidade = ?, bairro = ?,"
                + "nomeResponsaveis = ? where cnpj = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, f.getCnpj());
            stmt.setString(2, f.getNomeFantasia());
            stmt.setString(3, f.getRazaoSocial());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getTelefonePrincipal());
            stmt.setString(6, f.getTelefoneOpcional());
            stmt.setString(7, f.getCep());
            stmt.setString(8, f.getLogradouro());
            stmt.setString(9, f.getEstado());
            stmt.setString(10, f.getCidade());
            stmt.setString(11, f.getBairro());
            stmt.setString(12, f.getNomeResponsaveis());
            stmt.setString(13, oldCnpj);

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }
    }

    @Override
    public void remover(Fornecedor f) throws Exception {
      
         Connection conn = conexao.conectarPrepareStatment();
        String sql = "Delete from FORNECEDOR where cnpj = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, f.getCnpj());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        
        
    }

}
