/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Reubicaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ControladorReubicacion {
    public String[] DatosReubicacion(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT ubicacion,descripcion FROM reubicacion WHERE alumnoid="+cedula+"";
        Statement st;
        String datos[] = new String[2];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public boolean ReubicacionExiste(long cedula) {
         try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT alumnoid FROM reubicacion WHERE alumnoid ='"+cedula+"'";
            Statement st = conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val = rs.getString(1);
            }
            rs.close();
            st.close();
            conectar.close();
            if (val.equals("")) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReubicacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean CrearReubicacion(Reubicaciones reubicacion) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO reubicacion (ubicacion,descripcion,alumnoid) VALUES (?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, reubicacion.getUbicacion());
            psd.setString(2, reubicacion.getDescripcion());
            psd.setLong(3, reubicacion.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReubicacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    public boolean ModificarReubicacion(Reubicaciones reubicacion) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE reubicacion SET ubicacion='" + reubicacion.getUbicacion() + "',descripcion='" + reubicacion.getDescripcion() + "' WHERE alumnoid='" + reubicacion.getAlumnoID() + "';";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReubicacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void EliminarReubicacion(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM reubicacion where alumnoid='"+cedula+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
