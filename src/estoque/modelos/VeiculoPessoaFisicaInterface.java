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
public interface VeiculoPessoaFisicaInterface {
    
    public void cadastrar(VeiculoPessoaFisica vpf) throws Exception;
    
    public void atualizar(VeiculoPessoaFisica vpf, String oldPlaca) throws Exception;
    
    public void remover(VeiculoPessoaFisica vpf)throws Exception;
    
    public ArrayList<VeiculoPessoaFisica> listarVeiculoPessoaFisica() throws Exception;
    
    public boolean verificarPlaca(String placa) throws Exception;
    
    public ArrayList<VeiculoPessoaFisica> filtragem(String filtro) throws Exception;
}
