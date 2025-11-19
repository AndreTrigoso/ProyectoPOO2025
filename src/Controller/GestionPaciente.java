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

  
    public boolean agregarPaciente(Paciente p) {
        if (numPacientes >= pacientes.length) return false; 
        if (buscarPorDni(p.getDni()) != null) return false; 

        pacientes[numPacientes] = p;
        numPacientes++;
        return true;
    }


    public Paciente buscarPorDni(String dni) {
        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].getDni().equals(dni)) {
                return pacientes[i];
            }
        }
        return null;
    }


    public boolean eliminarPaciente(String dni) {
        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].getDni().equals(dni)) {

                // correr posiciones
                for (int j = i; j < numPacientes - 1; j++) {
                    pacientes[j] = pacientes[j + 1];
                }

                pacientes[numPacientes - 1] = null;
                numPacientes--;
                return true;
            }
        }
        return false;
    }

    public boolean modificarPaciente(Paciente nuevo) {
        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].getDni().equals(nuevo.getDni())) {
                pacientes[i] = nuevo;
                return true;
            }
        }
        return false;
    }

  
    public Paciente[] getLista() {
        return pacientes;
    }
}

    
    
