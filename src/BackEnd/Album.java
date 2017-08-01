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
    
    public void insertAlbum(int idAlbum, int idInterprete, String nameAlbum, String lugarGrabacion, String fecha) throws SQLException, ParseException{                
        insert = "insert into ALBUM(ID_ALBUM ,ID_INTERPRETE, NOMBRE_ALBUM, LUGAR_GRABACION, ANIO_LANZAMIENTO) values(?,?,?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, idAlbum);
        stm.setInt(2, idInterprete);
        stm.setString(3, nameAlbum);
        stm.setString(4, lugarGrabacion);
        stm.setString(5, fecha);
        stm.executeUpdate();
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "INSERTADO CORRECTAMENRE");
        
    }

    public void MostrarDataAlbum(JTable dataTable) throws SQLException{
        String [] columnas = {"ID ALBUM", "ID INTERPRETE", "NOMBRE ALBUM","LUGAR DE GRABACION","AÑO DE LANZAMIENTO"};
        String [] registros = new String[5];        
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
                modeloTabla.addRow(registros);                
        }
        dataTable.setModel(modeloTabla);        
    }
    
    
}
