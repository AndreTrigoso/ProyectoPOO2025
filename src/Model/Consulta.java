package Model;

public class Consulta {
    private String motivo;
    private double precio;
    private String estado;
    private String antecedentes;
    private String signosVitales;
    private String examenesFisicos;
    private String diagnosticos;
    private Receta receta;
    private Orden[] ordenes;
    private int cantidadOrdenes;
    private String plan;
    private Cita cita;

    public Consulta() {
       this.ordenes = new Orden[20];  
       this.cantidadOrdenes = 0;
    }

    
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenesFisicos() {
        return examenesFisicos;
    }

    public void setExamenesFisicos(String examenesFisicos) {
        this.examenesFisicos = examenesFisicos;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
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

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public void setOrden(Orden[] orden) {
        this.ordenes = orden;
        this.cantidadOrdenes = orden.length;
    }
    
    public void abrir() {
        this.estado = "Abierta";
    }
    
    public void cerrar() {
        this.estado = "Cerrada";
    }
    
    public void agregarReceta(Receta receta){
        this.receta = receta;
    }
    
    public Orden getOrdenes(int i){
        return ordenes[i];
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
}


