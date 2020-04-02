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
public class Familias {
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    private long telefono;
    private String situacionFamiliar;
    private long alumnoID;

    public Familias(String nombre, String apellido, int edad, String ocupacion, long telefono, String situacionFamiliar, long alumnoID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.situacionFamiliar = situacionFamiliar;
        this.alumnoID = alumnoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getSituacionFamiliar() {
        return situacionFamiliar;
    }

    public void setSituacionFamiliar(String situacionFamiliar) {
        this.situacionFamiliar = situacionFamiliar;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }
    
}
