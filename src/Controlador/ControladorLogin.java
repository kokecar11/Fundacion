/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Conexion;
import Modelo.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author david
 */
public class ControladorLogin {

    public boolean BuscarUsuario(String usuario,String clave) {
        try {
            String val="";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT Nombre FROM usuarios WHERE Nombre = '"+usuario+"' AND clave = '"+clave+"'";
            Statement st = conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                val = rs.getString(1);
            }
            rs.close();
            st.close();
            conectar.close();
            if(val.equals("")){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
