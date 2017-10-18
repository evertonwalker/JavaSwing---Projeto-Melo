/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EWalker
 */
public class ConnectionFactory {

    private Statement stmt;
    private Connection conn;

    public Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarSqlServer();
    }
    public Connection conectarPrepareStatment() throws ClassNotFoundException, SQLException {
        this.conectarSqlServer();
        return conn;
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String local = "localhost";
        String bancoDeDados = "controle";
        String url = "jdbc:sqlserver://" + local + ":1433;DatabaseName=" + bancoDeDados;
        String usuario = "root";
        String senha = "1234";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
    }
    
}
