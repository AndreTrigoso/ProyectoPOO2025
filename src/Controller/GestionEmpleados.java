package Controller;

import Model.Empleado;

public class GestionEmpleados {
    private Empleado[] empleados;
    private int nroEmpleados;

    public GestionEmpleados() {
        this.empleados = new Empleado[20];
        this.nroEmpleados = 0;
    }
    
    public boolean usuarioExiste(String DNI){
        for (int i = 0; i < this.nroEmpleados; i++) {
            if(this.empleados[i].getDNI().equalsIgnoreCase(DNI)){
                return true;
            }
        }
        return false;
    }
    
    public void agregarEmpleado(String DNI, String Nombres, String Apellidos, String Rol, String Especialidad, String Telefono, String correo){
        if(this.nroEmpleados < this.empleados.length){
            if (!usuarioExiste(DNI)){
                this.empleados[this.nroEmpleados] = new Empleado(DNI, Nombres, Apellidos, Rol, Especialidad, Telefono, correo);
                this.nroEmpleados++;
            }
            else 
            {
                System.out.println("El usuario ya existe");
            }
        }
    }
    
    public void modificarEmpleado(int fila, String DNI, String Nombres, String Apellidos,
                              String Rol, String Especialidad, String Telefono, String Correo){
        Empleado emp = empleados[fila];
        emp.setDNI(DNI);
        emp.setNombres(Nombres);
        emp.setApellidos(Apellidos);
        emp.setRol(Rol);
        emp.setEspecialidad(Especialidad);
        emp.setTelefono(Telefono);
        emp.setCorreo(Correo);
    }
    
    public void eliminarEmpleado(int fila) {

        for (int i = 0; i < nroEmpleados - 1; i++) {
            empleados[i] = empleados[i + 1];
        }

        empleados[nroEmpleados - 1] = null;
        nroEmpleados--;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }

    public Empleado getEmpleados(int i) {
        return empleados[i];
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }
    
}
