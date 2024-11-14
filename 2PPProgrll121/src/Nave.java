public class Nave{
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;
    
    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento)
    {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public String getNombre(){
        return nombre;
    }
}
