/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author david
 */
public class Observaciones {
    private int idObservaciones;
    private String descripcion;
    private long alumnoID;

    public Observaciones(int idObservaciones, String descripcion, long alumnoID) {
        this.idObservaciones = idObservaciones;
        this.descripcion = descripcion;
        this.alumnoID = alumnoID;
    }

    public int getIdObservaciones() {
        return idObservaciones;
    }

    public void setIdObservaciones(int idObservaciones) {
        this.idObservaciones = idObservaciones;
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
