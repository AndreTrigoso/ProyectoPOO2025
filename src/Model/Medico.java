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

    public Medico(String especialidad, String dni, String nombre, String apellido, String telefono, String rol) {
        super(dni, nombre, apellido, telefono, rol);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}
    

