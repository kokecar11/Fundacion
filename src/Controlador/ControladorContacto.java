/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Contactos;
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
public class ControladorContacto {

    public boolean CrearContacto(Contactos contactos) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO CONTACTO (direccion,localidad,estrato,fijo,celular,tipovivienda,alumnoid) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, contactos.getDireccion());
            psd.setString(2, contactos.getLocalidad());
            psd.setInt(3, contactos.getEstrato());
            psd.setLong(4, contactos.getFijo());
            psd.setLong(5, contactos.getCelular());
            psd.setString(6, contactos.getTipoVivienda());
            psd.setLong(7, contactos.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorContacto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String[] DatosContacto(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT direccion, localidad, estrato,fijo, celular,tipovivienda FROM contacto WHERE alumnoid="+cedula+"";
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

    public void EliminarContacto(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM contacto where alumnoid='"+cedula+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
