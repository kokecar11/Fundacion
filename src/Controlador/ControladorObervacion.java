/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Observacionis;
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
public class ControladorObervacion {

    public boolean CrearObservacion(Observacionis observacionis) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO Observaciones (Descripcion,AlumnoID) VALUES (?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            
            psd.setString(1, observacionis.getDescripcion());
            psd.setLong(2, observacionis.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObervacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarObservacion(Observacionis observacionis,int dato) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE Observaciones SET Descripcion='" +observacionis.getDescripcion()+ "' WHERE alumnoid="+observacionis.getAlumnoID()+" AND IdObservacion="+dato+"";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObervacion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public int ObtenerNumeroObservacionesAlumno(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT count(*) from Observaciones where AlumnoID ="+cedula+"";
            PreparedStatement psd = conectar.prepareStatement(sql);
            ResultSet res;
            int nRegistros;
            res = psd.executeQuery(sql);
            if (res.next()) {
                nRegistros = Integer.parseInt(res.getString(1));
            } else {
                nRegistros = 0;
            }
            conectar.close();
            return nRegistros;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTalleres.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Object[][] CargarTodasObservacionesAlumno(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        int x = 0;
        String sql = "SELECT IdObservacion,Descripcion FROM Observaciones where AlumnoID ="+cedula+"";
        Statement st;
        Object[][] dato = new Object[ObtenerNumeroObservacionesAlumno(cedula)][2];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                dato[x][0] = new String(res.getString(1));
                dato[x][1] = new String(res.getString(2));
                x++;
            }
            conexion.close();
            return dato;
        } catch (SQLException e) {
            e.printStackTrace();
            return dato;
        }
    }
    public String DatosObservacion(long cedula,int observacion) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT Descripcion FROM Observaciones WHERE alumnoid="+cedula+" AND IdObservacion="+observacion+"";
        Statement st;
        String datos = "";
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                datos= res.getString(1);
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
    
}
