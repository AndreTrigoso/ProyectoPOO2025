package Model;

public class Consultorio {

    private String codigo;
    private String especialidad;
    private String estado;

    private Cita[] citas;
    private int numCitas;

    public Consultorio(String codigo, String especialidad, String estado) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;

        this.citas = new Cita[30];
        this.numCitas = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    
    public boolean estaDisponible(String fecha, String hora) {
        for (int i = 0; i < numCitas; i++) {
            if (citas[i].getFecha().equals(fecha) && citas[i].getHora().equals(hora)) {
                return false;
            }
        }
        return true;
    }

    public String verInfo() {
        return "\nCodigo: " + this.codigo 
                + "\nEspecialidad: " + this.especialidad 
                + "\nEstado: " + this.estado 
                + "\nCitas: " + this.citas 
                + "Numero de citas: " + this.numCitas;
    }
    
}
