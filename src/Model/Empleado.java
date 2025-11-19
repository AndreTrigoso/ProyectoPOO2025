/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aidan
 */
public abstract class Empleado {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String rol;

    public Empleado(String dni, String nombre, String apellido, String telefono,  String rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.rol = rol;
    }

    // GETTERS
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }
    public String getRol() { return rol; }
}

