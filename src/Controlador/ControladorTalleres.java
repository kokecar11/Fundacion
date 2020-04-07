/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.InscripcionTaller;
import Modelo.Tallere;
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
public class ControladorTalleres {

    public static int contarNumeroTalleres() {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT count(*) from talleres";
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
    public static int contarNumeroTalleresActivos() {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT count(*) from talleres WHERE estado ="+true+"";
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
    public static Object[][] CargarTalleres() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        int x = 0;
        String sql = "SELECT nombre,estado,cupos FROM talleres ";
        Statement st;
        Object[][] dato = new Object[contarNumeroTalleres()][3];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                dato[x][0] = new String(res.getString(1));
                dato[x][1] = new String(res.getString(2));
                dato[x][2] = new String(res.getString(3));
                x++;
            }
            conexion.close();
            return dato;
        } catch (SQLException e) {
            e.printStackTrace();
            return dato;
        }
           
    }
    
    public boolean CrearTaller(Tallere tallere) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO TALLERES (nombre,descripcion,estado,cupos) VALUES (?,?,?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, tallere.getNombre());
            psd.setString(2, tallere.getDescripcion());
            psd.setBoolean(3, tallere.isEstado());
            psd.setInt(4, tallere.getCupos());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTalleres.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean TallerExiste(String nombre) {
         try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT nombre FROM talleres WHERE nombre ='"+nombre+"'";
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
            Logger.getLogger(ControladorTalleres.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public boolean TallerExiste(String nombreNuevo, String nombreActual) {
         try {
            String val = "";
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT nombre FROM talleres WHERE nombre ='"+nombreNuevo+"'";
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
            }else if(val.equals(nombreActual)){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTalleres.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public static String[] CargarNombreTalleres() {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        int x = 0;
        String sql = "SELECT nombre FROM talleres WHERE estado ="+true+"";
        Statement st;
        String [] dato = new String[contarNumeroTalleres()+1];
        dato [0] = "";
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                dato[x+1] = res.getString(1);
                x++;
            }
            conexion.close();
            return dato;
        } catch (SQLException e) {
            e.printStackTrace();
            return dato;
        }
    }

    public boolean AgregarAlumnoTalleres(InscripcionTaller inscripcionTaller) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "INSERT INTO inscripciontaller (nombre,alumnoid) VALUES (?,?)";
            PreparedStatement psd = (PreparedStatement) conectar.prepareStatement(sql);
            psd.setString(1, inscripcionTaller.getNombre());
            psd.setLong(2, inscripcionTaller.getAlumnoID());
            psd.executeUpdate();
            psd.close();
            conectar.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTalleres.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public String[] DatosTaller(String nombre) {
        Conexion con = new Conexion();
        Connection conexion = con.conexion();
        String sql = "SELECT nombre, descripcion, estado,cupos FROM talleres WHERE nombre='"+nombre+"'";
        Statement st;
        String datos[] = new String[4];
        try {
            st = conexion.createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()) {
                datos[0] = res.getString(1);
                datos[1] = res.getString(2);
                datos[2] = res.getString(3);
                datos[3] = res.getString(4);
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public boolean ModificarTaller(Tallere tallere,String taller) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE talleres SET nombre='" + tallere.getNombre()+ "',descripcion='" + tallere.getDescripcion() + "',estado=" + tallere.isEstado()+ ",Cupos='" + tallere.getCupos()+ "' WHERE nombre='" + taller+ "';";
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
    public boolean ModificarInscripcionTaller(String nombreNuevo,String nombreActual) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String query = "UPDATE InscripcionTaller SET nombre='" +nombreNuevo+ "' WHERE nombre='"+nombreActual+"';";
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
    public void EliminarInscripcionTaller(String taller) {
        try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql= "Delete FROM InscripcionTaller where nombre='"+taller+"'";
            Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int ContarNumeroInscritosTalleres(String taller) {
       try {
            Conexion conexion = new Conexion();
            Connection conectar = conexion.conexion();
            String sql = "SELECT count(*) from InscripcionTaller WHERE nombre ='"+taller+"'";
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
}
