/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClienteFisicoDao;
import estoque.modelos.ClienteFisico;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EWalker
 */
public class ControladorClienteFisico {

    public boolean verificarCpf(String cpf) throws Exception {

        boolean verificador = false;

        ClienteFisicoDao dao = new ClienteFisicoDao();
        try {
            verificador = dao.verificarCpf(cpf);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return verificador;
    }

    public void cadastrar(ClienteFisico c) throws Exception {

      /*  boolean verificar = false;

        ControladorClienteFisico ccf = new ControladorClienteFisico();
        try {
            verificar = ccf.verificarCpf(c.getCpf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Cliente já Cadastrado, insira outro Cpf.");
        }

        if (verificar) {
            JOptionPane.showMessageDialog(rootPane, "Cliente já existente,"
                    + " Digite outro Cpf");
        } */
      
        if (c.getCpf().replace(" ", "").length() < 14) {
            throw new Exception("Informe o Cpf do cliente com 14 dígitos");
        }
        if ("".equals(c.getNome().trim())) {
            throw new Exception("Informe o Nome do Cliente");
        }
        
        if("".equals(c.getEmail().trim())){
            throw new Exception("Informe o e-mail do Cliente");
        }
        
        
       
        ClienteFisicoDao dao = new ClienteFisicoDao();
        try {
            dao.cadastrar(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizar(ClienteFisico cf, String oldCpf) {

        ClienteFisicoDao dao = new ClienteFisicoDao();
        try {
            dao.atualizar(cf, oldCpf);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    public void remover(ClienteFisico cf) throws Exception {

        ClienteFisicoDao dao = new ClienteFisicoDao();

        try {
            dao.remover(cf);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    public ArrayList<ClienteFisico> listar() throws Exception {

        ClienteFisicoDao dao = new ClienteFisicoDao();
        return dao.listar();

    }

}
