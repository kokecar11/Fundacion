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
public class Saluds {
    private String convenio;
    private String grupoSanguineo;
    private String RH;
    private String diagnostico;
    private String medicamentos;
    private String recomendaciones;
    private long alumnoID;

    public Saluds(String convenio, String grupoSanguineo, String RH, String diagnostico, String medicamentos, String recomendaciones, long alumnoID) {
        this.convenio = convenio;
        this.grupoSanguineo = grupoSanguineo;
        this.RH = RH;
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
        this.recomendaciones = recomendaciones;
        this.alumnoID = alumnoID;
    }
        


    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public long getAlumnoID() {
        return alumnoID;
    }

    public void setAlumnoID(long alumnoID) {
        this.alumnoID = alumnoID;
    }
}