public class Carguero extends Nave{
    private int capacidadCarga;
    
    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga)
    {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if (capacidadCarga < 100 || capacidadCarga > 500){
            throw new IllegalArgumentException("La capacidad de carga debe ser entre 100 y 500 toneladas");
        }
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public String toString(){
        return "Carguero - Nombre: " + nombre + ", Capacidad Tripulacion: " + capacidadTripulacion +
                           ", Anio de Lanzamiento: " + anioLanzamiento + ", Capacidad de Carga: " + capacidadCarga + " toneladas";
    }
}
