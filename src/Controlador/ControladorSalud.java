/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Saluds;
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
public class ControladorSalud {

    public boolean CrearSalud(Saluds saluds) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO SALUD (convenio,gruposanguineo,rh,diagnostico,medicamentos,recomendaciones,alumnoid) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, saluds.getConvenio());
            psd.setString(2, saluds.getGrupoSanguineo());
            psd.setString(3, saluds.getRH());
            psd.setString(4, saluds.getDiagnostico());
            psd.setString(5, saluds.getMedicamentos());
            psd.setString(6, saluds.getRecomendaciones());
            psd.setLong(7, saluds.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorSalud.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarSalud(Saluds saluds) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE Salud SET Convenio='"+saluds.getConvenio()+"',GrupoSanguineo='"+saluds.getGrupoSanguineo()+"',RH='"+saluds.getRH()+"',Diagnostico='"+saluds.getDiagnostico()+"',Medicamentos='"+saluds.getMedicamentos()+"',Recomendaciones='"+saluds.getRecomendaciones()+"' WHERE AlumnoID="+saluds.getAlumnoID()+";";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorSalud.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String[] DatosSalud(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT convenio, gruposanguineo, rh,diagnostico, medicamentos,recomendaciones FROM salud WHERE alumnoid="+cedula+"";
        Statement st;
        String datos[] = new String[6];
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
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public void EliminarSalud(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM salud where alumnoid='"+cedula+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean ModificarCedula(long identificacion, long identificacionAntigua) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE Salud SET alumnoid='" +identificacion+ "' WHERE alumnoid="+identificacionAntigua+";";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorSalud.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
