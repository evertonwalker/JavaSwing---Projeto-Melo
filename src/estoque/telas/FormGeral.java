/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.telas;

import java.awt.Color;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author EWalker
 */
public class FormGeral extends javax.swing.JFrame {

    /**
     * Creates new form FormGeral
     */
    public FormGeral() {
        initComponents();
    }

    public void buscarCep(String cep) {

        //Definindo a url 
        String url = "http://viacep.com.br/ws/" + cep + "/json/";

        //Criando o objeto Json para receber os dados
        
    }

    private void camposClientesAtivarLimparClienteJuridico() {

        nomeClienteTextField.setEnabled(true);
        cpfFormattedTextField.setEnabled(true);
        nomeFantasiaTextField.setText("");
        nomeFantasiaTextField.setEnabled(false);
        cnpjFormattedTextField.setText("");
        cnpjFormattedTextField.setEnabled(false);
        razaoSocialTextField.setText("");
        razaoSocialTextField.setEnabled(false);

    }

    private void camposJuridicoAtivarLimparClienteFisico() {

        nomeFantasiaTextField.setEnabled(true);
        cnpjFormattedTextField.setEnabled(true);
        razaoSocialTextField.setEnabled(true);

        nomeClienteTextField.setText("");
        nomeClienteTextField.setEnabled(false);
        cpfFormattedTextField.setText("");
        cpfFormattedTextField.setEnabled(false);
    }

    private void selecionarTipoCliente() {

        if (clienteFisicoButton.isSelected()) {

            camposClientesAtivarLimparClienteJuridico();

        } else if (juridicoFisicoButton.isSelected()) {

            camposJuridicoAtivarLimparClienteFisico();

        }

    }

    private void colocarMascara() {

        if (clienteFisicoButton.isSelected()) {

            nomeFantasiaTextField.setEnabled(false);
            cnpjFormattedTextField.setEnabled(false);
            razaoSocialTextField.setEnabled(false);

        } else if (juridicoFisicoButton.isSelected()) {

            /*  cpfOrCnpjFormattedField.setVisible(false);
            nomeClienteLabel.setText(("Nome Fantasia"));
            cpfOrCnpjFormattedField.setText("");
            cpfOrCnpjFormattedField = new javax.swing.JFormattedTextField(mascara("##.###.#"
                    + "##/####-##"));*/
        }
    }

    public MaskFormatter mascara(String mascaraValue) {

        MaskFormatter mascaraObject = new MaskFormatter();
        try {
            mascaraObject.setMask(mascaraValue);
            mascaraObject.setPlaceholderCharacter(' ');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mascaraObject;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoClienteButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        clienteFisicoButton = new javax.swing.JRadioButton();
        juridicoFisicoButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        nomeClienteTextField = new javax.swing.JTextField();
        nomeClienteLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        nomeFantasiaLabel = new javax.swing.JLabel();
        nomeFantasiaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfFormattedTextField = new javax.swing.JFormattedTextField(mascara("###.###.###-##"));
        cnpjFormattedTextField = new javax.swing.JFormattedTextField(mascara("##.###.##"
            + "#/####-##"));
    razaoSocialLabel = new javax.swing.JLabel();
    razaoSocialTextField = new javax.swing.JTextField();
    emailLabel = new javax.swing.JLabel();
    emailTextField = new javax.swing.JTextField();
    telefonePrincipalLabel = new javax.swing.JLabel();
    telefonePrincipalTextField = new javax.swing.JTextField();
    telefoneOpcionalTextField = new javax.swing.JTextField();
    telefoneOpcionalLabel = new javax.swing.JLabel();
    cepLabel = new javax.swing.JLabel();
    cepFormattedTextField = new javax.swing.JFormattedTextField(mascara("#####-###"));
    logradouroTextField = new javax.swing.JTextField();
    logradouroLabel = new javax.swing.JLabel();
    estadoLabel = new javax.swing.JLabel();
    estadoTextField = new javax.swing.JTextField();
    cidadeLabel = new javax.swing.JLabel();
    cidadeTextField = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    bairroLabel = new javax.swing.JLabel();
    jToggleButton1 = new javax.swing.JToggleButton();
    jToggleButton2 = new javax.swing.JToggleButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Tipo do Cliente");

    tipoClienteButton.add(clienteFisicoButton);
    clienteFisicoButton.setLabel("Físico");
    clienteFisicoButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clienteFisicoButtonActionPerformed(evt);
        }
    });

    tipoClienteButton.add(juridicoFisicoButton);
    juridicoFisicoButton.setText("Jurídico");
    juridicoFisicoButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            juridicoFisicoButtonActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel2.setText("Cadastrar Cliente");

    nomeClienteLabel.setText("Nome do Cliente");

    cpfLabel.setText("Cpf");

    nomeFantasiaLabel.setText("Nome Fantasia");

    nomeFantasiaTextField.setEnabled(false);

    jLabel3.setText("Cnpj");

    cnpjFormattedTextField.setEnabled(false);

    razaoSocialLabel.setText("Razão Social");

    razaoSocialTextField.setEnabled(false);

    emailLabel.setText("Email");

    telefonePrincipalLabel.setText("Telefone Principal");

    telefoneOpcionalLabel.setText("Telefone Opcional");

    cepLabel.setText("Cep");

    logradouroTextField.setEnabled(false);

    logradouroLabel.setText("Logradouro");

    estadoLabel.setText("Estado");

    estadoTextField.setEnabled(false);

    cidadeLabel.setText("Cidade");

    cidadeTextField.setEnabled(false);

    jTextField4.setEnabled(false);

    bairroLabel.setText("Bairro");

    jToggleButton1.setText("Cadastrar Cliente");

    jToggleButton2.setText("Limpar Formulário");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButton1))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nomeClienteLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeClienteTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(telefonePrincipalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(emailTextField))
                                        .addGap(8, 8, 8))
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(telefonePrincipalLabel)
                                .addComponent(clienteFisicoButton)
                                .addComponent(emailLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(juridicoFisicoButton)
                                .addComponent(telefoneOpcionalLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(razaoSocialLabel)
                                    .addComponent(jLabel3)
                                    .addComponent(nomeFantasiaLabel)
                                    .addComponent(nomeFantasiaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(cnpjFormattedTextField)
                                    .addComponent(razaoSocialTextField)
                                    .addComponent(telefoneOpcionalTextField))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jLabel2)))
                    .addGap(88, 88, 88)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cepLabel)
                        .addComponent(logradouroLabel)
                        .addComponent(estadoLabel)
                        .addComponent(cidadeLabel)
                        .addComponent(bairroLabel)
                        .addComponent(estadoTextField)
                        .addComponent(cepFormattedTextField)
                        .addComponent(logradouroTextField)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(cidadeTextField))
                    .addGap(22, 22, 22)))
            .addGap(37, 37, 37))
        .addGroup(layout.createSequentialGroup()
            .addGap(161, 161, 161)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jLabel2)
            .addGap(38, 38, 38)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(clienteFisicoButton)
                .addComponent(juridicoFisicoButton))
            .addGap(14, 14, 14)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeClienteLabel)
                .addComponent(nomeFantasiaLabel)
                .addComponent(cepLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeFantasiaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cepFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cpfLabel)
                .addComponent(jLabel3)
                .addComponent(logradouroLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cpfFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cnpjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(razaoSocialLabel)
                .addComponent(estadoLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(razaoSocialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(11, 11, 11)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailLabel)
                .addComponent(cidadeLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(telefonePrincipalLabel)
                .addComponent(telefoneOpcionalLabel)
                .addComponent(bairroLabel))
            .addGap(13, 13, 13)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(telefonePrincipalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(telefoneOpcionalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jToggleButton1)
                .addComponent(jToggleButton2))
            .addGap(24, 24, 24))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteFisicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteFisicoButtonActionPerformed
        // TODO add your handling code here:
        selecionarTipoCliente();

    }//GEN-LAST:event_clienteFisicoButtonActionPerformed

    private void juridicoFisicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juridicoFisicoButtonActionPerformed
        // TODO add your handling code here:

        selecionarTipoCliente();

    }//GEN-LAST:event_juridicoFisicoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormGeral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGeral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JFormattedTextField cepFormattedTextField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JRadioButton clienteFisicoButton;
    private javax.swing.JFormattedTextField cnpjFormattedTextField;
    private javax.swing.JFormattedTextField cpfFormattedTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JTextField estadoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JRadioButton juridicoFisicoButton;
    private javax.swing.JLabel logradouroLabel;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JLabel nomeClienteLabel;
    private javax.swing.JTextField nomeClienteTextField;
    private javax.swing.JLabel nomeFantasiaLabel;
    private javax.swing.JTextField nomeFantasiaTextField;
    private javax.swing.JLabel razaoSocialLabel;
    private javax.swing.JTextField razaoSocialTextField;
    private javax.swing.JLabel telefoneOpcionalLabel;
    private javax.swing.JTextField telefoneOpcionalTextField;
    private javax.swing.JLabel telefonePrincipalLabel;
    private javax.swing.JTextField telefonePrincipalTextField;
    private javax.swing.ButtonGroup tipoClienteButton;
    // End of variables declaration//GEN-END:variables
}
