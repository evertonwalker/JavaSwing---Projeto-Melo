/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.telas.Produtos;

import estoque.controladores.ControladorProduto;
import estoque.telas.telasFornecedor.*;
import estoque.modelos.Fornecedor;
import estoque.modelos.Produto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author FHC
 */
public class AlterarProdutoForm extends javax.swing.JFrame {

    Produto p;
    ProdutoListagem formPai;
    Fornecedor f;
    private float custoPeca;
    private float margemLucro;
    private float precoVenda;
    private float valorLucro;
    private int novaQuantidade;

    public AlterarProdutoForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void receberFornecedor(Fornecedor f) {
        this.f = f;
        this.fornecedorTextField.setText(f.getNomeFantasia());
    }

    public AlterarProdutoForm(Produto p, ProdutoListagem formPai) {
        initComponents();
        this.p = p;
        this.f = p.getFornecedor();
        this.formPai = formPai;
        this.setLocationRelativeTo(null);
        this.carregarCampos();
    }

    private void carregarCampos() {
        try {
            this.referenciaTextField.setText(p.getReferencia());
            this.descricaoTextField.setText(p.getDescricao());
            this.fornecedorTextField.setText(p.getFornecedor().getNomeFantasia());

            if (p.getUnidadeVolume().equals("Caixa")) {
                this.jComboBox1.setSelectedIndex(0);
            } else {
                this.jComboBox1.setSelectedIndex(1);
            }

            this.margemLucroTextField.setText("" + p.getMargemLucro());
            precoVendaTextField.setText("" + p.getPrecoVenda());
            this.precoCustoTextField.setText("" + p.getPrecoCusto());
            this.quantidadeAtual.setText("" + p.getEstoqueAtual());
            this.estoqueMinimoTextField.setText("" + p.getEstoqueMinimo());
            this.aplicacaoTextfield.setText(p.getAplicacao());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void limparCampos() {

        this.referenciaTextField.setText("");
        this.descricaoTextField.setText("");
        this.fornecedorTextField.setText("");
        this.jComboBox1.setSelectedIndex(0);
        this.margemLucroTextField.setText("");
        precoVendaTextField.setText("");
        this.precoCustoTextField.setText("");
        this.quantidadeAtual.setText("");
        this.estoqueMinimoTextField.setText("");
        this.aplicacaoTextfield.setText("");
        this.adicionarQuantidade.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alteracaoEstoque = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomeFantasiaAlterarPJLabel = new javax.swing.JLabel();
        referenciaTextField = new javax.swing.JTextField();
        cnpjAlterarPJLabel = new javax.swing.JLabel();
        razaoSocialAlterarPJLabel = new javax.swing.JLabel();
        emailAlterarPJLabel = new javax.swing.JLabel();
        fornecedorTextField = new javax.swing.JFormattedTextField();
        telefonePrincAlterarPJLabel = new javax.swing.JLabel();
        precoCustoTextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cepAlterarPJLabel = new javax.swing.JLabel();
        logradouroAlterarPJLabel = new javax.swing.JLabel();
        estoqueMinimoTextField = new javax.swing.JTextField();
        estadoAlterarPJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantidadeAtual = new javax.swing.JTextField();
        limparFormularioAlterarPJButton = new javax.swing.JButton();
        alterarPJButton = new javax.swing.JButton();
        aplicacaoTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        removerQuantidade = new javax.swing.JRadioButton();
        adicionarQuantidade = new javax.swing.JRadioButton();
        precoVendaTextField = new javax.swing.JTextField();
        margemLucroTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        descricaoTextField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Dados do produto");

        nomeFantasiaAlterarPJLabel.setText("Referência");

        cnpjAlterarPJLabel.setText("Descrição");

        razaoSocialAlterarPJLabel.setText("Fornecedor");

        emailAlterarPJLabel.setText("Unidade/Volume");

        fornecedorTextField.setEnabled(false);

        telefonePrincAlterarPJLabel.setText("Preço Custo");

        precoCustoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoCustoTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Margem de Lucro");

        cepAlterarPJLabel.setText("Preço Venda");

        logradouroAlterarPJLabel.setText("Estoque mínimo");

        estoqueMinimoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estoqueMinimoTextFieldKeyTyped(evt);
            }
        });

        estadoAlterarPJLabel.setText("Aplicação");

        jLabel3.setText("Quantidade atual no Estoque");

        quantidadeAtual.setEnabled(false);

        limparFormularioAlterarPJButton.setText("Limpar Formúlario");
        limparFormularioAlterarPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFormularioAlterarPJButtonActionPerformed(evt);
            }
        });

        alterarPJButton.setText("Alterar Produto");
        alterarPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Selecionar Fornecedor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantidadeFocusLost(evt);
            }
        });
        quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeKeyTyped(evt);
            }
        });

        jLabel4.setText("Quantidade ");

        alteracaoEstoque.add(removerQuantidade);
        removerQuantidade.setText("Remover Quantidade");

        alteracaoEstoque.add(adicionarQuantidade);
        adicionarQuantidade.setSelected(true);
        adicionarQuantidade.setText("Adicionar Quantidade");

        precoVendaTextField.setEnabled(false);

        margemLucroTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                margemLucroTextFieldFocusLost(evt);
            }
        });

        jLabel5.setText("Essa quantidade será adicionada ou removida");

        jLabel6.setText("tendo base a quantidade atual no estoque.");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caixa", "Peça" }));

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logradouroAlterarPJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(cnpjAlterarPJLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jToggleButton1)
                .addGap(34, 34, 34)
                .addComponent(limparFormularioAlterarPJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alterarPJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estadoAlterarPJLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aplicacaoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepAlterarPJLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(precoVendaTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(estoqueMinimoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefonePrincAlterarPJLabel)
                                            .addComponent(precoCustoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(nomeFantasiaAlterarPJLabel)
                                            .addComponent(referenciaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(razaoSocialAlterarPJLabel)
                                            .addComponent(fornecedorTextField))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adicionarQuantidade)
                                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(removerQuantidade)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(margemLucroTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quantidadeAtual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailAlterarPJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(45, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFantasiaAlterarPJLabel)
                    .addComponent(cnpjAlterarPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenciaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(razaoSocialAlterarPJLabel)
                    .addComponent(emailAlterarPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonePrincAlterarPJLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoCustoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(margemLucroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepAlterarPJLabel)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeAtual)
                    .addComponent(precoVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerQuantidade)
                        .addComponent(adicionarQuantidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logradouroAlterarPJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estoqueMinimoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(estadoAlterarPJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aplicacaoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alterarPJButton)
                            .addComponent(limparFormularioAlterarPJButton)
                            .addComponent(jToggleButton1))
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void limparFormularioAlterarPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFormularioAlterarPJButtonActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_limparFormularioAlterarPJButtonActionPerformed

    private void alterarPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPJButtonActionPerformed

        ControladorProduto cp = new ControladorProduto();
        try {
            p.setReferencia(referenciaTextField.getText());
            p.setFornecedor(this.f);
            p.setDescricao(descricaoTextField.getText());
            p.setUnidadeVolume(jComboBox1.getSelectedItem().toString());
            p.setPrecoCusto(Float.parseFloat(precoCustoTextField.getText()));
            p.setMargemLucro(Float.parseFloat(margemLucroTextField.getText()));
            
            if(precoVenda > 0){
                 p.setPrecoVenda(precoVenda);
            } 
                p.setPrecoVenda(p.getPrecoVenda());
           
            if (adicionarQuantidade.isSelected()) {
                novaQuantidade = p.getEstoqueAtual() + Integer.parseInt(quantidade.getText());
                p.setEstoqueAtual(novaQuantidade);
            } else {
                novaQuantidade = p.getEstoqueAtual() - Integer.parseInt(quantidade.getText());
                p.setEstoqueAtual(novaQuantidade);
            }

            p.setEstoqueMinimo(Integer.parseInt(estoqueMinimoTextField.getText()));

            cp.atualizar(p);
            JOptionPane.showMessageDialog(rootPane, "Produto Atualizado com"
                    + " Sucesso");
            
            this.formPai.listarProduto();
            this.dispose();
                
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_alterarPJButtonActionPerformed

    private void precoCustoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoCustoTextFieldKeyTyped
        // TODO add your handling code here:
        char telefonePrinc = evt.getKeyChar();

        if (!((precoCustoTextField.getText().length() <= 10) && (telefonePrinc >= '0') && (telefonePrinc <= '9')
                || (telefonePrinc == KeyEvent.VK_BACK_SPACE)
                || (telefonePrinc == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_precoCustoTextFieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdicionarFornecedor af = new AdicionarFornecedor(this);
        af.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeKeyTyped
        // TODO add your handling code here:

        char quatidadeEstoqueKey = evt.getKeyChar();

        if (!((quantidade.getText().length() <= 5) && (quatidadeEstoqueKey >= '0') && (quatidadeEstoqueKey <= '9')
                || (quatidadeEstoqueKey == KeyEvent.VK_BACK_SPACE)
                || (quatidadeEstoqueKey == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_quantidadeKeyTyped

    private void estoqueMinimoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estoqueMinimoTextFieldKeyTyped
        // TODO add your handling code here:

        char quatidadeEstoqueKey = evt.getKeyChar();

        if (!((estoqueMinimoTextField.getText().length() <= 5) && (quatidadeEstoqueKey >= '0') && (quatidadeEstoqueKey <= '9')
                || (quatidadeEstoqueKey == KeyEvent.VK_BACK_SPACE)
                || (quatidadeEstoqueKey == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_estoqueMinimoTextFieldKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        ProdutoListagem pl = new ProdutoListagem();
        pl.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void margemLucroTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_margemLucroTextFieldFocusLost
        // TODO add your handling code here:

        custoPeca = Float.parseFloat(precoCustoTextField.getText());
        margemLucro = Float.parseFloat(margemLucroTextField.getText());

        if (custoPeca != 0 && margemLucro != 0) {
            valorLucro = custoPeca * (margemLucro / 100);
            precoVenda = valorLucro + custoPeca;
            precoVendaTextField.setText("" + precoVenda);
        }

    }//GEN-LAST:event_margemLucroTextFieldFocusLost

    private void quantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantidadeFocusLost
        // TODO add your handling code here:
        try {
            if (removerQuantidade.isSelected()) {
                if ((!quantidade.getText().equals(""))
                        && Integer.parseInt(quantidade.getText()) > p.getEstoqueAtual()) {
                    JOptionPane.showMessageDialog(this, "Você não pode remover uma quantidade"
                            + " superior a existente no estoque");
                    quantidade.setText("");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_quantidadeFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProdutoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adicionarQuantidade;
    private javax.swing.ButtonGroup alteracaoEstoque;
    private javax.swing.JButton alterarPJButton;
    private javax.swing.JTextField aplicacaoTextfield;
    private javax.swing.JLabel cepAlterarPJLabel;
    private javax.swing.JLabel cnpjAlterarPJLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JLabel emailAlterarPJLabel;
    private javax.swing.JLabel estadoAlterarPJLabel;
    private javax.swing.JTextField estoqueMinimoTextField;
    private javax.swing.JFormattedTextField fornecedorTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton limparFormularioAlterarPJButton;
    private javax.swing.JLabel logradouroAlterarPJLabel;
    private javax.swing.JTextField margemLucroTextField;
    private javax.swing.JLabel nomeFantasiaAlterarPJLabel;
    private javax.swing.JFormattedTextField precoCustoTextField;
    private javax.swing.JTextField precoVendaTextField;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField quantidadeAtual;
    private javax.swing.JLabel razaoSocialAlterarPJLabel;
    private javax.swing.JTextField referenciaTextField;
    private javax.swing.JRadioButton removerQuantidade;
    private javax.swing.JLabel telefonePrincAlterarPJLabel;
    // End of variables declaration//GEN-END:variables
}
