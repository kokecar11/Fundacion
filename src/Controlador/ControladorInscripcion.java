/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.InscripcionFundacion;
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
public class ControladorInscripcion {

    public boolean CrearInscripcion(InscripcionFundacion inscripcionFundacion) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO inscripcionfundacion (fechainscripcion,estadoalumno,alumnoid) VALUES (?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, inscripcionFundacion.getFechaInscripcion());
            psd.setBoolean(2, inscripcionFundacion.isEstadoAlumno());
            psd.setLong(3, inscripcionFundacion.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarInscripcion(InscripcionFundacion inscripcionFundacion) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE InscripcionFundacion SET FechaInscripcion='"+inscripcionFundacion.getFechaInscripcion()+"',EstadoAlumno="+inscripcionFundacion.isEstadoAlumno()+" WHERE AlumnoID="+inscripcionFundacion.getAlumnoID()+";";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarCedula(long identificacion, long identificacionAntigua) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE inscripcionfundacion SET alumnoid='" +identificacion+ "' WHERE alumnoid="+identificacionAntigua+";";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInscripcion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String[] DatosInscripcion(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT FechaInscripcion,EstadoAlumno FROM InscripcionFundacion WHERE alumnoid="+cedula+"";
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

    public boolean EstadoEstudiante(long cedula) {
        try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT EstadoAlumno FROM InscripcionFundacion WHERE AlumnoID ='"+cedula+"'";
            Statement st = conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val = rs.getString(1);
            }
            rs.close();
            st.close();
            conectar.close();
            if (val.equals("1")) {
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
