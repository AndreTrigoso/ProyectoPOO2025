/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Cita;
import Model.Consultorio;

/**
 *
 * @author Aidan
 */
public class GestionConsultorios {

    private Consultorio[] consultorios;
    private int numConsultorios;

    public GestionConsultorios() {
        this.consultorios = new Consultorio[20];
        this.numConsultorios = 0;
    }

    public int getNumConsultorios() {
        return numConsultorios;
    }

    public Consultorio[] getLista() {
        return consultorios;
    }

    public void agregarConsultorio(Consultorio c) {

   
        if (numConsultorios >= consultorios.length) {
            this.consultorios[numConsultorios] = c;
            numConsultorios++;
        }

    }


    public void eliminarConsultorio() {
        for (int i = 0; i < numConsultorios - 1; i++) {
            consultorios[i] = consultorios[i + 1];
        }

        consultorios[numConsultorios - 1] = null;
        numConsultorios--;
    }

    public void modificarConsultorio(int fila, String codigo, String especialidad, String estado) {
        Consultorio c = consultorios[fila];
        c.setCodigo(codigo);
        c.setEspecialidad(especialidad);
        c.setEstado(estado);
    
    }
    
    public Consultorio buscarConsultorio(String codigo) {
        for (int i = 0; i < numConsultorios; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                return consultorios[i];
            }
        }
        return null;
    }
    
    public Consultorio buscarDisponible(String codigo, String fechaHora) {
        Consultorio c = buscarConsultorio(codigo);
        if (c == null) return null;

        if (c.estaDisponible(fechaHora, fechaHora)) {
            return c;
        }
        return null;
    }

}