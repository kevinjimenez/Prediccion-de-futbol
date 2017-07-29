/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BackEnd.Back_End;
import FrontEnd.interfazInterprete;
import java.sql.SQLException;

/**
 *
 * @author KEVIN
 */
public class Aplicacion {
    
    public static void main(String[] args) throws SQLException {
        interfazInterprete p = new interfazInterprete();
        p.setVisible(true);
        
        
    }
    
}
