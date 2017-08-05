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
public class Genero {
    
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    public void insertGenero(int idGenero, String tipoGenero, String descripcion) throws SQLException, ParseException{                
        insert = "insert into GENERO (ID_GENERO ,TIPO_GENERO, DESCRIPCION) values(?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idGenero);        
        stm.setString(2, tipoGenero);
        stm.setString(3, descripcion);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "GENERO AGREGADAO CORRECTAMENTE");        
    }
    
    public void MostrarDataGenero(JTable dataTable) throws SQLException{
        String [] columnas = {"ID GENERO", "TIPO GENERO", "DESCRIPCION"};
        String [] registros = new String[3];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from Genero ORDER BY id_genero ASC";        
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
    
    public void buscarGenero(String Item, JTable tablaResultados, String valorBuscar) throws SQLException{
        String [] columnas = {"ID GENERO", "TIPO GENERO", "DESCRIPCION"};
        String [] registro = new String[3];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        if(Item.equals("Genero")){            
            search="Select * from Genero where tipo_genero like '%"+valorBuscar+"%' ORDER BY id_genero ASC";        
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
        
        if(Item.equals("Descripcion del Genero")){            
            search="Select * from Genero where Descripcion like '%"+valorBuscar+"%' ORDER BY id_genero ASC";        
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
    
    public void deleteGenero(String Item, String valorEliminado) throws SQLException{                       
        //System.out.println("khe: "+valorEliminado);
        if(Item.equals("Genero")){
            delete = "delete from genero where tipo_genero like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Descripcion del Genero")){
            delete = "delete from genero where descripcion like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }              
    } 
    
    public void updateAlbum(String Item, String valorActualizar,String inputGenero,String descripcion) throws SQLException{
                
        if(Item.equals("Genero")){
            //System.out.println("2");
            //System.out.println(valorActualizar);
            update = "update genero set tipo_genero=?,descripcion=? where tipo_genero like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, inputGenero);
            stm.setString(2, descripcion);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Descripcion del Genero")){
            //System.out.println("2");
            //System.out.println(valorActualizar);
            update = "update genero set tipo_genero=?,descripcion=? where descripcion like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, inputGenero);
            stm.setString(2, descripcion);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
    }
}
