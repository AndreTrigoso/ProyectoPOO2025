/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Empleado;

/**
 *
 * @author Andre
 */
public class GestionEmpleados {
    private Empleado [] empleados;
    private int numEmpleados;

    public GestionEmpleados() {
        this.empleados = new Empleado[20];
        this.numEmpleados = 0;
    }
    
    public int getNumEmpleados() {
    return numEmpleados;
    }   
    public Empleado[] getLista() {
    return empleados;
    }
    
    public void agregarEmpleado(Empleado e){
        if (numEmpleados < empleados.length) {
            this.empleados[this.numEmpleados] = e;
            this.numEmpleados++;
        }
    }
    
    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getDni().equals(dni)) {
                return empleados[i];
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(String dni) {
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getDni().equals(dni)) {

                for (int j = i; j < numEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }

                empleados[numEmpleados - 1] = null;
                numEmpleados--;
                return true;
            }
        }
        return false;
    }

    public boolean modificarEmpleado(Empleado nuevo) {
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getDni().equals(nuevo.getDni())) {
                empleados[i] = nuevo;
                return true;
            }
        }
        return false;
    }
}