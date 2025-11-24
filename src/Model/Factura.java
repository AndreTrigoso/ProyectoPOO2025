package Model;

public class Factura {
    private String numero;
    private String descripcion;
    private String monto;
    private double calculo;

    public Factura(String numero, String descripcion, Orden orden, Consulta consulta) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.calculo = orden.getPrecio() + consulta.getPrecio();
        this.monto = "" + this.calculo;
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

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    

    public String verInfo() {
        return "\nNumero: " + this.numero 
                + "\nDescripcion: " + this.descripcion
                + "\nMonto: " + this.monto;
    }
    
    
}
