package Model;

public class Medicamento {
    private String dosis;
    private String frecuencia;
    private String duracion;
    private String nombre;
    private String marca;

    public Medicamento(String dosis, String frecuencia, String duracion, String nombre, String marca) {
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String verInfo() {
        return "\nDosis: " + this.dosis 
                + "\nFrecuencia: " + this.frecuencia 
                + "\nDuracion: " + this.duracion 
                + "\nNombre: " + this.nombre 
                + "\nMarca: " + this.marca;
    }
    
    
}
