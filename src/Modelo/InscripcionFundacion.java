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
public class InscripcionFundacion {
    String fechaInscripcion;
    private boolean estadoAlumno;
    private long alumnoID;

    public InscripcionFundacion(String fechaInscripcion, boolean estadoAlumno, long alumnoID) {
        this.fechaInscripcion = fechaInscripcion;
        this.estadoAlumno = estadoAlumno;
        this.alumnoID = alumnoID;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isEstadoAlumno() {
        return estadoAlumno;
    }

    public void setEstadoAlumno(boolean estadoAlumno) {
        this.estadoAlumno = estadoAlumno;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }

    
    
}
