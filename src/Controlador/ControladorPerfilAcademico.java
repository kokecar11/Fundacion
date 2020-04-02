/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.PerfilAcademicos;
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
public class ControladorPerfilAcademico {

    public boolean CrearPerfilAcademico(PerfilAcademicos perfilAcademicos) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO PERFILACADEMICO (nivelescolar,grado,institucioneducativo,alumnoid) VALUES (?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, perfilAcademicos.getNivelEscolar());
            psd.setString(2, perfilAcademicos.getGrado());
            psd.setString(3, perfilAcademicos.getInstitucionEducativa());
            psd.setLong(4, perfilAcademicos.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPerfilAcademico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String[] DatosPerfilAcademico(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT nivelescolar,grado,institucioneducativo FROM perfilacademico WHERE alumnoid="+cedula+"";
        Statement st;
        String datos[] = new String[3];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public void EliminarPerfilAcademico(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM perfilacademico where alumnoid='"+cedula+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
