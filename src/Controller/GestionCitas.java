/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cita;
import Model.Consultorio;
import Model.Medico;
import Model.Paciente;

/**
 *
 * @author Usuario
 */
public class GestionCitas {
    private Cita[] citas;
    private int numCitas;

    public GestionCitas() {
        this.citas = new Cita[20];
        this.numCitas = 0;
    }
    
    public void agregarCita(Cita c){
        if(this.numCitas<this.citas.length){
            this.citas[numCitas] = c;
            this.numCitas++;
            
        }
    }
    
    public Cita[] buscarPorPaciente(String dni) {

        Cita[] resultado = new Cita[numCitas];
        int pos = 0;

        for (int i = 0; i < numCitas; i++) {
            if (citas[i].getPaciente().getDni().equals(dni)) {
                resultado[pos] = citas[i];
                pos++;
            }
        }
        //comentarios
        return resultado;
    }
    
     public Cita[] buscarPorMedico(String apellidoMedico) {

        Cita[] resultado = new Cita[numCitas];
        int pos = 0;

        for (int i = 0; i < numCitas; i++) {
            if (citas[i].getMedico().getApellidos().equals(apellidoMedico)) {
                resultado[pos] = citas[i];
                pos++;
            }
        }

        return resultado;
    }
    
     public void eliminarCita(int indice) {
        if (indice >= 0 && indice < numCitas) {

            // mover todo a la izquierda
            for (int i = indice; i < numCitas - 1; i++) {
                citas[i] = citas[i + 1];
            }

            citas[numCitas - 1] = null;
            numCitas--;

        }
    }
     
     public void modificarCita(int indice,String fecha,String hora, String modalidad, String estado, String codigoConsultorio, Paciente paciente,
      Medico medico) {

            Cita c = citas[indice];

            c.setFecha(fecha);
            c.setHora(hora);
            c.setModalidad(modalidad);
            c.setEstado(estado);
            c.setCodigoConsultorio(codigoConsultorio);
            c.setPaciente(paciente);
            c.setMedico(medico);
        }
     
     public Cita getCita(int i){
        return citas[i];
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }

    public int getNumCitas() {
        return numCitas;
    }

    public void setNumCitas(int numCitas) {
        this.numCitas = numCitas;
    }
     
     
}
