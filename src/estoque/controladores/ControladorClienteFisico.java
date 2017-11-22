/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.ClienteDao;
import estoque.dao.ClienteFisicoDao;
import estoque.modelos.ClienteFisico;
import estoque.modelos.ClientePessoaJuridica;
import java.util.ArrayList;

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
   

    public void cadastrar(ClienteFisico c, ClientePessoaJuridica pj) throws Exception {

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
        if ("".equals(c.getNome().trim())) {
            throw new Exception("Informe o Nome do Cliente");
        }

        if (c.getCpf().replace(" ", "").length() < 14) {
            throw new Exception("Informe o Cpf do cliente com 14 dígitos");
        }

        if ("".equals(c.getEmail().trim())) {
            throw new Exception("Informe o e-mail do Cliente");
        }

        if (c.getTelefonePrinc().replace(" ", "").length() < 11) {
            throw new Exception("Informe o Telefone Principal do cliente com "
                    + "DDD e 9 números");
        }

        if (c.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }

        if ("".equals(c.getNumero())) {
            throw new Exception("Informe o número do Endereço do Cliente");
        }

        ClienteDao dao = new ClienteDao();
        try {
            dao.cadastrar(c, pj);
        } catch (Exception ex) {
           ex.getMessage();
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
