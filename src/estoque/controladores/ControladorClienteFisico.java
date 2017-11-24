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
import estoque.modelos.interfaces.ClienteFisicoInterface;
import java.util.ArrayList;

/**
 *
 * @author EWalker
 */
public class ControladorClienteFisico implements ClienteFisicoInterface {

    private ClienteDao dao;
    
    public ControladorClienteFisico(){
        this.dao = new ClienteDao();
    }
    
    @Override
    public boolean verificarCpf(String cpf) throws Exception {

        boolean verificador = false;

        ClienteDao dao = new ClienteDao();
        try {
            verificador = dao.verificarCpf(cpf);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return verificador;
    }

    @Override
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
        
        if ((c.getTelefoneOpc().replace(" ", "").length() < 10 && c.getTelefoneOpc().length() != 0)
                || (c.getTelefoneOpc().replace(" ", "").length() > 11 && c.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (c.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }

        if ("".equals(c.getNumero())) {
            throw new Exception("Informe o número do Endereço do Cliente");
        }
        
        if(dao.verificarCpf(c.getCpf())){
            throw new Exception("CPF do CLIENTE FÍSICO já cadastrado");
        }

        ClienteDao dao = new ClienteDao();
        try {
            dao.cadastrar(c, pj);
        } catch (Exception ex) {
           ex.getMessage();
        }
    }

    @Override
    public void atualizar(ClienteFisico cf, ClientePessoaJuridica pj, String oldCpf, String oldCnpj) throws Exception {

        if ("".equals(cf.getNome().trim())) {
            throw new Exception("Informe o Nome do Cliente");
        }

        if (cf.getCpf().replace(" ", "").length() < 14) {
            throw new Exception("Informe o Cpf do cliente com 14 dígitos");
        }

        if ("".equals(cf.getEmail().trim())) {
            throw new Exception("Informe o e-mail do Cliente");
        }

        if (cf.getTelefonePrinc().replace(" ", "").length() < 11) {
            throw new Exception("Informe o Telefone Principal do cliente com "
                    + "DDD e 9 números");
        }
        
        if ((cf.getTelefoneOpc().replace(" ", "").length() < 10 && cf.getTelefoneOpc().length() != 0)
                || (cf.getTelefoneOpc().replace(" ", "").length() > 11 && cf.getTelefoneOpc().length() != 0)) {
            throw new Exception("Informe o Telefone Opcional do cliente com DDD, máximo 11 dígitos");
        }

        if (cf.getCep().replace(" ", "").length() < 8) {
            throw new Exception("Informe o CEP do cliente com 8 dígitos");
        }

        if ("".equals(cf.getNumero())) {
            throw new Exception("Informe o número do Endereço do Cliente");
        }
        
        ClienteDao dao = new ClienteDao();
        try {
            dao.atualizar(cf, pj, oldCpf, oldCpf);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    @Override
    public void remover(ClienteFisico pf, ClientePessoaJuridica pj) throws Exception {

        ClienteDao dao = new ClienteDao();

        try {
            dao.remover(pf, pj);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    @Override
    public ArrayList<ClienteFisico> listar() throws Exception {

        ClienteDao dao = new ClienteDao();
        return dao.listarFisico();

    }

}
