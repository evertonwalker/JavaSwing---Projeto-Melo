/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos;

import java.util.ArrayList;

/**
 *
 * @author FHC
 */
public class Fabricante {
    
    private String idFabricante;
    private String nomeFabricante;
    
    private ArrayList <Veiculo> veiculo;
    
    public Fabricante (){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
    }

    /**
     * @return the idFabricante
     */
    public String getIdFabricante() {
        return idFabricante;
    }

    /**
     * @param idFabricante the idFabricante to set
     */
    public void setIdFabricante(String idFabricante) {
        this.idFabricante = idFabricante;
    }

    /**
     * @return the nomeFabricante
     */
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    /**
     * @param nomeFabricante the nomeFabricante to set
     */
    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    /**
     * @return the veiculo
     */
    public ArrayList <Veiculo> getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(ArrayList <Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
