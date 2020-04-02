/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Conexion {
    
    private  Connection conectar;
    
    public Conexion(){
       this.conectar=null;
    }
    
    public Connection conexion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/fundacion?useSSL=false","root","root");
       } catch (ClassNotFoundException | SQLException ex) {
           
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return conectar;
   }
}
    