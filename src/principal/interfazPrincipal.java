/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import FrontEnd.interfazAlbum;
import FrontEnd.interfazCancion;
import FrontEnd.interfazGenero;
import FrontEnd.interfazIdioma;
import FrontEnd.interfazInterprete;

/**
 *
 * @author KEVIN
 */
public class interfazPrincipal extends javax.swing.JFrame {

    interfazInterprete interpretre;
    interfazAlbum album;
    interfazCancion cancion;
    interfazGenero genero;
    interfazIdioma idioma;
    //interfazPrincipal ventan ;
        
    /**
     * Creates new form interfazPrincipal
     */
    public interfazPrincipal() {
        initComponents();
        interpretre=new interfazInterprete();
        album=new interfazAlbum();
        cancion=new interfazCancion();
        genero=new interfazGenero();
        idioma=new interfazIdioma();
        //ventan = new interfazPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_interprete = new javax.swing.JButton();
        btn_album = new javax.swing.JButton();
        btn_cancion = new javax.swing.JButton();
        btn_genero = new javax.swing.JButton();
        btn_idioma = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_interprete.setText("Interprete");
        btn_interprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interpreteActionPerformed(evt);
            }
        });

        btn_album.setText("Album");
        btn_album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumActionPerformed(evt);
            }
        });

        btn_cancion.setText("Canciones");
        btn_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancionActionPerformed(evt);
            }
        });

        btn_genero.setText("Genero");
        btn_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generoActionPerformed(evt);
            }
        });

        btn_idioma.setText("Idioma");
        btn_idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idiomaActionPerformed(evt);
            }
        });

        jButton6.setText("Auditoria");

        jButton7.setText("Replica1");

        jButton8.setText("replica2");

        jButton9.setText("replica3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton6)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_idioma)
                            .addComponent(btn_genero))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cancion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_album)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_interprete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(jButton7)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_interprete)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_album)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancion)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_genero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_idioma)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_interpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interpreteActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        interpretre.setVisible(true);
        //interpretre.setAlwaysOnTop(true);
        //new interfazInterprete().setVisible(true);
        
        
        
    }//GEN-LAST:event_btn_interpreteActionPerformed

    private void btn_albumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumActionPerformed
        // TODO add your handling code here:
        album.setVisible(true);
    }//GEN-LAST:event_btn_albumActionPerformed

    private void btn_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancionActionPerformed
        // TODO add your handling code here:
        cancion.setVisible(true);
    }//GEN-LAST:event_btn_cancionActionPerformed

    private void btn_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generoActionPerformed
        // TODO add your handling code here:
        genero.setVisible(true);
    }//GEN-LAST:event_btn_generoActionPerformed

    private void btn_idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idiomaActionPerformed
        // TODO add your handling code here:
        idioma.setVisible(true);
    }//GEN-LAST:event_btn_idiomaActionPerformed

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
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_album;
    private javax.swing.JButton btn_cancion;
    private javax.swing.JButton btn_genero;
    private javax.swing.JButton btn_idioma;
    private javax.swing.JButton btn_interprete;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}