public class NaveExploracion extends Nave implements Exploracion{
    private tipoMision tipoMision;
    
    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, tipoMision tipomision){
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    public void explorar(){
        System.out.println("La nave de exploracion " + nombre + "empezo su exploracion");
    }
    
    @Override
    public String toString(){
        
        return "Nave de Exploración - Nombre: " + nombre + ", Capacidad Tripulacion: " + capacidadTripulacion +
                           ", Anio de Lanzamiento: " + anioLanzamiento + ", Tipo de Mision: " + tipoMision;
    }
}