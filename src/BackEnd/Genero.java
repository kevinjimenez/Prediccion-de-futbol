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
        JOptionPane.showMessageDialog(null, "INSERTADO Genero CORRECTAMENRE");        
    }
    
}
