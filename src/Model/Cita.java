/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Cita {
    private String fecha, hora, modalidad, estado, codigoConsultorio;
    private Paciente paciente;
    private Medico medico;


    public Cita(String fecha, String hora, String modalidad, String codigoConsultorio, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.modalidad = modalidad;
        this.codigoConsultorio = codigoConsultorio;
        this.paciente = paciente;
        this.medico = medico;
        this.estado = "Pendiente";
    }
    
    public void confirmar() {
    this.estado = "Confirmada";
    }
    
    public void cancelar() {
    this.estado = "Cancelada";
    }
    
    public void marcarEnSala() {
    this.estado = "En sala";
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoConsultorio() {
        return codigoConsultorio;
    }

    public void setCodigoConsultorio(String codigoConsultorio) {
        this.codigoConsultorio = codigoConsultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
}
