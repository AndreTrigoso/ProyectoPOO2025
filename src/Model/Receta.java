package Model;

public class Receta {
    private Medicamento[] medicamentos;
    private int cantidad;

    public Receta() {
        this.medicamentos = new Medicamento[20];
        this.cantidad = 0;
    }
    
    public void agregar(Medicamento medicamento){
        if(this.cantidad < this.medicamentos.length){
            this.medicamentos[cantidad] = medicamento;
            this.cantidad++;
        }
        else {
            System.out.println("No hay espacio para más medicamentos");
        }
    }
    
     public void eliminarReceta(int indice) {
        if (indice >= 0 && indice < cantidad) {

            for (int i = indice; i < cantidad - 1; i++) {
                medicamentos[i] = medicamentos[i + 1];
            }

            medicamentos[cantidad - 1] = null;
            cantidad--;
            
            System.out.println("Cita eliminada");
        }
        else {
            System.out.println("Receta no encontrada");
        }
    }
    
    public void modificar(int posicion, double dosis, int frecuencia, int duracion, 
                      String nombre, String marca) {
        if (posicion < 0 || posicion >= cantidad) {
        System.out.println("Posición inválida");
        return;
        }

        Medicamento m = medicamentos[posicion];

        m.setDosis(dosis);
        m.setFrecuencia(frecuencia);
        m.setDuracion(duracion);
        m.setNombre(nombre);
        m.setMarca(marca);
        
        System.out.println("Medicamento modificado.");
        }
    
    public void ver() {
    System.out.println("=== Lista de Medicamentos ===");
    for (int i = 0; i < cantidad; i++) {
        Medicamento m = medicamentos[i];

        System.out.println("Nombre: " + m.getNombre());
        System.out.println("Marca: " + m.getMarca());
        System.out.println("Dosis: " + m.getDosis());
        System.out.println("Frecuencia: " + m.getFrecuencia());
        System.out.println("Duración: " + m.getDuracion());
        System.out.println("-----------------------------");
    }
}
}
