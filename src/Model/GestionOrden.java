package Model;

public class GestionOrden {
    
    private Orden[] ordenes;
    private int cantidad;

    public GestionOrden() {
        ordenes = new Orden[50];
        cantidad = 0;
    }

    public void agregarOrden(Orden o) {
        if (cantidad < ordenes.length) {
            ordenes[cantidad] = o;
            cantidad++;
        }
    }

    public void eliminarOrden(int index) {
        if (index >= 0 && index < cantidad) {
            for (int i = index; i < cantidad - 1; i++) {
                ordenes[i] = ordenes[i+1];
            }
            cantidad--;
            ordenes[cantidad] = null;
        }
    }

    public Orden getOrdenes(int i) {
        return ordenes[i];
    }
    
    public Orden[] getListaOrdenes() {
        return ordenes;
    }

    public int getCantidadOrdenes() {
        return cantidad;
    }
    

    public void modificarOrden(int indice,String nombre, String descripcion, double precio, String estado) {

            Orden o = ordenes[indice];

            o.setNombre(nombre);
            o.setPrecio(precio);
            o.setDescripcion(descripcion);
            o.setEstado(estado);
        }
}


