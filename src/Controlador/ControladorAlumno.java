/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Conexion;
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
public class ControladorAlumno {

    public boolean CrearAlumno(Alumno alumno) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO ALUMNO (identificacion, tipoidentificacion, nombre,apellido, fechanacimiento, lugarnacimiento, ocupacion, tallapantalon, tallazapatos, tallacamisa) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setLong(1, alumno.getIdentificacion());
            psd.setString(2, alumno.getTipoIdentificacion());
            psd.setString(3, alumno.getNombre());
            psd.setString(4, alumno.getApellido());
            psd.setString(5, alumno.getFechaNacimiento());
            psd.setString(6, alumno.getLugarNacimiento());
            psd.setString(7, alumno.getOcupacion());
            psd.setString(8, alumno.getTallaPantalon());
            psd.setString(9, alumno.getTallaZapato());
            psd.setString(10, alumno.getTallaCamisa());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void EliminarAlumno(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM alumno where identificacion='"+cedula+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String[] DatosAlumno(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT identificacion, tipoidentificacion, nombre,apellido, fechanacimiento, lugarnacimiento, ocupacion, tallapantalon, tallazapatos, tallacamisa FROM alumno WHERE identificacion="+cedula+"";
        Statement st;
        String datos[] = new String[10];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
                datos[4] = res.getString(5);
                datos[5] = res.getString(6);
                datos[6] = res.getString(7);
                datos[7] = res.getString(8);
                datos[8] = res.getString(9);
                datos[9] = res.getString(10);
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public boolean AlumnoExiste(long cedula) {
         try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT identificacion FROM alumno WHERE identificacion ='"+cedula+"'";
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
            Logger.getLogger(ControladorAlumno.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
