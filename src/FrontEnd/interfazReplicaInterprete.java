/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.replicaInterprete;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KEVIN
 */
public class interfazReplicaInterprete extends javax.swing.JFrame {

    replicaInterprete replica1;
    /**
     * Creates new form replica1
     */
    public interfazReplicaInterprete() {
        initComponents();
        replica1=new replicaInterprete();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CB_replica1Options = new javax.swing.JComboBox<>();
        Txt_inputReplica1 = new javax.swing.JTextField();
        btn_replica1Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_replica1 = new javax.swing.JTable();
        btn_mostarReplica1 = new javax.swing.JButton();
        btn_regresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Replica Interprete");

        CB_replica1Options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Interprete", "Apellido Interprete", "Pais", "Alias", "Edad" }));

        btn_replica1Buscar.setText("Buscar");
        btn_replica1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_replica1BuscarActionPerformed(evt);
            }
        });

        Table_replica1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table_replica1);

        btn_mostarReplica1.setText("Mostar Datos");
        btn_mostarReplica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarReplica1ActionPerformed(evt);
            }
        });

        btn_regresa.setText("Regresar");
        btn_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CB_replica1Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txt_inputReplica1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btn_replica1Buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_mostarReplica1)
                                .addGap(31, 31, 31)
                                .addComponent(btn_regresa)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_replica1Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_inputReplica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_replica1Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostarReplica1)
                    .addComponent(btn_regresa))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mostarReplica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarReplica1ActionPerformed
        try {
            // TODO add your handling code here:
            replica1.MostrarInterprete(Table_replica1);
        } catch (SQLException ex) {
            Logger.getLogger(interfazReplicaInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_mostarReplica1ActionPerformed

    private void btn_replica1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_replica1BuscarActionPerformed
        try {
            // TODO add your handling code here:
            replica1.Buscar(CB_replica1Options.getItemAt(CB_replica1Options.getSelectedIndex()), Table_replica1, Txt_inputReplica1.getText());
        } catch (SQLException ex) {
            Logger.getLogger(interfazReplicaInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_replica1BuscarActionPerformed

    private void btn_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new interfazPrincipal().setVisible(true);
    }//GEN-LAST:event_btn_regresaActionPerformed

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
            java.util.logging.Logger.getLogger(interfazReplicaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazReplicaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazReplicaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazReplicaInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazReplicaInterprete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_replica1Options;
    private javax.swing.JTable Table_replica1;
    private javax.swing.JTextField Txt_inputReplica1;
    private javax.swing.JButton btn_mostarReplica1;
    private javax.swing.JButton btn_regresa;
    private javax.swing.JButton btn_replica1Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
