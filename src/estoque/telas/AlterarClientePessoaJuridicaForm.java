/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.telas;

import estoque.controladores.ControladorClientePessoaJuridica;
import estoque.modelos.ClientePessoaJuridica;
import estoque.util.Util;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author FHC
 */
public class AlterarClientePessoaJuridicaForm extends javax.swing.JFrame {

    /**
     * Creates new form AlterarClientePessoaJuridicaForm
     */
    private String oldCnpj;
    ClientePessoaJuridica cpj;
    ClientePessoaJuridicaListagem formPai;

    public AlterarClientePessoaJuridicaForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public AlterarClientePessoaJuridicaForm(ClientePessoaJuridica cpj, ClientePessoaJuridicaListagem formPai) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cpj = cpj;
        this.formPai = formPai;
        this.carregarCampos(this.cpj);
    }

    private void buscarCep(String cep) {

        String cepTratado = cep.replace("-", "");
        String url = "http://viacep.com.br/ws/" + cepTratado + "/json/";

        Util e = new Util();
        try {
            JSONObject obj = new JSONObject(e.getHttpGET(url));
            logradouroAlterarPJTextField.setText(obj.getString("logradouro"));
            estadoAlterarPJTextField.setText(obj.getString("uf"));
            cidadeAlterarPJTextField.setText(obj.getString("localidade"));
            bairroAlterarPJLabel.setText((obj.getString("bairro")));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    private void carregarCampos(ClientePessoaJuridica cpj) {
        try {
            this.oldCnpj = cpj.getCnpj();
            nomeFantasiaAlterarPJTextField.setText(cpj.getNomeFantasia());
            cnpjAlterarPJTextField.setText(cpj.getCnpj());
            razaoSocialAlterarPJFormattedTextField.setText(cpj.getRazaoSocial());
            emailAlterarPJFormattedTextField.setText(cpj.getEmail());
            telefonePrincAlterarPJFormattedTextField.setText(cpj.getTelefonePrinc());
            telefoneOpcionalAlterarPJFormattedTextField.setText(cpj.getTelefoneOpc());
            cepAlterarPJFormattedTextField.setText(cpj.getCep());
            buscarCep(cpj.getCep());
            numeroAlterarPJTextField.setText(cpj.getNumero());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void limparCampos() {
        try {
            nomeFantasiaAlterarPJTextField.setText("");
            razaoSocialAlterarPJFormattedTextField.setText("");
            cnpjAlterarPJTextField.setText("");
            cepAlterarPJFormattedTextField.setText("");
            logradouroAlterarPJTextField.setText("");
            estadoAlterarPJTextField.setText("");
            cidadeAlterarPJTextField.setText("");
            bairroAlterarPJLabel.setText("");
            emailAlterarPJFormattedTextField.setText("");
            telefonePrincAlterarPJFormattedTextField.setText("");
            telefoneOpcionalAlterarPJFormattedTextField.setText("");
            numeroAlterarPJTextField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeFantasiaAlterarPJLabel = new javax.swing.JLabel();
        nomeFantasiaAlterarPJTextField = new javax.swing.JTextField();
        cnpjAlterarPJLabel = new javax.swing.JLabel();
        cnpjAlterarPJTextField = new javax.swing.JTextField();
        razaoSocialAlterarPJLabel = new javax.swing.JLabel();
        emailAlterarPJLabel = new javax.swing.JLabel();
        emailAlterarPJFormattedTextField = new javax.swing.JFormattedTextField();
        razaoSocialAlterarPJFormattedTextField = new javax.swing.JFormattedTextField();
        telefonePrincAlterarPJLabel = new javax.swing.JLabel();
        telefonePrincAlterarPJFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        telefoneOpcionalAlterarPJFormattedTextField = new javax.swing.JFormattedTextField();
        cepAlterarPJLabel = new javax.swing.JLabel();
        cepAlterarPJFormattedTextField = new javax.swing.JFormattedTextField();
        logradouroAlterarPJLabel = new javax.swing.JLabel();
        logradouroAlterarPJTextField = new javax.swing.JTextField();
        cidadeAlterarPJLabel = new javax.swing.JLabel();
        cidadeAlterarPJTextField = new javax.swing.JTextField();
        bairroAlterarPJLabel = new javax.swing.JLabel();
        bairroAlterarPJTextField = new javax.swing.JTextField();
        estadoAlterarPJLabel = new javax.swing.JLabel();
        estadoAlterarPJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numeroAlterarPJTextField = new javax.swing.JTextField();
        limparFormularioAlterarPJButton = new javax.swing.JButton();
        alterarPJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Alterar Cliente Pessoa Jurídica");

        nomeFantasiaAlterarPJLabel.setText("Nome Fantasia");

        cnpjAlterarPJLabel.setText("Cnpj");

        cnpjAlterarPJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjAlterarPJTextFieldActionPerformed(evt);
            }
        });

        razaoSocialAlterarPJLabel.setText("Razão Social");

        emailAlterarPJLabel.setText("Email");

        emailAlterarPJFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAlterarPJFormattedTextFieldActionPerformed(evt);
            }
        });

        telefonePrincAlterarPJLabel.setText("Telefone Principal");

        jLabel2.setText("Telefone Opicional");

        cepAlterarPJLabel.setText("Cep");

        cepAlterarPJFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cepAlterarPJFormattedTextFieldFocusLost(evt);
            }
        });

        logradouroAlterarPJLabel.setText("Logradouro");

        logradouroAlterarPJTextField.setEnabled(false);

        cidadeAlterarPJLabel.setText("Cidade");

        cidadeAlterarPJTextField.setEnabled(false);

        bairroAlterarPJLabel.setText("Bairro");

        bairroAlterarPJTextField.setEnabled(false);

        estadoAlterarPJLabel.setText("Estado");

        estadoAlterarPJTextField.setEnabled(false);

        jLabel3.setText("Número");

        limparFormularioAlterarPJButton.setText("Limpar Formúlario");
        limparFormularioAlterarPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFormularioAlterarPJButtonActionPerformed(evt);
            }
        });

        alterarPJButton.setText("Alterar");
        alterarPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPJButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cepAlterarPJLabel)
                            .addComponent(cepAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logradouroAlterarPJLabel)
                            .addComponent(logradouroAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoAlterarPJLabel)
                            .addComponent(limparFormularioAlterarPJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonePrincAlterarPJLabel)
                                    .addComponent(telefonePrincAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeFantasiaAlterarPJLabel)
                                    .addComponent(nomeFantasiaAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(razaoSocialAlterarPJLabel)
                                    .addComponent(razaoSocialAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeAlterarPJLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cidadeAlterarPJTextField)
                                        .addComponent(estadoAlterarPJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(alterarPJButton)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bairroAlterarPJLabel)
                                            .addComponent(cnpjAlterarPJTextField)
                                            .addComponent(jLabel2)
                                            .addComponent(telefoneOpcionalAlterarPJFormattedTextField)
                                            .addComponent(bairroAlterarPJTextField)
                                            .addComponent(emailAlterarPJLabel)
                                            .addComponent(cnpjAlterarPJLabel)
                                            .addComponent(jLabel3)
                                            .addComponent(numeroAlterarPJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                                    .addComponent(emailAlterarPJFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFantasiaAlterarPJLabel)
                    .addComponent(cnpjAlterarPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFantasiaAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(razaoSocialAlterarPJLabel)
                    .addComponent(emailAlterarPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(razaoSocialAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonePrincAlterarPJLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonePrincAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneOpcionalAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cepAlterarPJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cepAlterarPJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logradouroAlterarPJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logradouroAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeAlterarPJLabel)
                    .addComponent(bairroAlterarPJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoAlterarPJLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroAlterarPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparFormularioAlterarPJButton)
                    .addComponent(alterarPJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cnpjAlterarPJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjAlterarPJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjAlterarPJTextFieldActionPerformed

    private void emailAlterarPJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAlterarPJFormattedTextFieldActionPerformed
        // TODO add your handling code here:
        String email = emailAlterarPJFormattedTextField.getText().toLowerCase();
        emailAlterarPJFormattedTextField.setText(email);
    }//GEN-LAST:event_emailAlterarPJFormattedTextFieldActionPerformed

    private void limparFormularioAlterarPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFormularioAlterarPJButtonActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_limparFormularioAlterarPJButtonActionPerformed

    private void cepAlterarPJFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepAlterarPJFormattedTextFieldFocusLost
        // TODO add your handling code here:
        buscarCep(cepAlterarPJFormattedTextField.getText());
    }//GEN-LAST:event_cepAlterarPJFormattedTextFieldFocusLost

    private void alterarPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPJButtonActionPerformed
        // TODO add your handling code here:
        try {
            ControladorClientePessoaJuridica ccpj = new ControladorClientePessoaJuridica();
            ClientePessoaJuridica cpj = new ClientePessoaJuridica();

            cpj.setNomeFantasia(nomeFantasiaAlterarPJTextField.getText());
            cpj.setCnpj(cnpjAlterarPJTextField.getText());
            cpj.setRazaoSocial(razaoSocialAlterarPJFormattedTextField.getText());
            cpj.setEmail(emailAlterarPJFormattedTextField.getText());
            cpj.setTelefonePrinc(telefonePrincAlterarPJFormattedTextField.getText());
            cpj.setTelefoneOpc(telefoneOpcionalAlterarPJFormattedTextField.getText());
            cpj.setCep(cepAlterarPJFormattedTextField.getText());
            cpj.setLogradouro(logradouroAlterarPJTextField.getText());
            cpj.setCidade(cidadeAlterarPJTextField.getText());
            cpj.setBairro(bairroAlterarPJTextField.getText());
            cpj.setEstado(estadoAlterarPJTextField.getText());
            cpj.setNumero(numeroAlterarPJTextField.getText());

            ccpj.atualizar(cpj, this.oldCnpj);
            JOptionPane.showMessageDialog(rootPane, "Cliente Atualizado com"
                    + " Sucesso");
            this.formPai.listar();
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ERROO");
        }
    }//GEN-LAST:event_alterarPJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarClientePessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarClientePessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarClientePessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarClientePessoaJuridicaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarClientePessoaJuridicaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarPJButton;
    private javax.swing.JLabel bairroAlterarPJLabel;
    private javax.swing.JTextField bairroAlterarPJTextField;
    private javax.swing.JFormattedTextField cepAlterarPJFormattedTextField;
    private javax.swing.JLabel cepAlterarPJLabel;
    private javax.swing.JLabel cidadeAlterarPJLabel;
    private javax.swing.JTextField cidadeAlterarPJTextField;
    private javax.swing.JLabel cnpjAlterarPJLabel;
    private javax.swing.JTextField cnpjAlterarPJTextField;
    private javax.swing.JFormattedTextField emailAlterarPJFormattedTextField;
    private javax.swing.JLabel emailAlterarPJLabel;
    private javax.swing.JLabel estadoAlterarPJLabel;
    private javax.swing.JTextField estadoAlterarPJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limparFormularioAlterarPJButton;
    private javax.swing.JLabel logradouroAlterarPJLabel;
    private javax.swing.JTextField logradouroAlterarPJTextField;
    private javax.swing.JLabel nomeFantasiaAlterarPJLabel;
    private javax.swing.JTextField nomeFantasiaAlterarPJTextField;
    private javax.swing.JTextField numeroAlterarPJTextField;
    private javax.swing.JFormattedTextField razaoSocialAlterarPJFormattedTextField;
    private javax.swing.JLabel razaoSocialAlterarPJLabel;
    private javax.swing.JFormattedTextField telefoneOpcionalAlterarPJFormattedTextField;
    private javax.swing.JFormattedTextField telefonePrincAlterarPJFormattedTextField;
    private javax.swing.JLabel telefonePrincAlterarPJLabel;
    // End of variables declaration//GEN-END:variables
}
