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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author FHC
 */
public class ClienteDao implements ClienteInterface {

    private ConnectionFactory conexao;

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

        } if (pj.getTipo() == 1){
            //abrindo a conexão para cadastrar Cliente Pessoa Jurídica
            Connection conn = conexao.conectarPrepareStatment();
            //instrução sql correspondente a inserção do aluno
            String sql = "INSERT INTO CLIENTE (cnpj, nomeFantasia, razaoSocial,"
                    + " email, telefonePrinc, telefoneOpc, cep, logradouro, estado,"
                    + " cidade, bairro, numero, tipo) ";
            sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

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
            stmt.setString(13, "1");
            // executa
            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        }
    }

    @Override
    public void cadastrarJuridico(ClientePessoaJuridica c) throws Exception {
        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE (cnpj, nomeFantasia, razaoSocial,"
                + " email, telefonePrinc, telefoneOpc, cep, logradouro, estado,"
                + " cidade, bairro, numero, tipo)";
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
        stmt.setString(13, "0");
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        conexao.desconectar();
    }

    @Override
    public void atualizar(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Cliente filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> listarCliente() throws Exception {
        ArrayList<Cliente> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
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
        conexao.desconectar();
        return retorno;
    }

    @Override
    public boolean verificarCnpj(String cnpj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarCpf(String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
