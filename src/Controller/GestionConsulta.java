package Controller;

import Model.Cita;
import Model.Consulta;
import Model.Orden;
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
            System.out.println("Posición inválida");
            return;
        }

        for (int i = posicion; i < cantidad - 1; i++) {
            consultas[i] = consultas[i + 1];
        }

        consultas[cantidad - 1] = null;
        cantidad--;
        System.out.println("Consulta eliminada.");
    }
    
    public void modificarConsulta(int posicion, String motivo, double precio, String estado, String antecedentes, String signosVitales, 
            String examenesFisicos,String diagnosticos, Receta receta, Orden[] orden, int cantidadOrdenes, String plan, Cita cita){
        
        if (posicion < 0 || posicion >= cantidad) {
            System.out.println("Índice inválido.");
            return;
        }
        
        Consulta c = consultas[posicion];
        c.setMotivo(motivo);
        c.setPrecio(precio);
        c.setEstado(estado);
        c.setAntecedentes(antecedentes);
        c.setSignosVitales(signosVitales);
        c.setExamenesFisicos(examenesFisicos);
        c.setDiagnosticos(diagnosticos);
        c.setPlan(plan);
        c.setCita(cita);
        c.setOrden(orden);
        c.setReceta(receta);

        System.out.println("Consulta modificada correctamente");    
    }
    
    public Consulta buscar(int posicion) {
        if (posicion >= 0 && posicion < this.cantidad) {
            return consultas[posicion];
        }
        return null;
    }
}
