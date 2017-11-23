/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.modelos;

/**
 *
 * @author EWalker
 */
public class Produto {

    private Fornecedor fornecedor;
    private String referencia;
    private String descricao;
    private String unidadeVolume;
    private float precoCusto;
    private float margemLucro;
    private int estoqueAtual;
    private int estoqueMinimo;
    private String aplicacao;

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
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
     * @return the unidadeVolume
     */
    public String getUnidadeVolume() {
        return unidadeVolume;
    }

    /**
     * @param unidadeVolume the unidadeVolume to set
     */
    public void setUnidadeVolume(String unidadeVolume) {
        this.unidadeVolume = unidadeVolume;
    }

    /**
     * @return the precoCusto
     */
    public float getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the margemLucro
     */
    public float getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    /**
     * @return the estoqueAtual
     */
    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    /**
     * @param estoqueAtual the estoqueAtual to set
     */
    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    /**
     * @return the estoqueMinimo
     */
    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    /**
     * @param estoqueMinimo the estoqueMinimo to set
     */
    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    /**
     * @return the aplicacao
     */
    public String getAplicacao() {
        return aplicacao;
    }

    /**
     * @param aplicacao the aplicacao to set
     */
    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

}
