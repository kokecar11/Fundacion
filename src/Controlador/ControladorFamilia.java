/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Familias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ControladorFamilia {

    public static int contarFamiliaresAlumno(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT count(*) from FAMILIA WHERE alumnoid="+cedula+" ";
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
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    public static Object[][] CargarFamiliaAlumno(long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        int x = 0;
        String sql = "SELECT nombre,apellido,ocupacion,telefono FROM familia where alumnoid='"+cedula+"'";
        Statement st;
        Object[][] dato = new Object[contarFamiliaresAlumno(cedula)][4];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                dato[x][0] = new String(res.getString(1));
                dato[x][1] = new String(res.getString(2));
                dato[x][2] = new String(res.getString(3));
                dato[x][3] = new String(res.getString(4));
                x++;
            }
            conexion.close();
            return dato;
        } catch (SQLException e) {
            e.printStackTrace();
            return dato;
        }
           
    }

    public boolean CrearFamilia(Familias familias) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO FAMILIA (nombre,apellido, edad, ocupacion, telefono, situacionfamiliar, alumnoid) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, familias.getNombre());
            psd.setString(2, familias.getApellido());
            psd.setInt(3, familias.getEdad());
            psd.setString(4, familias.getOcupacion());
            psd.setLong(5, familias.getTelefono());
            psd.setString(6, familias.getSituacionFamiliar());
            psd.setLong(7, familias.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarFamilia(Familias familias,String nombre,String apellido) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE Familia SET Nombre='"+familias.getNombre()+"',Apellido='"+familias.getApellido()+"',Edad='"+familias.getEdad()+"',Ocupacion='"+familias.getOcupacion()+"',Telefono='"+familias.getTelefono()+"',SituacionFamiliar='"+familias.getSituacionFamiliar()+"' WHERE (nombre ='"+nombre+"'AND apellido ='"+apellido+"') AND alumnoid ='"+familias.getAlumnoID()+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean FamiliarExiste(String nombre, String apellido, long cedula) {
        try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT nombre, apellido FROM familia WHERE (nombre ='"+nombre+"'AND apellido ='"+apellido+"') AND alumnoid ='"+cedula+"'";
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
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean FamiliarExisteSin(String nombreNuevo, String apellidoNuevo,String nombreActual,String apellidoActual,long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT nombre, apellido FROM familia WHERE (nombre ='"+nombreNuevo+"'AND apellido ='"+apellidoNuevo+"') AND alumnoid ='"+cedula+"'";
            Statement st = conectar.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            String datos[] = new String[2];
            datos[0]="";
            datos[1]="";
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
            }
            rs.close();
            st.close();
            conectar.close();
            if (datos[0].equals("")&&datos[1].equals("")) {
                return true;
            }else if(datos[0].equals(nombreActual)&&datos[1].equals(apellidoActual)){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public void EliminarFamilia(long cedula) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM familia where alumnoid='"+cedula+"'";
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
            String query = "UPDATE Familia SET alumnoid='" +identificacion+ "' WHERE alumnoid="+identificacionAntigua+";";
            Statement st = conectar.createStatement();
            st.executeUpdate(query);
            st.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFamilia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public String[] DatosFamiliar(String nombre,String apellido, long cedula) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT nombre,apellido,edad,ocupacion,telefono,situacionfamiliar FROM familia WHERE (nombre='"+nombre+"' and apellido='"+apellido+"')and alumnoid="+cedula+"";
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
}
