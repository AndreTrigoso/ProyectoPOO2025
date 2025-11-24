package Model;

public class GestionOrden {
    
    private Orden[] ordenes;
    private int cantidadOrdenes;

    public GestionOrden() {
        
        this.ordenes = new Orden[20];  
        this.cantidadOrdenes = 0;
    }

    
    
   
    
    public void agregarOrden(Orden orden) {
    if (this.cantidadOrdenes < this.ordenes.length) {
        this.ordenes[cantidadOrdenes] = orden;
        this.cantidadOrdenes++;
        }
    }
    
    public void modificarOrden(int indice,String nombre, String descripcion, double precio, String estado) {

            Orden o = ordenes[indice];

            o.setNombre(nombre);
            o.setPrecio(precio);
            o.setDescripcion(descripcion);
            o.setEstado(estado);
        }
    public void eliminarOrden(int fila) {

        for (int i = 0; i < cantidadOrdenes - 1; i++) {
            ordenes[i] = ordenes[i + 1];
        }

        ordenes[cantidadOrdenes - 1] = null;
        cantidadOrdenes--;
    }
    
    public Orden getOrdenes(int i){
        return ordenes[i];
    }

    public Orden[] getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Orden[] ordenes) {
        this.ordenes = ordenes;
    }

    public int getCantidadOrdenes() {
        return cantidadOrdenes;
    }

    public void setCantidadOrdenes(int cantidadOrdenes) {
        this.cantidadOrdenes = cantidadOrdenes;
    }
}


