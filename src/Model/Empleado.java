package Model;

public class Empleado {
    private String DNI;
    private String Nombres;
    private String Apellidos;
    private String Rol;
    private String Especialidad;
    private String Telefono;
    private String Correo;

    public Empleado(String DNI, String Nombres, String Apellidos,
                    String Rol, String Especialidad,
                    String Telefono, String Correo) {

        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Rol = Rol;
        this.Especialidad = Especialidad;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String verInfo() {
        return "\nDNI: " + this.DNI 
                + "\nNombres: " + this.Nombres 
                + "\nApellidos: " + this.Apellidos 
                + "\nRol=" + this.Rol 
                + "\nEspecialidad: " + this.Especialidad 
                + "\nTelefono: " + this.Telefono 
                + "\nCorreo: " + this.Correo;
    }
}

