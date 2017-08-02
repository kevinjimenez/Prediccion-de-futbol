/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import FrontEnd.interfazPrincipal;
import java.sql.SQLException;

/**
 *
 * @author KEVIN
 */
public class Aplicacion {
    
    public static void main(String[] args) throws SQLException {
        
        interfazPrincipal principal = new interfazPrincipal();
        principal.setVisible(true);
    }
    
}
