/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aidan
 */
public class Medico extends Empleado {
    private String especialidad;

    public Medico(String DNI, String Nombres, String Apellidos, String Rol, String Especialidad, String Telefono, String Correo) {
        super(DNI, Nombres, Apellidos, "Medico", Especialidad, Telefono, Correo);
    }

    

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}
    

