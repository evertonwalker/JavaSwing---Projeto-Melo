/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque.telas;

import estoque.controladores.ControladorMecanico;
import estoque.modelos.Mecanico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FHC
 */
public class MecanicoListagem extends javax.swing.JFrame {

    ArrayList<Mecanico> listaMecanicoGlobal;

    /**
     * Creates new form MecanicoListagem
     */
    public MecanicoListagem() {
        initComponents();
        this.setLocationRelativeTo(null);

        listarMecanico();
    }

    public void listarMecanico() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        //atribuindo as colunas da tabela
        modelo.setColumnIdentifiers(new String[]{"Nome Mecânico", "CPF"});
       try {
            ControladorMecanico mec = new ControladorMecanico();
            this.listaMecanicoGlobal = mec.listarMecanico();
            for (Mecanico m : listaMecanicoGlobal) {
                modelo.addRow(new String[]{"" + m.getNome(), m.getCpf()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        tabelaMecanicoTable.setModel(modelo);

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
        jLabel2 = new javax.swing.JLabel();
        filtroMecanicoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMecanicoTable = new javax.swing.JTable();
        alterarMecanicoToggleButton = new javax.swing.JToggleButton();
        removerMecanicoToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listar Mecânicos");

        jLabel2.setText("Filtro Nome Mecânico");

        filtroMecanicoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtroMecanicoTextFieldKeyPressed(evt);
            }
        });

        tabelaMecanicoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaMecanicoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMecanicoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMecanicoTable);

        alterarMecanicoToggleButton.setText("Alterar");
        alterarMecanicoToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarMecanicoToggleButtonActionPerformed(evt);
            }
        });

        removerMecanicoToggleButton.setText("Remover");
        removerMecanicoToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMecanicoToggleButtonActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(filtroMecanicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alterarMecanicoToggleButton)
                        .addGap(34, 34, 34)
                        .addComponent(removerMecanicoToggleButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtroMecanicoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarMecanicoToggleButton)
                    .addComponent(removerMecanicoToggleButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMecanicoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMecanicoTableMouseClicked
        // TODO add your handling code here:
        try {
            int index = tabelaMecanicoTable.getSelectedRow();
            if (index >= 0) {
                Mecanico mec = this.listaMecanicoGlobal.get(index);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_tabelaMecanicoTableMouseClicked

    private void removerMecanicoToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMecanicoToggleButtonActionPerformed
        // TODO add your handling code here:
        try {
            ControladorMecanico mec = new ControladorMecanico();
            //Seleciona a linha da coluna.
            int index = tabelaMecanicoTable.getSelectedRow();

            if (index >= 0) {
                Mecanico m = this.listaMecanicoGlobal.get(index);

                try {
                    mec.remover(m);
                    JOptionPane.showMessageDialog(rootPane, "Mecânico Removido com "
                            + "Sucesso");
                    listarMecanico();
                } catch (Exception ex) {
                    System.out.println();
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um Mecânico para"
                        + " Remover");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_removerMecanicoToggleButtonActionPerformed

    private void alterarMecanicoToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarMecanicoToggleButtonActionPerformed
        // TODO add your handling code here:
        int index = tabelaMecanicoTable.getSelectedRow();

        if (index >= 0) {
            Mecanico mec = this.listaMecanicoGlobal.get(index);
            AlterarMecanicoForm amec = new AlterarMecanicoForm(mec, this);

            amec.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Mecânico para"
                    + " Alterar");
        }
    }//GEN-LAST:event_alterarMecanicoToggleButtonActionPerformed

    private void filtroMecanicoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroMecanicoTextFieldKeyPressed
        // TODO add your handling code here:
        
        DefaultTableModel modelo = new DefaultTableModel();
        //atribuindo as colunas da tabela
        modelo.setColumnIdentifiers(new String[]{"Nome", "CPF"});

        if (filtroMecanicoTextField.getText().length() > 0) {

            ControladorMecanico cmec = new ControladorMecanico();

            try {
                this.listaMecanicoGlobal = cmec.filtragem(filtroMecanicoTextField.getText());
                 for (Mecanico mec : listaMecanicoGlobal) {
                modelo.addRow(new String[]{"" + mec.getNome(), mec.getCpf()});
            }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Mecânico não encontrado!");
            }

            tabelaMecanicoTable.setModel(modelo);

        } else {
            listarMecanico();
        }
    }//GEN-LAST:event_filtroMecanicoTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(MecanicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MecanicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MecanicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MecanicoListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MecanicoListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton alterarMecanicoToggleButton;
    private javax.swing.JTextField filtroMecanicoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton removerMecanicoToggleButton;
    private javax.swing.JTable tabelaMecanicoTable;
    // End of variables declaration//GEN-END:variables
}
