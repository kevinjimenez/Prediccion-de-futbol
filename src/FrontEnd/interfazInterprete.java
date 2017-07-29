/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Back_End;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author KEVIN
 */
public class interfazInterprete extends javax.swing.JFrame {
    Back_End bacEnd;        
   
    public interfazInterprete() {        
        initComponents();
        bacEnd = new Back_End();
        
        Button_Borrado.setVisible(false);
        Button_Insert.setVisible(false);
        Button_buscar.setVisible(false);
        Button_delete.setVisible(false);
        Button_Update.setVisible(false);
        Button_Mostar.setVisible(false);
        
        Cb_Busqueda.setVisible(false);        
        TablaResult.setVisible(false);
        Text_Busqueda.setVisible(false);
        
        TextF_IdInterprete.setEnabled(false);
        TextF_Nombre_Interprete.setEnabled(false);
        TextF_Apellido_Interprete.setEnabled(false);
        TextF_Pais.setEnabled(false);
        TextF_Alias.setEnabled(false);
        TextF_Edad.setEnabled(false);
    }        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextF_IdInterprete = new javax.swing.JTextField();
        TextF_Nombre_Interprete = new javax.swing.JTextField();
        TextF_Pais = new javax.swing.JTextField();
        TextF_Alias = new javax.swing.JTextField();
        TextF_Edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Button_Insert = new javax.swing.JButton();
        Button_Borrado = new javax.swing.JButton();
        Button_Mostar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextF_Apellido_Interprete = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Cb_Busqueda = new javax.swing.JComboBox<>();
        Text_Busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResult = new javax.swing.JTable();
        Button_buscar = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        Button_Update = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewInsert = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SearchRecord = new javax.swing.JMenuItem();
        DeleteRecord = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextF_IdInterprete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextF_IdInterpreteMouseClicked(evt);
            }
        });
        TextF_IdInterprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextF_IdInterpreteActionPerformed(evt);
            }
        });

        TextF_Alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextF_AliasActionPerformed(evt);
            }
        });

        jLabel1.setText("ID INTERPRETE");

        jLabel2.setText("NOMBRE INTERPRETE");

        jLabel3.setText("PAIS");

        jLabel4.setText("ALIAS");

        jLabel5.setText("EDAD");

        jLabel6.setText("DATOS DEL INTERPRETE");

        Button_Insert.setText("Inserta Nuevo");
        Button_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InsertActionPerformed(evt);
            }
        });

        Button_Borrado.setText("Borrar Campos");
        Button_Borrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BorradoActionPerformed(evt);
            }
        });

        Button_Mostar.setText("Mostar Datos");
        Button_Mostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MostarActionPerformed(evt);
            }
        });

        jLabel7.setText("APELLIDO INTERPRETE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Button_Insert)
                        .addGap(43, 43, 43)
                        .addComponent(Button_Borrado)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Mostar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextF_Nombre_Interprete, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(TextF_IdInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextF_Pais)
                            .addComponent(TextF_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextF_Apellido_Interprete))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextF_IdInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextF_Nombre_Interprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextF_Apellido_Interprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextF_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextF_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Insert)
                    .addComponent(Button_Borrado)
                    .addComponent(Button_Mostar))
                .addGap(29, 29, 29))
        );

        Cb_Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre Interprete", "Apellido Interprete", "Pais", "Alias", "Edad" }));

        TablaResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaResultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaResult);
        if (TablaResult.getColumnModel().getColumnCount() > 0) {
            TablaResult.getColumnModel().getColumn(0).setResizable(false);
            TablaResult.getColumnModel().getColumn(1).setResizable(false);
            TablaResult.getColumnModel().getColumn(2).setResizable(false);
            TablaResult.getColumnModel().getColumn(3).setResizable(false);
            TablaResult.getColumnModel().getColumn(4).setResizable(false);
        }

        Button_buscar.setText("Buscar");
        Button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_buscarActionPerformed(evt);
            }
        });

        Button_delete.setText("Eliminar Registro");
        Button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_deleteActionPerformed(evt);
            }
        });

        Button_Update.setText("Actualizar Registro");
        Button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button_delete)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Cb_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Text_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Button_buscar))
                    .addComponent(Button_Update))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cb_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_buscar))
                .addGap(3, 3, 3)
                .addComponent(Button_delete)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Update)
                .addGap(61, 61, 61))
        );

        jMenu1.setText("File");

        NewInsert.setText("Insertar Nuevo");
        NewInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewInsertActionPerformed(evt);
            }
        });
        jMenu1.add(NewInsert);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        SearchRecord.setText("Buscar Registro");
        SearchRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRecordActionPerformed(evt);
            }
        });
        jMenu2.add(SearchRecord);

        DeleteRecord.setText("Eliminar Registro");
        DeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRecordActionPerformed(evt);
            }
        });
        jMenu2.add(DeleteRecord);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InsertActionPerformed
        try {
            // TODO add your handling code here:
            bacEnd.InsertaDatosInterprete(Integer.parseInt(TextF_IdInterprete.getText()),TextF_Nombre_Interprete.getText(),TextF_Apellido_Interprete.getText(),TextF_Pais.getText(),TextF_Alias.getText(),Integer.parseInt(TextF_Edad.getText()));                       
            
        } catch (SQLException ex) {
            Logger.getLogger(interfazInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_Button_InsertActionPerformed

    private void Button_BorradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BorradoActionPerformed
        // TODO add your handling code here:
        TextF_IdInterprete.setText("");
        TextF_Nombre_Interprete.setText("");
        TextF_Apellido_Interprete.setText("");
        TextF_Pais.setText("");
        TextF_Alias.setText("");
        TextF_Edad.setText("");
    }//GEN-LAST:event_Button_BorradoActionPerformed

    private void Button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_deleteActionPerformed
            
        try {
            //System.out.println(Cb_Busqueda.getItemAt(Cb_Busqueda.getSelectedIndex())+" "+ Text_Busqueda.getText());
            bacEnd.deleteInterprete(Cb_Busqueda.getItemAt(Cb_Busqueda.getSelectedIndex()), Text_Busqueda.getText());
        } catch (SQLException ex) {
            Logger.getLogger(interfazInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Button_deleteActionPerformed

    private void Button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_buscarActionPerformed
        try {
            System.out.println(Text_Busqueda.getText());
            bacEnd.Buscar(Cb_Busqueda.getItemAt(Cb_Busqueda.getSelectedIndex()), TablaResult, Text_Busqueda.getText());
            //System.out.println(Cb_Busqueda.getItemAt(Cb_Busqueda.getSelectedIndex()));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(interfazInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Button_buscarActionPerformed

    private void NewInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewInsertActionPerformed
        // TODO add your handling code here:
        TextF_IdInterprete.setText("");
        TextF_Nombre_Interprete.setText("");
        TextF_Apellido_Interprete.setText("");
        TextF_Pais.setText("");
        TextF_Alias.setText("");
        TextF_Edad.setText("");
        
        Button_Borrado.setVisible(true);
        Button_Insert.setVisible(true);
         Button_Mostar.setVisible(true);
        
        Button_delete.setVisible(false);
        Button_buscar.setVisible(false);
        Button_Update.setVisible(false);
        
        Cb_Busqueda.setVisible(false);        
        TablaResult.setVisible(true);
        Text_Busqueda.setVisible(false);
        
        TextF_IdInterprete.setEnabled(true);
        TextF_Nombre_Interprete.setEnabled(true);
        TextF_Apellido_Interprete.setEnabled(true);
        TextF_Pais.setEnabled(true);
        TextF_Alias.setEnabled(true);
        TextF_Edad.setEnabled(true);
    }//GEN-LAST:event_NewInsertActionPerformed

    private void SearchRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRecordActionPerformed
        // TODO add your handling code here:
        Text_Busqueda.setText("");
        TextF_IdInterprete.setText("");
        TextF_Nombre_Interprete.setText("");
        TextF_Apellido_Interprete.setText("");
        TextF_Pais.setText("");
        TextF_Alias.setText("");
        TextF_Edad.setText("");
        Button_Insert.setVisible(false);
        Button_delete.setVisible(false);
        Button_Borrado.setVisible(false);
        Button_buscar.setVisible(true);
        Button_Update.setVisible(false);
         Button_Mostar.setVisible(false);
        
        Cb_Busqueda.setVisible(true);        
        TablaResult.setVisible(true);
        Text_Busqueda.setVisible(true);
        
        TextF_IdInterprete.setEnabled(false);
        TextF_Nombre_Interprete.setEnabled(false);
        TextF_Apellido_Interprete.setEnabled(false);
        TextF_Pais.setEnabled(false);
        TextF_Alias.setEnabled(false);
        TextF_Edad.setEnabled(false);
        
        
    }//GEN-LAST:event_SearchRecordActionPerformed

    private void DeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRecordActionPerformed
        // TODO add your handling code here:
        Button_delete.setVisible(true);
         Button_Mostar.setVisible(true);
        
        Cb_Busqueda.setVisible(true);        
        TablaResult.setVisible(true);
        Text_Busqueda.setVisible(true);
        
        Button_Borrado.setVisible(false);
        Button_Insert.setVisible(false);
        Button_buscar.setVisible(false);
        Button_Update.setVisible(false);
        
        TextF_IdInterprete.setEnabled(false);
        TextF_Nombre_Interprete.setEnabled(false);
        TextF_Apellido_Interprete.setEnabled(false);
        TextF_Pais.setEnabled(false);
        TextF_Alias.setEnabled(false);
        TextF_Edad.setEnabled(false);
        Text_Busqueda.setText("");
        TextF_IdInterprete.setText("");
        TextF_Nombre_Interprete.setText("");
        TextF_Apellido_Interprete.setText("");
        TextF_Pais.setText("");
        TextF_Alias.setText("");
        TextF_Edad.setText("");
        
    }//GEN-LAST:event_DeleteRecordActionPerformed

    private void TextF_IdInterpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextF_IdInterpreteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextF_IdInterpreteActionPerformed

    private void TablaResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaResultMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            Button_Update.setVisible(true);        
            Button_Borrado.setVisible(false);
            Button_Insert.setVisible(false);
            Button_buscar.setVisible(false);
            Button_delete.setVisible(false);        
            Button_Mostar.setVisible(false);
        
            TextF_IdInterprete.setEnabled(false);
            TextF_Nombre_Interprete.setEnabled(true);
            TextF_Apellido_Interprete.setEnabled(true);
            TextF_Pais.setEnabled(true);
            TextF_Alias.setEnabled(true);
            TextF_Edad.setEnabled(true);
            for (int i = 0; i < TablaResult.getRowCount(); i++) {
                TextF_IdInterprete.setText(TablaResult.getValueAt(i, 0).toString());
                TextF_Nombre_Interprete.setText(TablaResult.getValueAt(i, 1).toString());
                TextF_Apellido_Interprete.setText(TablaResult.getValueAt(i, 2).toString());
                TextF_Pais.setText(TablaResult.getValueAt(i, 3).toString());
                TextF_Alias.setText(TablaResult.getValueAt(i, 4).toString());
                TextF_Edad.setText(TablaResult.getValueAt(i, 5).toString());
                //TextF_IdInterprete.setText(TablaResult.getValueAt(i, 5).toString());
            }
            System.out.println("Double Click");
         }        
    }//GEN-LAST:event_TablaResultMouseClicked

    private void Button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpdateActionPerformed
        try {
            // TODO add your handling code here:
            bacEnd.Actualizar(Cb_Busqueda.getItemAt(Cb_Busqueda.getSelectedIndex()), Text_Busqueda.getText(), TextF_Nombre_Interprete.getText(), TextF_Apellido_Interprete.getText(), TextF_Pais.getText(), TextF_Alias.getText(), Integer.parseInt(TextF_Edad.getText()));            
        } catch (SQLException ex) {
            Logger.getLogger(interfazInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Button_UpdateActionPerformed

    private void Button_MostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MostarActionPerformed
        try {
            // TODO add your handling code here:
            bacEnd.MostrarData(TablaResult);
        } catch (SQLException ex) {
            Logger.getLogger(interfazInterprete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_MostarActionPerformed

    private void TextF_AliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextF_AliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextF_AliasActionPerformed

    private void TextF_IdInterpreteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextF_IdInterpreteMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TextF_IdInterpreteMouseClicked

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
            java.util.logging.Logger.getLogger(interfazInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazInterprete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new interfazInterprete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Borrado;
    private javax.swing.JButton Button_Insert;
    private javax.swing.JButton Button_Mostar;
    private javax.swing.JButton Button_Update;
    private javax.swing.JButton Button_buscar;
    private javax.swing.JButton Button_delete;
    private javax.swing.JComboBox<String> Cb_Busqueda;
    private javax.swing.JMenuItem DeleteRecord;
    private javax.swing.JMenuItem NewInsert;
    private javax.swing.JMenuItem SearchRecord;
    private javax.swing.JTable TablaResult;
    private javax.swing.JTextField TextF_Alias;
    private javax.swing.JTextField TextF_Apellido_Interprete;
    private javax.swing.JTextField TextF_Edad;
    private javax.swing.JTextField TextF_IdInterprete;
    private javax.swing.JTextField TextF_Nombre_Interprete;
    private javax.swing.JTextField TextF_Pais;
    private javax.swing.JTextField Text_Busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
