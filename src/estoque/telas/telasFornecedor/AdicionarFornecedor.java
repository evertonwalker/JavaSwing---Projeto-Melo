/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.telas.telasFornecedor;

import estoque.controladores.ControladorFornecedor;
import estoque.modelos.Fornecedor;
import estoque.telas.Produtos.AlterarProdutoForm;
import estoque.telas.Produtos.ProdutoForm;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EWalker
 */
public class AdicionarFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form ClienteListagem
     */
    ArrayList<Fornecedor> listaFornecedorGlobal;
    ProdutoForm formPai;
    AlterarProdutoForm apf;
    String classeChamada;

    public AdicionarFornecedor() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public AdicionarFornecedor(ProdutoForm formPai) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.formPai = formPai;
        listarFornecedor();
        this.classeChamada = "ProdutoForm";
    }

    public AdicionarFornecedor(AlterarProdutoForm alterarProdutoForm) {
         initComponents();
        this.setLocationRelativeTo(null);
        this.apf = alterarProdutoForm;
        listarFornecedor();
        this.classeChamada = "AlterarProdutoForm";

    }

    public void listarFornecedor() {
        DefaultTableModel modelo = new DefaultTableModel();
        //atribuindo as colunas da tabela
        modelo.setColumnIdentifiers(new String[]{"Nome fantasia", "Email",
            "Telefone Principal", "Telefone Opcional", " Contatos Responsáveis"});
        try {
            ControladorFornecedor cf = new ControladorFornecedor();
            this.listaFornecedorGlobal = cf.listar();
            for (Fornecedor f : listaFornecedorGlobal) {
                modelo.addRow(new String[]{"" + f.getNomeFantasia(), f.getEmail(),
                    f.getTelefonePrincipal(), f.getTelefoneOpcional(), f.getNomeResponsaveis()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        fornecedorTable.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fornecedorTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filtroFornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        confirmarFornecedorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fornecedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(fornecedorTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Adicionar Fornecedor");

        filtroFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroFornecedorKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Filtre pelo nome fantasia");

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        confirmarFornecedorButton.setText("Confirmar Fornecedor");
        confirmarFornecedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarFornecedorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(filtroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarFornecedorButton)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton)
                    .addComponent(confirmarFornecedorButton))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroFornecedorKeyPressed
        // TODO add your handling code here:

        DefaultTableModel modelo = new DefaultTableModel();
        //atribuindo as colunas da tabela
        modelo.setColumnIdentifiers(new String[]{"Nome fantasia", "Email",
            "Telefone Principal", "Telefone Opcional", " Contatos Responsáveis"});

        if (filtroFornecedor.getText().length() > 0) {
            for (Fornecedor f : listaFornecedorGlobal) {
                if (f.getNomeFantasia().toLowerCase().contains(
                        filtroFornecedor.getText().toLowerCase())) {
                    modelo.addRow(new String[]{"" + f.getNomeFantasia(), f.getEmail(),
                        f.getTelefonePrincipal(), f.getTelefoneOpcional(), f.getNomeResponsaveis()});
                }
            }
            fornecedorTable.setModel(modelo);
        } else {
            listarFornecedor();
        }
    }//GEN-LAST:event_filtroFornecedorKeyPressed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void confirmarFornecedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarFornecedorButtonActionPerformed
        // TODO add your handling code here:
        int index = fornecedorTable.getSelectedRow();

        if (index >= 0) {

            Fornecedor f = this.listaFornecedorGlobal.get(index);
            if (this.classeChamada.equals("ProdutoForm")) {
               
                formPai.receberFornecedor(f);
                this.dispose();
                formPai.setVisible(true);
            } else {
                apf.receberFornecedor(f);
                this.dispose();
                apf.setVisible(true);
                
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Fornecedor para"
                    + " confirmar");
        }

    }//GEN-LAST:event_confirmarFornecedorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarFornecedorButton;
    private javax.swing.JTextField filtroFornecedor;
    private javax.swing.JTable fornecedorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
