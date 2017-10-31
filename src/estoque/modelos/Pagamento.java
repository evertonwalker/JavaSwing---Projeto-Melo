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
public class Pagamento {
    
    private String numeroPagamento;
    private String descricaoPagamento;
    private float valorPagamento;
    
    private OrdemServico ordemServico;

    /**
     * @return the numeroPagamento
     */
    public String getNumeroPagamento() {
        return numeroPagamento;
    }

    /**
     * @param numeroPagamento the numeroPagamento to set
     */
    public void setNumeroPagamento(String numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    /**
     * @return the descricaoPagamento
     */
    public String getDescricaoPagamento() {
        return descricaoPagamento;
    }

    /**
     * @param descricaoPagamento the descricaoPagamento to set
     */
    public void setDescricaoPagamento(String descricaoPagamento) {
        this.descricaoPagamento = descricaoPagamento;
    }

    /**
     * @return the valorPagamento
     */
    public float getValorPagamento() {
        return valorPagamento;
    }

    /**
     * @param valorPagamento the valorPagamento to set
     */
    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    /**
     * @return the ordemServico
     */
    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    /**
     * @param ordemServico the ordemServico to set
     */
    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    
}

