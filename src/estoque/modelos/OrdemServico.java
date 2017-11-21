/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos;

import java.sql.Date;

/**
 *
 * @author FHC
 */
public class OrdemServico {
    
    private int numero;
    private String descricao;
    private Date date;
    
    private VeiculoPessoaFisica veiculo;
    private ClienteFisico clienteFisico;
    private ClientePessoaJuridica clientePessoaJuridica;
    private Mecanico mecanico;
    private Pagamento pagamento;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the veiculo
     */
    public VeiculoPessoaFisica getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(VeiculoPessoaFisica veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the clienteFisico
     */
    public ClienteFisico getClienteFisico() {
        return clienteFisico;
    }

    /**
     * @param clienteFisico the clienteFisico to set
     */
    public void setClienteFisico(ClienteFisico clienteFisico) {
        this.clienteFisico = clienteFisico;
    }

    /**
     * @return the clientePessoaJuridica
     */
    public ClientePessoaJuridica getClientePessoaJuridica() {
        return clientePessoaJuridica;
    }

    /**
     * @param clientePessoaJuridica the clientePessoaJuridica to set
     */
    public void setClientePessoaJuridica(ClientePessoaJuridica clientePessoaJuridica) {
        this.clientePessoaJuridica = clientePessoaJuridica;
    }

    /**
     * @return the mecanico
     */
    public Mecanico getMecanico() {
        return mecanico;
    }

    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    /**
     * @return the pagamento
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }   
        
}
