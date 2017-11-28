/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.controladores;

import estoque.dao.MecanicoDao;
import estoque.modelos.Mecanico;
import estoque.modelos.interfaces.MecanicoInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FHC
 */
public class ControladorMecanico implements MecanicoInterface {
    
    private MecanicoDao dao;
    
    public ControladorMecanico(){
        this.dao = new MecanicoDao();
    }

    @Override
    public void cadastrar(Mecanico mec) throws Exception {

        if (mec.getNome().isEmpty()) {
            throw new Exception("Informe o Nome do Mecânico");
        }
        if ("".equals(mec.getNome().trim())) {
            throw new Exception("Informar o nome do Mecânico");
        }
        if (mec.getCpf().replace(" ", "").length() < 11) {
            throw new Exception("O Cpf deverá conter 11 dígitos");
        }

        if (dao.verificarCpf(mec.getCpf())) {
            throw new Exception("Cpf do Mecânico já cadastrado");
        }

        MecanicoDao dao = new MecanicoDao();
        try {
            dao.cadastrar(mec);
        } catch (Exception ex) {
            Logger.getLogger(ControladorClienteFisico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(Mecanico mec, String oldCpf) throws Exception {

        if (mec.getNome().isEmpty()) {
            throw new Exception("Informe o Nome do Mecânico");
        }
        if ("".equals(mec.getNome().trim())) {
            throw new Exception("Informar o nome do Mecânico");
        }
        if (mec.getCpf().replace(" ", "").length() < 11) {
            throw new Exception("O Cpf deverá conter 11 dígitos");
        }

        MecanicoDao dao = new MecanicoDao();
        try {
            dao.atualizar(mec, oldCpf);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public void remover(Mecanico mec) throws Exception {

        MecanicoDao dao = new MecanicoDao();

        try {
            dao.remover(mec);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public ArrayList<Mecanico> listarMecanico() throws Exception {

        MecanicoDao dao = new MecanicoDao();
        return dao.listarMecanico();

    }

    @Override
    public ArrayList<Mecanico> filtragem(String filtro) throws Exception {

        MecanicoDao dao = new MecanicoDao();
        return dao.filtragem(filtro);
    }

}
