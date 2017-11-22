/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Cliente;
import estoque.modelos.ClienteFisico;
import estoque.modelos.ClienteInterface;
import estoque.modelos.ClientePessoaJuridica;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public class ClienteDao implements ClienteInterface {
    
    private ConnectionFactory conexao;

    @Override
    public void cadastrarFisico(ClienteFisico c) throws Exception {
        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE (cpf, nome, email, telefonePrinc, telefoneOpc,"
                + " cep, logradouro, estado, cidade, bairro, numero, tipo)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

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
        stmt.setString(12, "0");
        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        conexao.desconectar();
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
        ArrayList<ClienteFisico> retorno = new ArrayList<>();

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
        desconectar();
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
