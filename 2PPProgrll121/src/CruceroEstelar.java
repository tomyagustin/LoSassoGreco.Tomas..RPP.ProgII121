public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;
    
    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros)
    {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public String toString(){
        return "Crucero Estelar - Nombre: " + nombre + ", Capacidad Tripulacion: " + capacidadTripulacion +
                           ", Anio de Lanzamiento: " + anioLanzamiento + ", Cantidad de Pasajeros: " + cantidadPasajeros;
    }
}
