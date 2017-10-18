/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos;

/**
 *
 * @author FHC
 */
public class ClientePessoaJuridica extends Cliente {
    
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

    /**
     * @return the cnpf
     */
    public String getCnpf() {
        return cnpj;
    }

    /**
     * @param cnpf the cnpf to set
     */
    public void setCnpf(String cnpf) {
        this.cnpj = cnpf;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    
    
}
