/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class HistorialClinica {
    private Consulta[] consultas;
    private int cantidad;
    private Paciente paciente;

    public HistorialClinica(int cantidad, Paciente paciente) {
        this.cantidad = 0;
        this.paciente = paciente;
        this.consultas = new Consulta[cantidad];
    }

    public Consulta getConsultas(int pos) {
        if (pos >= 0 && pos < cantidad) {
            return consultas[pos];
        }
        return null;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean agregar(Consulta consulta) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = consulta;
            cantidad++;
            return true;
        }
        return false;
    }
    
    public boolean eliminar(int pos) {
        if (pos >= 0 && pos < cantidad) {
            for (int i = pos; i < cantidad - 1; i++) {
                consultas[i] = consultas[i + 1];
            }

            consultas[cantidad - 1] = null;
            cantidad--;
            return true;
        }
        return false;
    }
    
    public String ver() {
        String cad = "";
        for (int i = 0; i < cantidad; i++) {
            cad += "Consulta " + (i + 1) + ": " + consultas[i].getMotivo() + "\n";
        }
        return cad;
    }
    
        public void modificarPaciente(int fila, String motivo, double precio, String estado, Paciente paciente, String antecedentes, String signosVitales, Receta receta, GestionOrden orden) {
            if (fila >= 0 && fila < cantidad) {

                Consulta c = consultas[fila];

                c.setMotivo(motivo);
                c.setPrecio(precio);
                c.setAntecedentes(antecedentes);
                c.setSignosVitales(signosVitales);



                c.setReceta(receta);

            }
        }
}
