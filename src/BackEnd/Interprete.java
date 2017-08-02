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
public class Interprete {
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBConexion conexion = new DBConexion();
    String insert,delete="",update="",search="",mostar;
    DefaultTableModel modeloTabla;
    
    
    
    public void InsertaDatosInterprete(int ID, String Nombre,String Apellido, String Pais, String Alias, int Edad) throws SQLException{
        
        insert = "insert into INTERPRETE(ID_INTERPRETE,NOMBRE_INTERPRETE,APELLIDO_INTERPRETE,LUGAR,ALIAS,EDAD) values(?,?,?,?,?,?)";
        stm = conexion.getConexion().prepareStatement(insert);
        stm.setInt(1, ID);
        stm.setString(2, Nombre);
        stm.setString(3, Apellido);
        stm.setString(4, Pais);
        stm.setString(5, Alias);
        stm.setInt(6, Edad);
        stm.executeUpdate();
        
        //conexion.Desconectar();
        JOptionPane.showMessageDialog(null, "INSERTADO INTERPRETE CORRECTAMENRE");
        
    }
    
    public void deleteInterprete(String Item, String valorEliminado) throws SQLException{       
        if(Item.equals("ID")){            
            delete = "delete from interprete where ID_INTERPRETE=?";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.setInt(1, Integer.parseInt(valorEliminado));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }        
        if(Item.equals("Nombre Interprete")){
            delete = "delete from interprete where Nombre_Interprete like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Apellido Interprete")){
            delete = "delete from interprete where Apellido_Interprete like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Apellido Interprete")){
            delete = "delete from interprete where Apellido_Interprete like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Pais")){
            delete = "delete from interprete where Lugar like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Alias")){
            delete = "delete from interprete where Alias like '%"+valorEliminado+"%'";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }
        if(Item.equals("Edad")){
            delete = "delete from interprete where Edad=?";
            stm=conexion.getConexion().prepareStatement(delete);        
            stm.setInt(1, Integer.parseInt(valorEliminado));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ELIMINADO");
        }              
    }
    
    public void Buscar(String Item, JTable tablaResultados, String valorBuscar ) throws SQLException{
        String [] columnas = {"ID", "NOMBRE INTERPRETE","APELLIDO INTERPRETE","LUGAR","ALIAS","EDAD"};
        String [] registro = new String[6];                       
        modeloTabla = new DefaultTableModel(null,columnas){
            @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }};
        if(Item.equals("ID")){            
            search="Select * from Interprete where id_interprete = ? ";        
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
        if(Item.equals("Nombre Interprete")){            
            search="Select * from Interprete where Nombre_Interprete like '%"+valorBuscar+"%' ORDER BY id_interprete ASC";        
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
        if(Item.equals("Apellido Interprete")){            
            search="Select * from Interprete where Apellido_Interprete like '%"+valorBuscar+"%' ORDER BY id_interprete ASC";        
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
        if(Item.equals("Pais")){            
            search="Select * from Interprete where Lugar like '%"+valorBuscar+"%' ORDER BY id_interprete ASC";        
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
        if(Item.equals("Alias")){            
            search="Select * from Interprete where Alias like '%"+valorBuscar+"%' ORDER BY id_interprete ASC";        
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
        if(Item.equals("Edad")){            
            search="Select * from Interprete where Edad =? ORDER BY id_interprete ASC";        
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
    
    public void Actualizar(String Item, String valorActualizar, String Nombre,String Apellido, String Pais, String Alias, int Edad) throws SQLException{
        
        if(Item.equals("ID")){
            System.out.println("1");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete = ?, Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where ID_INTERPRETE=?";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);
            stm.setInt(6, Integer.parseInt(valorActualizar));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Nombre Interprete")){
            System.out.println("2");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete=?, Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where Nombre_Interprete like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Apellido Interprete")){
            System.out.println("3");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete = ?, Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where Apellido_interprete like '%"+valorActualizar+"%'";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);            
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Pais")){
            System.out.println("4");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete=?, Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where Lugar=?";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);
            stm.setString(6, valorActualizar);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Alias")){
            System.out.println("5");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete=?,Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where alias=?";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);
            stm.setString(6, valorActualizar);
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
        if(Item.equals("Edad")){
            System.out.println("6");
            System.out.println(valorActualizar);
            update = "update interprete set Nombre_interprete=?, Apellido_interprete = ?, Lugar=?, Alias=?, Edad=? where edad=?";
            stm=conexion.getConexion().prepareStatement(update);   
            stm.setString(1, Nombre);
            stm.setString(2, Apellido);
            stm.setString(3, Pais);
            stm.setString(4, Alias);
            stm.setInt(5, Edad);
            stm.setInt(6, Integer.parseInt(valorActualizar));
            stm.executeUpdate();  
            JOptionPane.showMessageDialog(null, "ACTUALIZADO");
        }
    }
    
    public void MostrarDataInterprete(JTable dataTable) throws SQLException{
        String [] columnas = {"ID", "NOMBRE INTERPRETE","APELLIDO INTERPRETE","LUGAR","ALIAS","EDAD"};
        String [] registros = new String[6];        
        modeloTabla = new DefaultTableModel(null,columnas){
        @Override
                public boolean isCellEditable(int row, int col)
                {
                    return false;
                }
        };
        mostar="Select * from Interprete ORDER BY id_interprete ASC";        
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
    
    
}
