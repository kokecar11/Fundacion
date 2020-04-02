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
public class Contactos {
    private String direccion;
    private String localidad;
    private int estrato;
    private long fijo;
    private long celular;
    private String tipoVivienda;
    private long alumnoID;

    public Contactos(String direccion, String localidad, int estrato, long fijo, long celular, String tipoVivienda, long alumnoID) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.estrato = estrato;
        this.fijo = fijo;
        this.celular = celular;
        this.tipoVivienda = tipoVivienda;
        this.alumnoID = alumnoID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public long getFijo() {
        return fijo;
    }

    public void setFijo(long fijo) {
        this.fijo = fijo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }

    
}
