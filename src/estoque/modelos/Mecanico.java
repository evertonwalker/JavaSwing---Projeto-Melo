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
public class Mecanico extends ClienteFisico {
    
    private ArrayList <OrdemServico> ordemServico;
    
    public Mecanico (){
        ArrayList<OrdemServico> ordemServico = new ArrayList<>();

}

    /**
     * @return the ordemServico
     */
    public ArrayList <OrdemServico> getOrdemServico() {
        return ordemServico;
    }

    /**
     * @param ordemServico the ordemServico to set
     */
    public void setOrdemServico(ArrayList <OrdemServico> ordemServico) {
        this.ordemServico = ordemServico;
    }


} 