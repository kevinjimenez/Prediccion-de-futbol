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
public class Album {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    public void insertAlbum(int idAlbum, int idInterprete,int idDisquera, String nameAlbum, String lugarGrabacion, String fecha) throws SQLException, ParseException{                
        insert = "insert into ALBUM(ID_ALBUM ,ID_INTERPRETE,ID_DISQUERA, NOMBRE_ALBUM, LUGAR, ANIO_LANZAMIENTO) values(?,?,?,?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idAlbum);
        stm.setInt(2, idInterprete);
        stm.setInt(3, idDisquera);
        stm.setString(4, nameAlbum);
        stm.setString(5, lugarGrabacion);
        stm.setString(6, fecha);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "ALBUM AGREGADO CORRECTAMENTE");
        
    }

    public void MostrarDataAlbum(JTable dataTable) throws SQLException{
        String [] columnas = {"ID ALBUM", "ID INTERPRETE","ID DISQUERA", "NOMBRE ALBUM","LUGAR DE GRABACION","AÑO DE LANZAMIENTO"};
        String [] registros = new String[6];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from Album ORDER BY id_album ASC";        
        stm=conexion.getConexion().prepareStatement(mostar);                
        rs = stm.executeQuery();  
        while (rs.next()) {                        
                registros[0]=rs.getString(1);
                registros[1]=rs.getString(2);
                registros[2]=rs.getString(3);
                registros[3]=rs.getString(4);
                registros[4]=rs.getString(5);
                registros[5]=rs.getString(6);
                modeloTabla.addRow(registros);                
        }
        dataTable.setModel(modeloTabla);        
    }
    
    public void deleteAlbum(String Item, String valorEliminado) throws SQLException{                       
        //System.out.println("khe: "+valorEliminado);
        if(Item.equals("Nombre Album")){
            delete = "delete from album where Nombre_Album like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Lugar Grabacion")){
            delete = "delete from album where Lugar like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Año de Grabacion")){
            delete = "delete from album where Anio_Lanzamiento like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }              
    } 
    
    public void buscarAlbum(String Item, JTable tablaResultados, String valorBuscar ) throws SQLException{
        String [] columnas = {"ID ALBUM", "ID INTERPRETE","ID DISQUERA", "NOMBRE ALBUM","LUGAR","AÑO DE LANZAMIENTO"};
        String [] registro = new String[6];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        
        if(Item.equals("Nombre Album")){            
            search="Select * from Album where Nombre_Album like '%"+valorBuscar+"%' ORDER BY id_Album ASC";        
            stm=conexion.getConexion().prepareStatement(search);                   
            rs = stm.executeQuery();                  
            while (rs.next()) {                        
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);    
                registro[5]=rs.getString(6);
                modeloTabla.addRow(registro);
            }
            //JOptionPane.showMessageDialog(null, "NO EXISTE");
            
            tablaResultados.setModel(modeloTabla);
        }
        if(Item.equals("Lugar Grabacion")){            
            search="Select * from Album where Lugar like '%"+valorBuscar+"%' ORDER BY id_Album ASC";        
            stm=conexion.getConexion().prepareStatement(search);                   
            rs = stm.executeQuery();                  
            while (rs.next()) {                        
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);                                                
                registro[5]=rs.getString(6);
                modeloTabla.addRow(registro);
            }
            //JOptionPane.showMessageDialog(null, "NO EXISTE");
            
            tablaResultados.setModel(modeloTabla);
        }
        if(Item.equals("Año de Grabacion")){            
            search="Select * from Album where Anio_Lanzamiento like '%"+valorBuscar+"%' ORDER BY id_Album ASC";        
            stm=conexion.getConexion().prepareStatement(search);                   
            rs = stm.executeQuery();                  
            while (rs.next()) {                        
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);                
                modeloTabla.addRow(registro);
            }
            //JOptionPane.showMessageDialog(null, "NO EXISTE");
            
            tablaResultados.setModel(modeloTabla);
        }
    }
    
    public void updateAlbum(String Item, String valorActualizar, String nameAlbum, String lugarGrabacion, String fecha) throws SQLException{
                
        if(Item.equals("Nombre Album")){
            System.out.println("2");
            System.out.println(valorActualizar);
            update = "update album set Nombre_Album=?, Lugar = ?, Anio_Lanzamiento=? where Nombre_Album like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, nameAlbum);
            stm.setString(2, lugarGrabacion);
            stm.setString(3, fecha);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Lugar Grabacion")){
            System.out.println("3");
            System.out.println(valorActualizar);
            update = "update album set Nombre_Album=?, Lugar = ?, Anio_Lanzamiento=? where Lugar like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, nameAlbum);
            stm.setString(2, lugarGrabacion);
            stm.setString(3, fecha);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Año de Grabacion")){
            System.out.println("4");
            System.out.println(valorActualizar);
            update = "update album set Nombre_Album=?, Lugar = ?, Anio_Lanzamiento=? where Anio_Lanzamiento like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, nameAlbum);
            stm.setString(2, lugarGrabacion);
            stm.setString(3, fecha);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
    }
    
    private boolean isNumber(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
