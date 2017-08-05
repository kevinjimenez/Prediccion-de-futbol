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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEVIN
 */
public class Cancion {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    public void InsertCancion(int idCancion,int idAlbum,int idGenero,int idIdioma, String nombreCancion,int duracionCancion) throws SQLException{
        
        insert = "insert into CANCION(ID_CANCIONES,ID_ALBUM,ID_GENERO,ID_IDIOMA,NOMBRE_CANCION,DURACION) values(?,?,?,?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idCancion);
        stm.setInt(2, idAlbum);
        stm.setInt(3, idGenero);
        stm.setInt(4, idIdioma);
        stm.setString(5, nombreCancion);
        stm.setInt(6, duracionCancion);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "INSERTADO INTERPRETE CORRECTAMENRE");
        
    }
    
    public void MostrarCancion(JTable dataTable) throws SQLException{
        String [] columnas = {"ID CANCION", "ID ALBUM","ID GENERO","ID IDIOMA","CANCION","DURACION (min)"};
        String [] registros = new String[6];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from Cancion ORDER BY id_canciones ASC";        
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
    
    public void BuscarCancion(String Item, JTable tablaResultados, String valorBuscar ) throws SQLException{
        String [] columnas = {"ID CANCION", "ID ALBUM","ID GENERO","ID IDIOMA","CANCION","DURACION (min)"};
        String [] registro = new String[6];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        
        if(Item.equals("Cancion")){            
            search="Select * from Cancion where Nombre_Cancion like '%"+valorBuscar+"%' ORDER BY id_canciones ASC";        
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
        if(Item.equals("Duracion")){      
            isNumber(valorBuscar);
            search="Select * from Cancion where duracion =? ORDER BY id_canciones ASC";        
            stm=conexion.getConexion().prepareStatement(search);     
            stm.setInt(1, Integer.parseInt(valorBuscar));
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
    
    public void ActualizarCancion(String Item, String valorActualizar, String nombreCancion,int duracionCancion) throws SQLException{
        
        if(Item.equals("Cancion")){
            System.out.println("2");
            System.out.println(valorActualizar);
            update = "update cancion set Nombre_cancion=?, duracion = ? where Nombre_Cancion like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, nombreCancion);
            stm.setInt(2, duracionCancion);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Duracion")){            
            System.out.println("3");
            System.out.println(valorActualizar);
            update = "update cancion set Nombre_cancion = ?, duracion = ? where duracion =?";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, nombreCancion);
            stm.setInt(2, duracionCancion);
            stm.setInt(3, Integer.parseInt(valorActualizar));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
    }
    
    public void deleteCancion(String Item, String valorEliminado) throws SQLException{                    
        if(Item.equals("Cancion")){
            delete = "delete from cancion where Nombre_cancion like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Duracion")){
            delete = "delete from cancion where duracion = ?";
            stm=conexion.getConexion().prepareStatement(delete);
            stm.setInt(1, Integer.parseInt(valorEliminado));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }              
    }
    
    private static boolean isNumber(String id){
        try {
            Integer.parseInt(id);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    
    
    
}
