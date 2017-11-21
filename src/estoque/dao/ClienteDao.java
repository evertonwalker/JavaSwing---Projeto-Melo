/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Cliente;
import estoque.modelos.ClienteInterface;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public class ClienteDao implements ClienteInterface {
    
    private ConnectionFactory conexao;

    @Override
    public void cadastrarFisico(Cliente c) throws Exception {
        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO CLIENTE (cpf, nome, cnpj, razaoSocial, nomeFantasia,"
                + " email, telefonePrinc, telefoneOpc, cep, logradouro, estado,"
                + " cidade, bairro, numero, tipo)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,0)";

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

    @Override
    public void cadastrarJuridico(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
