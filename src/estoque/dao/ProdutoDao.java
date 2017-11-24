/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Produto;
import estoque.modelos.interfaces.ProdutoInterFace;
import estoque.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class ProdutoDao implements ProdutoInterFace {

    private ConnectionFactory conexao;

    public ProdutoDao() {
        this.conexao = new ConnectionFactory();
    }

    @Override
    public void cadastrarProduto(Produto p) throws Exception {

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a inserção do aluno
        String sql = "INSERT INTO PRODUTO (referencia, Fornecedor_cnpj,"
                + " descricao, unidadeVolume, precoCusto, precoVenda, margemLucro, estoqueAtual,"
                + "estoqueMinimo, aplicacao)";
        sql += "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setString(1, p.getReferencia());
            stmt.setString(2, p.getFornecedor().getCnpj());
            stmt.setString(3, p.getDescricao());
            stmt.setString(4, p.getUnidadeVolume());
            stmt.setFloat(5, p.getPrecoCusto());
            stmt.setFloat(6, p.getPrecoVenda());
            stmt.setFloat(7, p.getMargemLucro());
            stmt.setInt(8, p.getEstoqueAtual());
            stmt.setInt(9, p.getEstoqueMinimo());
            stmt.setString(10, p.getAplicacao());

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
    public ArrayList<Produto> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Produto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Produto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
