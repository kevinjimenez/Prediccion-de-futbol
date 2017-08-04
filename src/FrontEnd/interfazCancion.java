/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.Cancion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN
 */
public class interfazCancion extends javax.swing.JFrame {

    Cancion back_endCancion;
    /**
     * Creates new form interfazCancion
     */
    public interfazCancion() {
        initComponents();
        back_endCancion=new Cancion();
        //botones
        btn_actualizarCancion.setVisible(false);
        btn_buscarCancion.setVisible(false);
        btn_eliminarCancion.setVisible(false);
        btn_insertCancion.setVisible(false);
        btn_limpiarCancion.setVisible(false);
        btn_mostarDatosCancion.setVisible(false);
        //tabla
        Table_cancion.setVisible(false);
        //combo
        CB_optionsCancion.setVisible(false);
        //textfiel
        Txt_idAlbum.setEnabled(false);
        Txt_idGenero.setEnabled(false);
        Txt_idIdioma.setEnabled(false);
        txt_idCancion.setEnabled(false);
        txt_duracion.setEnabled(false);
        txt_nameCancion.setEnabled(false);
        txt_buscadoCancion.setVisible(false);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idCancion = new javax.swing.JTextField();
        Txt_idAlbum = new javax.swing.JTextField();
        Txt_idGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nameCancion = new javax.swing.JTextField();
        txt_duracion = new javax.swing.JTextField();
        btn_insertCancion = new javax.swing.JButton();
        btn_mostarDatosCancion = new javax.swing.JButton();
        btn_limpiarCancion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Txt_idIdioma = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_cancion = new javax.swing.JTable();
        CB_optionsCancion = new javax.swing.JComboBox<>();
        txt_buscadoCancion = new javax.swing.JTextField();
        btn_buscarCancion = new javax.swing.JButton();
        btn_eliminarCancion = new javax.swing.JButton();
        btn_actualizarCancion = new javax.swing.JButton();
        btn_regresarmain = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_nuevaCancion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Menu_buscarCancion = new javax.swing.JMenuItem();
        Menu_eliminarCancion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Informacion Cancion");

        jLabel2.setText("Id Cancion");

        jLabel3.setText("Id_Album");

        jLabel4.setText("Id_Genero");

        jLabel5.setText("Nombre Cancion");

        jLabel6.setText("Duracion");

        btn_insertCancion.setText("Insertar");
        btn_insertCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertCancionActionPerformed(evt);
            }
        });

        btn_mostarDatosCancion.setText("Mostrsr Datos");
        btn_mostarDatosCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostarDatosCancionActionPerformed(evt);
            }
        });

        btn_limpiarCancion.setText("Limpiar");
        btn_limpiarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarCancionActionPerformed(evt);
            }
        });

        jLabel7.setText("Id_Idioma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(35, 35, 35)
                                        .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(35, 35, 35)
                                        .addComponent(txt_nameCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Txt_idAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                            .addComponent(txt_idCancion)
                                            .addComponent(Txt_idGenero)
                                            .addComponent(Txt_idIdioma)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(jLabel1))
                                    .addComponent(btn_limpiarCancion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_insertCancion)
                            .addComponent(btn_mostarDatosCancion, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nameCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insertCancion)
                    .addComponent(Txt_idAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_idGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txt_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mostarDatosCancion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Txt_idIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_limpiarCancion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table_cancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_cancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_cancionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_cancion);

        CB_optionsCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancion", "Duracion" }));

        btn_buscarCancion.setText("Buscar");
        btn_buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCancionActionPerformed(evt);
            }
        });

        btn_eliminarCancion.setText("Eliminar");
        btn_eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCancionActionPerformed(evt);
            }
        });

        btn_actualizarCancion.setText("Actualizar");
        btn_actualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarCancionActionPerformed(evt);
            }
        });

        btn_regresarmain.setText("Regresar");
        btn_regresarmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarmainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminarCancion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CB_optionsCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txt_buscadoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(btn_buscarCancion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_actualizarCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_regresarmain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_optionsCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscadoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCancion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminarCancion)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizarCancion)
                    .addComponent(btn_regresarmain))
                .addGap(12, 12, 12))
        );

        jMenu1.setText("File");

        Menu_nuevaCancion.setText("Nueva Cancion");
        Menu_nuevaCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_nuevaCancionActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_nuevaCancion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        Menu_buscarCancion.setText("Buscar Cancion");
        Menu_buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_buscarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_buscarCancion);

        Menu_eliminarCancion.setText("Eliminar Cancion");
        Menu_eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_eliminarCancionActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_eliminarCancion);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertCancionActionPerformed
        try {
            // TODO add your handling code here:
            if((txt_idCancion.getText().length()==0)||(Txt_idAlbum.getText().length()==0)||(Txt_idGenero.getText().length()==0)||(Txt_idIdioma.getText().length()==0)||(txt_nameCancion.getText().length()==0)||(txt_duracion.getText().length()==0)){
                JOptionPane.showMessageDialog(null, "falta llenar campos");
            }else{
                back_endCancion.InsertCancion(Integer.parseInt(txt_idCancion.getText()), Integer.parseInt(Txt_idAlbum.getText()), Integer.parseInt(Txt_idGenero.getText()), Integer.parseInt(Txt_idIdioma.getText()), txt_nameCancion.getText(), Integer.parseInt(txt_duracion.getText()));
                Table_cancion.setVisible(false);
            }            
        } catch (SQLException ex) {
            //Logger.getLogger(interfazCancion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_insertCancionActionPerformed

    private void btn_limpiarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCancionActionPerformed
        // TODO add your handling code here:
        txt_idCancion.setText("");
        Txt_idAlbum.setText("");
        Txt_idGenero.setText("");
        Txt_idIdioma.setText("");
        txt_nameCancion.setText("");
        txt_duracion.setText("");
        Table_cancion.setVisible(false);
    }//GEN-LAST:event_btn_limpiarCancionActionPerformed

    private void btn_mostarDatosCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostarDatosCancionActionPerformed
        try {
            // TODO add your handling code here:
            back_endCancion.MostrarCancion(Table_cancion);
            Table_cancion.setVisible(true);
        } catch (SQLException ex) {
            //Logger.getLogger(interfazCancion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_mostarDatosCancionActionPerformed

    private void btn_buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCancionActionPerformed
        try {
            // TODO add your handling code here:
            if (txt_buscadoCancion.getText().length()==0) {
                JOptionPane.showMessageDialog(null, "Ingrese dato a buscar");
            }else{
                back_endCancion.BuscarCancion(CB_optionsCancion.getItemAt(CB_optionsCancion.getSelectedIndex()), Table_cancion, txt_buscadoCancion.getText());
                Table_cancion.setVisible(true);
            }            
        } catch (SQLException ex) {
            //Logger.getLogger(interfazCancion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_buscarCancionActionPerformed

    private void btn_eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCancionActionPerformed
        try {
            // TODO add your handling code here:
            if (txt_buscadoCancion.getText().length()==0) {
                JOptionPane.showMessageDialog(null, "Ingrese dato a eliminar");
            }else{                
                back_endCancion.deleteCancion(CB_optionsCancion.getItemAt(CB_optionsCancion.getSelectedIndex()), txt_buscadoCancion.getText());
                btn_mostarDatosCancion.setVisible(true);
                txt_buscadoCancion.setText("");
            }            
        } catch (SQLException ex) {
            //Logger.getLogger(interfazCancion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_eliminarCancionActionPerformed

    private void Table_cancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_cancionMouseClicked
        // TODO add your handling code here:                
        if (evt.getClickCount()==2) {
        //botones
            btn_actualizarCancion.setVisible(true);
            btn_buscarCancion.setVisible(true);
            btn_eliminarCancion.setVisible(false);
            btn_insertCancion.setVisible(false);
            btn_limpiarCancion.setVisible(false);
            btn_mostarDatosCancion.setVisible(false);
        //tabla
            Table_cancion.setVisible(false);
        //combo
            CB_optionsCancion.setVisible(true);
        //textfiel
            Txt_idAlbum.setEnabled(false);
            Txt_idGenero.setEnabled(false);
            Txt_idIdioma.setEnabled(false);
            txt_idCancion.setEnabled(false);
            txt_duracion.setEnabled(true);
            txt_nameCancion.setEnabled(true);
            txt_buscadoCancion.setVisible(true);
            for (int i = 0; i < Table_cancion.getRowCount(); i++) {
                txt_idCancion.setText(Table_cancion.getValueAt(i, 0).toString());
                Txt_idAlbum.setText(Table_cancion.getValueAt(i, 1).toString());
                Txt_idGenero.setText(Table_cancion.getValueAt(i, 2).toString());
                Txt_idIdioma.setText(Table_cancion.getValueAt(i, 3).toString());
                txt_nameCancion.setText(Table_cancion.getValueAt(i, 4).toString());
                txt_duracion.setText(Table_cancion.getValueAt(i, 5).toString());
            }
        }
    }//GEN-LAST:event_Table_cancionMouseClicked

    private void btn_actualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarCancionActionPerformed
        try {
            // TODO add your handling code here:
            if ((txt_buscadoCancion.getText().length()==0)||(txt_idCancion.getText().length()==0)||(Txt_idAlbum.getText().length()==0)||(Txt_idGenero.getText().length()==0)||(Txt_idIdioma.getText().length()==0)||(txt_nameCancion.getText().length()==0)||(txt_duracion.getText().length()==0)    ) {
                JOptionPane.showMessageDialog(null, "falta dato por ingresar");
            }else{
                back_endCancion.ActualizarCancion(CB_optionsCancion.getItemAt(CB_optionsCancion.getSelectedIndex()), txt_buscadoCancion.getText(), txt_nameCancion.getText(), Integer.parseInt(txt_duracion.getText()));                
                txt_idCancion.setText("");
                Txt_idAlbum.setText("");
                Txt_idGenero.setText("");
                Txt_idIdioma.setText("");
                txt_nameCancion.setText("");
                txt_duracion.setText("");
                txt_buscadoCancion.setText("");
                btn_mostarDatosCancion.setVisible(true);
            }            
        } catch (SQLException ex) {
            //Logger.getLogger(interfazCancion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_actualizarCancionActionPerformed

    private void Menu_nuevaCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_nuevaCancionActionPerformed
        // TODO add your handling code here:
        txt_idCancion.setText("");
        Txt_idAlbum.setText("");
        Txt_idGenero.setText("");
        Txt_idIdioma.setText("");
        txt_nameCancion.setText("");
        txt_duracion.setText("");
        txt_buscadoCancion.setText("");
         //botones
        btn_actualizarCancion.setVisible(false);
        btn_buscarCancion.setVisible(false);
        btn_eliminarCancion.setVisible(false);
        btn_insertCancion.setVisible(true);
        btn_limpiarCancion.setVisible(true);
        btn_mostarDatosCancion.setVisible(true);
        //tabla
        Table_cancion.setVisible(false);
        //combo
        CB_optionsCancion.setVisible(false);
        //textfiel
        Txt_idAlbum.setEnabled(true);
        Txt_idGenero.setEnabled(true);
        Txt_idIdioma.setEnabled(true);
        txt_idCancion.setEnabled(true);
        txt_duracion.setEnabled(true);
        txt_nameCancion.setEnabled(true);
        txt_buscadoCancion.setVisible(false);
        
    }//GEN-LAST:event_Menu_nuevaCancionActionPerformed

    private void Menu_buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_buscarCancionActionPerformed
        // TODO add your handling code here:
        txt_idCancion.setText("");
        Txt_idAlbum.setText("");
        Txt_idGenero.setText("");
        Txt_idIdioma.setText("");
        txt_nameCancion.setText("");
        txt_duracion.setText("");
        txt_buscadoCancion.setText("");
         //botones         
        btn_actualizarCancion.setVisible(false);
        btn_buscarCancion.setVisible(true);
        btn_eliminarCancion.setVisible(false);
        btn_insertCancion.setVisible(false);
        btn_limpiarCancion.setVisible(false);
        btn_mostarDatosCancion.setVisible(false);
        //tabla
        Table_cancion.setVisible(false);
        //combo
        CB_optionsCancion.setVisible(true);
        //textfiel
        Txt_idAlbum.setEnabled(false);
        Txt_idGenero.setEnabled(false);
        Txt_idIdioma.setEnabled(false);
        txt_idCancion.setEnabled(false);
        txt_duracion.setEnabled(false);
        txt_nameCancion.setEnabled(false);
        txt_buscadoCancion.setVisible(true);
        
    }//GEN-LAST:event_Menu_buscarCancionActionPerformed

    private void Menu_eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_eliminarCancionActionPerformed
        // TODO add your handling code here:
        txt_idCancion.setText("");
        Txt_idAlbum.setText("");
        Txt_idGenero.setText("");
        Txt_idIdioma.setText("");
        txt_nameCancion.setText("");
        txt_duracion.setText("");
        txt_buscadoCancion.setText("");
         //botones
        btn_actualizarCancion.setVisible(false);
        btn_buscarCancion.setVisible(false);
        btn_eliminarCancion.setVisible(true);
        btn_insertCancion.setVisible(false);
        btn_limpiarCancion.setVisible(false);
        btn_mostarDatosCancion.setVisible(false);
        //tabla
        Table_cancion.setVisible(false);
        //combo
        CB_optionsCancion.setVisible(true);
        //textfiel
        Txt_idAlbum.setEnabled(false);
        Txt_idGenero.setEnabled(false);
        Txt_idIdioma.setEnabled(false);
        txt_idCancion.setEnabled(false);
        txt_duracion.setEnabled(false);
        txt_nameCancion.setEnabled(false);
        txt_buscadoCancion.setVisible(true);
        
    }//GEN-LAST:event_Menu_eliminarCancionActionPerformed

    private void btn_regresarmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarmainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new interfazPrincipal().setVisible(true);
    }//GEN-LAST:event_btn_regresarmainActionPerformed

    
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
            java.util.logging.Logger.getLogger(interfazCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazCancion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_optionsCancion;
    private javax.swing.JMenuItem Menu_buscarCancion;
    private javax.swing.JMenuItem Menu_eliminarCancion;
    private javax.swing.JMenuItem Menu_nuevaCancion;
    private javax.swing.JTable Table_cancion;
    private javax.swing.JTextField Txt_idAlbum;
    private javax.swing.JTextField Txt_idGenero;
    private javax.swing.JTextField Txt_idIdioma;
    private javax.swing.JButton btn_actualizarCancion;
    private javax.swing.JButton btn_buscarCancion;
    private javax.swing.JButton btn_eliminarCancion;
    private javax.swing.JButton btn_insertCancion;
    private javax.swing.JButton btn_limpiarCancion;
    private javax.swing.JButton btn_mostarDatosCancion;
    private javax.swing.JButton btn_regresarmain;
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
    private javax.swing.JTextField txt_buscadoCancion;
    private javax.swing.JTextField txt_duracion;
    private javax.swing.JTextField txt_idCancion;
    private javax.swing.JTextField txt_nameCancion;
    // End of variables declaration//GEN-END:variables
}
