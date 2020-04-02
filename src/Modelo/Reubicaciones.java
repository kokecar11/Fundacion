/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Timestamp;
/**
 *
 * @author david
 */
public class Reubicaciones {
    private String ubicacion;
    private String descripcion;
    private long alumnoID;

    public Reubicaciones(String ubicacion, String descripcion, long alumnoID) {
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.alumnoID = alumnoID;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }
    
    
}
