/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.dao;

import estoque.modelos.Fornecedor;
import estoque.modelos.Produto;
import estoque.modelos.interfaces.ProdutoInterFace;
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
                + "estoqueMinimo, aplicacao) ";
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

        ArrayList<Produto> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conexao.conectarPrepareStatment();
        //instrução sql correspondente a seleção dos alunos
        String sql = "SELECT *  FROM PRODUTO order by referencia";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();

                Fornecedor f = buscarFornecedor(rs.getString("Fornecedor_cnpj"));
                p.setId(rs.getInt("id"));
                p.setReferencia(rs.getString("referencia"));
                p.setFornecedor(f);
                p.setDescricao(rs.getString("descricao"));
                p.setUnidadeVolume(rs.getString("unidadeVolume"));
                p.setPrecoCusto(rs.getFloat("precoCusto"));
                p.setPrecoVenda(rs.getFloat("precoVenda"));
                p.setMargemLucro(rs.getFloat("margemLucro"));
                p.setEstoqueAtual(rs.getInt("estoqueAtual"));
                p.setEstoqueMinimo(rs.getInt("estoqueMinimo"));
                p.setAplicacao(rs.getString("aplicacao"));

                retorno.add(p);
            }

            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException e) {
            e.getMessage();
        }
        return retorno;
    }

    public Fornecedor buscarFornecedor(String cnpj) throws SQLException {

        Fornecedor f = new Fornecedor();

        try {

            Connection conn = conexao.conectarPrepareStatment();

            String sqlFornecedor = "select * from fornecedor where cnpj  = ?";

            PreparedStatement stmt = conn.prepareStatement(sqlFornecedor);

            stmt.setString(1, cnpj);

            //executando a instrução sql
            ResultSet rs = stmt.executeQuery();

            rs.next();

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

            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }

        return f;
    }

    @Override
    public void atualizar(Produto p) throws Exception {

        Connection conn = conexao.conectarPrepareStatment();

        String sql = "Update PRODUTO  set referencia = ?, Fornecedor_cnpj = ?, descricao = ?,"
                + " unidadeVolume = ?, precoCusto = ?, precoVenda = ?, margemLucro= ?,"
                + "estoqueAtual = ?, estoqueMinimo= ?, aplicacao= ? where id = ?";

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
            stmt.setInt(11, p.getId());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }

    }

    @Override
    public void remover(Produto p) throws Exception {

        Connection conn = conexao.conectarPrepareStatment();
        String sql = "Delete from PRODUTO where id = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            // preenche os valores
            stmt.setInt(1, p.getId());

            stmt.execute();
            stmt.close();
            //fechando a conexão com o banco de dados
            conexao.desconectar();
        } catch (SQLException ex) {
            ex.getMessage();

        }
    }

}
