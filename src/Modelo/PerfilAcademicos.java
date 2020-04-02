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
public class PerfilAcademicos {
    private String nivelEscolar;
    private String Grado;
    private String institucionEducativa;
    private long alumnoID;

    public PerfilAcademicos(String nivelEscolar, String Grado, String institucionEducativa, long alumnoID) {
        this.nivelEscolar = nivelEscolar;
        this.Grado = Grado;
        this.institucionEducativa = institucionEducativa;
        this.alumnoID = alumnoID;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getInstitucionEducativa() {
        return institucionEducativa;
    }

    public void setInstitucionEducativa(String institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }
    
}
