/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Mecanico;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public class MecanicoDao extends ConnectionFactory {

    public void cadastrar(Mecanico mec) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO MECANICO (cpf, nome)";
        sql += "VALUES (?,?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        // preenche os valores
        stmt.setString(1, mec.getCpf());
        stmt.setString(2, mec.getNome());

        // executa
        stmt.execute();
        stmt.close();
        //fechando a conexão com o banco de dados
        desconectar();
    }

    public void atualizar(Mecanico mec, String oldCpf) throws Exception {

        Connection conn = conectarPrepareStatment();

        String sql = "Update MECANICO set cpf = ?, nome = ? where cpf = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, mec.getCpf());
            stmt.setString(2, mec.getNome());
            stmt.setString(3, oldCpf);

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }

    }
    
    public void remover(Mecanico mec) throws Exception {

        Connection conn = conectarPrepareStatment();
        String sql = "Delete from MECANICO where cpf = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, mec.getCpf());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }

    }
    
    public ArrayList<Mecanico> filtragem(String filtro) throws Exception {

        ArrayList<Mecanico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT nome, cpf FROM MECANICO where nome like ? order by nome";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, "%"+filtro+"%");
        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mecanico mec = new Mecanico();

            mec.setNome(rs.getString("nome"));
            mec.setCpf(rs.getString("cpf"));
            
            retorno.add(mec);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
    public ArrayList<Mecanico> listarMecanico() throws Exception {

        ArrayList<Mecanico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT nome, cpf FROM MECANICO order by nome ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mecanico mec = new Mecanico();

            mec.setNome(rs.getString("nome"));
            mec.setCpf(rs.getString("cpf"));

            retorno.add(mec);
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
    public boolean verificarCpf(String cpf) throws Exception {

        boolean verificador = false;

        ArrayList<Mecanico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT * FROM MECANICO where cpf = ?";
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cpf);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Mecanico mec = new Mecanico();
                retorno.add(mec);
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
