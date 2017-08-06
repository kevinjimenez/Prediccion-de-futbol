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
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEVIN
 */
public class Disquera {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
     public void insertDisquera(int idDisquera, String nombre) throws SQLException, ParseException{                
        insert = "insert into disquera (ID_DISQUERA ,NOMBRE_DISQUERA) values(?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idDisquera);        
        stm.setString(2, nombre);
        //stm.setString(3, descripcion);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "GENERO AGREGADAO CORRECTAMENTE");        
    }
     
     public void MostrarDataDisquera(JTable dataTable) throws SQLException{
        String [] columnas = {"ID DISQUERA", "NOMBRE DISQUERA"};
        String [] registros = new String[2];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from DISQUERA ORDER BY id_disquera ASC";        
        stm=conexion.getConexion().prepareStatement(mostar);                
        rs = stm.executeQuery();  
        while (rs.next()) {                        
                registros[0]=rs.getString(1);
                registros[1]=rs.getString(2);                
                modeloTabla.addRow(registros);                
        }
        dataTable.setModel(modeloTabla);        
    }
     
     public void buscarDisquera(String Item, JTable tablaResultados, String valorBuscar ) throws SQLException{
        String [] columnas = {"ID DISQUERA", "NOMBRE DISQUERA"};
        String [] registro = new String[2];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        
        if(Item.equals("Nombre Disquera")){            
            search="Select * from disquera where Nombre_disquera like '%"+valorBuscar+"%' ORDER BY id_disquera ASC";        
            stm=conexion.getConexion().prepareStatement(search);                   
            rs = stm.executeQuery();                  
            while (rs.next()) {                        
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);                
                modeloTabla.addRow(registro);
            }
            //JOptionPane.showMessageDialog(null, "NO EXISTE");
            
            tablaResultados.setModel(modeloTabla);
        }
        
    }
     
     public void deleteDisquera(String Item, String valorEliminado) throws SQLException{                       
        //System.out.println("khe: "+valorEliminado);
        if(Item.equals("Nombre Disquera")){
            delete = "delete from disquera where Nombre_disquera like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        
    } 
     
     public void updateDisquera(String Item, String valorActualizar, String name) throws SQLException{
                
        if(Item.equals("Nombre Disquera")){
            System.out.println("2");
            System.out.println(valorActualizar);
            update = "update disquera set Nombre_disquera=? where Nombre_disquera like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, name);
            
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        
    }
}
