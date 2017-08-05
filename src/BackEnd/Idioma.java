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
public class Idioma {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    public void insertIdioma(int idIdioma, String idiomaCantado,String lugar) throws SQLException, ParseException{                
        insert = "insert into Idioma (ID_IDIOMA ,IDIOMA,LUGAR) values(?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idIdioma);
        stm.setString(2, idiomaCantado);
        stm.setString(3, lugar);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "IDIOMA AGREGADA CORRECTAMENTE");
        
    }
    
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
        mostar="Select * from Idioma ORDER BY id_idioma ASC";        
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
            search="Select * from Idioma where Idioma like '%"+valorBuscar+"%' ORDER BY id_idioma ASC";        
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
    
    public void deleteIdioma(String Item, String valorEliminado) throws SQLException{                       
        //System.out.println("khe: "+valorEliminado);
        if(Item.equals("Idioma")){
            delete = "delete from idioma where idioma like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }              
    } 
        
    public void updateIdioma(String Item, String valorActualizar, String setIdioma) throws SQLException{
                
        if(Item.equals("Idioma")){          
            update = "update Idioma set idioma=? where idioma like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, setIdioma);              
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
    }
    
}

