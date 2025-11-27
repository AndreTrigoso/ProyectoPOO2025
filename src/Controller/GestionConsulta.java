package Controller;

import Model.Cita;
import Model.Consulta;
import Model.GestionOrden;
import Model.Orden;
import Model.Paciente;
import Model.Receta;

public class GestionConsulta {
    private Consulta[] consultas;
    private int cantidad;

    public GestionConsulta() {
        this.consultas = new Consulta[20];
        this.cantidad = 0;
    }
    
    public void agregarConsulta(Consulta consulta){
        if(this.cantidad < this.consultas.length){
            this.consultas[cantidad] = consulta;
            this.cantidad++;
        }
        else {
            System.out.println("No hay espacio para más consultas");
        }
    }
    
    public void eliminarConsulta(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            
            return;
        }

        for (int i = posicion; i < cantidad - 1; i++) {
            consultas[i] = consultas[i + 1];
        }

        consultas[cantidad - 1] = null;
        cantidad--;
        
    }

    public Consulta[] getConsultas() {
        return consultas;
    }
    
    public Consulta getConsultas(int indice) {
        return consultas[indice];
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    public Consulta buscar(int posicion) {
        if (posicion >= 0 && posicion < this.cantidad) {
            return consultas[posicion];
        }
        return null;
    }
}
