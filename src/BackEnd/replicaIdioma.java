/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Conexion.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEVIN
 */
public class replicaIdioma {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    public void MostrarDataIdioma(JTable dataTable) throws SQLException{
        String [] columnas = {"ID IDIOMA", "IDIOMA","LUGAR"};
        String [] registros = new String[3];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from viewIdioma ORDER BY id_idioma ASC";        
        stm=conexion.getConexion().prepareStatement(mostar);                
        rs = stm.executeQuery();  
        while (rs.next()) {                        
                registros[0]=rs.getString(1);
                registros[1]=rs.getString(2);                
                registros[2]=rs.getString(3);
                modeloTabla.addRow(registros);                
        }
        dataTable.setModel(modeloTabla);        
    }
    
    public void buscarIdioma(String Item, JTable tablaResultados, String valorBuscar) throws SQLException{
        String [] columnas = {"ID IDIOMA", "IDIOMA","LUGAR"};
        String [] registro = new String[3];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        
        if(Item.equals("Idioma")){            
            search="Select * from viewIdioma where Idioma like '%"+valorBuscar+"%' ORDER BY id_idioma ASC";        
            stm=conexion.getConexion().prepareStatement(search);                   
            rs = stm.executeQuery();                  
            while (rs.next()) {                        
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);              
                registro[2]=rs.getString(3);
                modeloTabla.addRow(registro);
            }
            //JOptionPane.showMessageDialog(null, "NO EXISTE");
            
            tablaResultados.setModel(modeloTabla);
        }
    }
    
}
