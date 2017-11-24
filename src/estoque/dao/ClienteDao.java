/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Cliente;
import estoque.modelos.ClienteFisico;
import estoque.modelos.interfaces.ClienteInterface;
import estoque.modelos.ClientePessoaJuridica;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author FHC
 */
public class ClienteDao implements ClienteInterface {

    private ConnectionFactory conexao;

    public ClienteDao() {
        this.conexao = new ConnectionFactory();
    }

    @Override
    public void cadastrar(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception {

        if (pf.getTipo() == 0) {
            //abrindo a conexão para cadastrar Cliente Físico
            Connection conn = conexao.conectarPrepareStatment();
            //instrução sql correspondente a inserção do aluno
            String sql = "INSERT INTO CLIENTE (cpf, nome, email, telefonePrinc, telefoneOpc,"
                    + " cep, logradouro, estado, cidade, bairro, numero, tipo) ";
            sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, pf.getCpf());
            stmt.setString(2, pf.getNome());
            stmt.setString(3, pf.getEmail());
            stmt.setString(4, pf.getTelefonePrinc());
            stmt.setString(5, pf.getTelefoneOpc());
            stmt.setString(6, pf.getCep());
            stmt.setString(7, pf.getLogradouro());
            stmt.setString(8, pf.getEstado());
            stmt.setString(9, pf.getCidade());
            stmt.setString(10, pf.getBairro());
            stmt.setString(11, pf.getNumero());
            stmt.setInt(12, pf.getTipo());
            // executa
            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();

        }

        if (pj.getTipo() == 1) {
            //abrindo a conexão para cadastrar Cliente Pessoa Jurídica
            Connection conn = conexao.conectarPrepareStatment();
            //instrução sql correspondente a inserção do aluno
            String sql = "INSERT INTO CLIENTE (cnpj, nomeFantasia, razaoSocial,"
                    + " email, telefonePrinc, telefoneOpc, cep, logradouro, estado,"
                    + " cidade, bairro, numero, tipo) ";
            sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, pj.getCnpj());
            stmt.setString(2, pj.getNomeFantasia());
            stmt.setString(3, pj.getRazaoSocial());
            stmt.setString(4, pj.getEmail());
            stmt.setString(5, pj.getTelefonePrinc());
            stmt.setString(6, pj.getTelefoneOpc());
            stmt.setString(7, pj.getCep());
            stmt.setString(8, pj.getLogradouro());
            stmt.setString(9, pj.getEstado());
            stmt.setString(10, pj.getCidade());
            stmt.setString(11, pj.getBairro());
            stmt.setString(12, pj.getNumero());
            stmt.setInt(13, pj.getTipo());
            // executa
            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        }
    }

    @Override
    public void atualizar(ClienteFisico pf, ClientePessoaJuridica pj, String oldCpf, String oldCnpj) throws Exception {

        if (pf.getTipo() == 0) {
            Connection conn = conexao.conectarPrepareStatment();

            String sql = "Update CLIENTE  set cpf = ?, nome = ?, email = ?,"
                    + "telefonePrinc = ?, telefoneOpc = ?, cep = ?,"
                    + "logradouro = ?, estado = ?, cidade = ?, bairro = ?,"
                    + "numero = ? where cpf = ?";

            try {

                PreparedStatement stmt = conn.prepareStatement(sql);
                // preenche os valores
                stmt.setString(1, pf.getCpf());
                stmt.setString(2, pf.getNome());
                stmt.setString(3, pf.getEmail());
                stmt.setString(4, pf.getTelefonePrinc());
                stmt.setString(5, pf.getTelefoneOpc());
                stmt.setString(6, pf.getCep());
                stmt.setString(7, pf.getLogradouro());
                stmt.setString(8, pf.getEstado());
                stmt.setString(9, pf.getCidade());
                stmt.setString(10, pf.getBairro());
                stmt.setString(11, pf.getNumero());
                stmt.setString(12, oldCpf);

                stmt.execute();
                stmt.close();
                //fechando a conexão com o banco de dados
                conexao.desconectar();
            } catch (SQLException ex) {
                ex.getMessage();

            }
        }

        if (pj.getTipo() == 1) {
            Connection conn = conexao.conectarPrepareStatment();

            String sql = "Update CLIENTE set cnpj = ?, nomeFantasia = ?, razaoSocial = ?,"
                    + " email = ?, telefonePrinc = ?, telefoneOpc = ?, cep = ?,"
                    + "logradouro = ?, estado = ?, cidade = ?, bairro = ?,"
                    + "numero = ? where cnpj = ?";

            try {

                PreparedStatement stmt = conn.prepareStatement(sql);
                // preenche os valores
                stmt.setString(1, pj.getCnpj());
                stmt.setString(2, pj.getNomeFantasia());
                stmt.setString(3, pj.getRazaoSocial());
                stmt.setString(4, pj.getEmail());
                stmt.setString(5, pj.getTelefonePrinc());
                stmt.setString(6, pj.getTelefoneOpc());
                stmt.setString(7, pj.getCep());
                stmt.setString(8, pj.getLogradouro());
                stmt.setString(9, pj.getEstado());
                stmt.setString(10, pj.getCidade());
                stmt.setString(11, pj.getBairro());
                stmt.setString(12, pj.getNumero());
                stmt.setString(13, oldCnpj);

                stmt.execute();
                stmt.close();
                //fechando a conexão com o banco de dados
                conexao.desconectar();
            } catch (SQLException ex) {
                ex.getMessage();

            }
        }
    }

    @Override
    public void remover(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception {

        if (pj.getCnpj() == null) {
            Connection conn = conexao.conectarPrepareStatment();
            String sql = "Delete from CLIENTE where cpf = ?";

            try {

                PreparedStatement stmt = conn.prepareStatement(sql);
                // preenche os valores
                stmt.setString(1, pf.getCpf());

                stmt.execute();
                stmt.close();
                //fechando a conexão com o banco de dados
                conexao.desconectar();
            } catch (SQLException ex) {
                ex.getMessage();

            }
        }

        if (pf.getCpf() == null) {
            Connection conn = conexao.conectarPrepareStatment();
            String sql = "Delete from CLIENTE where cnpj = ?";

            try {

                PreparedStatement stmt = conn.prepareStatement(sql);
                // preenche os valores
                stmt.setString(1, pj.getCnpj());

                stmt.execute();
                stmt.close();
                //fechando a conexão com o banco de dados
                conexao.desconectar();
            } catch (SQLException ex) {
                ex.getMessage();

            }
        }
    }

    @Override
    public ArrayList<ClienteFisico> listarFisico() throws Exception {

        ArrayList<ClienteFisico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT nome, cpf, email, telefonePrinc, telefoneOpc, cep,"
                + "numero FROM CLIENTE where tipo = 0 order by nome";
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
        conexao.desconectar();
        return retorno;
    }

    @Override
    public ArrayList<ClientePessoaJuridica> listarPessoaJuridica() throws Exception {
        ArrayList<ClientePessoaJuridica> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT cnpj, nomeFantasia, razaoSocial, email,"
                + " telefonePrinc, telefoneOpc, cep, numero ";
        sql += "FROM CLIENTE  where tipo = 1 order by nomeFantasia";
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
        conexao.desconectar();
        return retorno;
    }

    @Override
    public boolean verificarCnpj(String cnpj) throws Exception {
        
        boolean verificador = false;

        ArrayList<ClientePessoaJuridica> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT *"
                + " FROM CLIENTE where cnpj = ?";
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cnpj);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ClientePessoaJuridica cpj = new ClientePessoaJuridica();
                retorno.add(cpj);
            }

            if (!retorno.isEmpty()) {
                verificador = true;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return verificador;
    }

    @Override
    public boolean verificarCpf(String cpf) throws Exception {
        
        boolean verificador = false;

        ArrayList<ClienteFisico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT *"
                + " FROM CLIENTE where cpf = ?";
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cpf);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ClienteFisico cf = new ClienteFisico();
                retorno.add(cf);
            }

            if (!retorno.isEmpty()) {
                verificador = true;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return verificador;
    }

}
