/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Consulta {
    private String motivo;
    private double precio;
    private String estado;
    private Paciente paciente;
    private String antecedentes;
    private String signosVitales;
    private String examenFisico;
    private Receta receta;
    private GestionOrden orden;

    public Consulta(String motivo, double precio, String estado, Paciente paciente, String antecedentes, String signosVitales, String examenFisico, Receta receta, GestionOrden orden) {
        this.motivo = motivo;
        this.precio = precio;
        this.estado = estado;
        this.paciente = paciente;
        this.antecedentes = antecedentes;
        this.signosVitales = signosVitales;
        this.examenFisico = examenFisico;
        this.receta = receta;
        this.orden = orden;
    }
    
    
    
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

     public void abrir() {
        this.estado = "Abierta";
    }
    
    public void cerrar() {
        this.estado = "Cerrada";
    }
    
    public void agregarReceta(Receta receta){
        this.receta = receta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public GestionOrden getGestionOrden() {
        return orden;
    }

    public void setOrden(GestionOrden orden) {
        this.orden = orden;
    }
    
    
    
}
