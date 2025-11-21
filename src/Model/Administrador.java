/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.GestionCitas;
import Controller.GestionConsultorios;
import Controller.GestionEmpleados;
import Controller.GestionPaciente;

/**
 *
 * @author Aidan
 */
public class Administrador extends Empleado {

    private GestionEmpleados gestionEmpleados;
    //GestionConsultas gestionConsultas;
    private GestionConsultorios gestionConsultorios;
    
    
    
    
    public Administrador(String DNI, String Nombres, String Apellidos, String Rol, String Especialidad, String Telefono, String Correo) {
        super(DNI, Nombres, Apellidos, Rol, Especialidad, Telefono, Correo);
        this.gestionEmpleados = new GestionEmpleados();
        this.gestionConsultorios = new GestionConsultorios();
    }
    
    
}
