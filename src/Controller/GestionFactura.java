package Controller;

import Model.Factura;

public class GestionFactura {
    private Factura[] facturas;
    private int cantidad;

    public GestionFactura() {
        this.facturas = new Factura[50];
        this.cantidad = 0;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void crearFactura(String numero, String descripcion, String monto) {
        if (cantidad < facturas.length) {


        facturas[cantidad] = new Factura(numero, descripcion, monto);
        cantidad++;

        }
    }
    
    public void eliminarFactura() {
        for (int i = 0; i < cantidad - 1; i++) {
            facturas[i] = facturas[i + 1];
        }

        facturas[cantidad - 1] = null;
        cantidad--;
    }
    
    public boolean existeFactura(String numero) {
        for (int i = 0; i < cantidad; i++) {
            if (facturas[i].getNumero().equalsIgnoreCase(numero)) {
                return true;
            }
        }
        return false;
    }
    
    public void modificarFactura(int fila, String numero, String descripcion, String monto) {
        Factura f = facturas[fila];
        f.setNumero(numero);
        f.setDescripcion(descripcion);
        f.setMonto(monto);
}
}
