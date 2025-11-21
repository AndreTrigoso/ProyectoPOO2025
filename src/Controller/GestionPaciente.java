/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Paciente;

/**
 *
 * @author Aidan
 */
public class GestionPaciente {
    private Paciente[] pacientes;
    private int numPacientes;

    public GestionPaciente() {
        pacientes = new Paciente[50]; 
        numPacientes = 0;
    }

  
    public void agregarPaciente(Paciente p) {
        if(this.numPacientes<this.pacientes.length){
            pacientes[this.numPacientes] = p;
            this.numPacientes++;
        }
    }


    public Paciente buscarPorDni(String dni) {
        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].getDni().equals(dni)) {
                return pacientes[i];
            }
        }
        return null;
    }


    public void eliminarPaciente() {
        for (int i = 0; i < numPacientes - 1; i++) {
            pacientes[i] = pacientes[i + 1];
        }

        pacientes[numPacientes - 1] = null;
        numPacientes--;
    }

    public void modificarPaciente(int fila, String dni, String nombre, String apellido,
                                  String fechaNac, String sexo, 
                                  String telefono, String emergencia, String contacto) {
        
        Paciente p = pacientes[fila];
        p.setDni(dni);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setFechaNacimiento(fechaNac);
        p.setSexo(sexo);
        p.setTelefono(telefono);
        p.setTelefonoEmergencia(emergencia);
        p.setContactoEmergencia(contacto);
    }

  
     public void eliminarPaciente(int fila) {

        for (int i = fila; i < this.numPacientes - 1; i++) {
            pacientes[i] = pacientes[i + 1];
        }

        pacientes[this.numPacientes - 1] = null;
        this.numPacientes--;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }
     
    public Paciente getPaciente(int i){
        return pacientes[i];
    }
     
    
    
}

    
    
