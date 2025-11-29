package Model;

public class Factura {
    private String numero;
    private String descripcion;
    private double monto;

    public Factura(String numero, String descripcion, double monto) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    

    public String verInfo() {
        return "\nNumero: " + this.numero 
                + "\nDescripcion: " + this.descripcion
                + "\nMonto: " + this.monto;
    }
    
    
}
