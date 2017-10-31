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
public abstract class Cliente {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefonePrinc;
    private String telefoneOpc;
    private String email;
    
    private ArrayList <Veiculo> veiculo;
    
    public Cliente (){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
    }

    
    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
      /**
     * @return the telefonePrinc
     */
    public String getTelefonePrinc() {
        return telefonePrinc;
    }

    /**
     * @param telefonePrinc the telefonePrinc to set
     */
    public void setTelefonePrinc(String telefonePrinc) {
        this.telefonePrinc = telefonePrinc;
    }

    /**
     * @return the telefoneOpc
     */
    public String getTelefoneOpc() {
        return telefoneOpc;
    }

    /**
     * @param telefoneOpc the telefoneOpc to set
     */
    public void setTelefoneOpc(String telefoneOpc) {
        this.telefoneOpc = telefoneOpc;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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


