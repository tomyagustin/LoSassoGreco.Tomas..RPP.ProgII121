import java.util.ArrayList;

class AgenciaEspacial {
    private ArrayList<Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) throws NaveYaExisteException{
        if (existeNave(nave.getNombre())) 
        {
            throw new NaveYaExisteException ("La nave " + nave.getNombre() + " ya existe en la coleccion.");
        }
        naves.add(nave);
    }

    private boolean existeNave(String nombre) {
        for (Nave nave : naves) 
        {
            if (nave.getNombre().equalsIgnoreCase(nombre)) 
            {
                return true;
            }
        }
        return false;
    }

    public void mostrarNaves() 
    {
        for (Nave nave : naves) 
        {
            nave.toString();
        }
    }

    public void iniciarExploracion() {
        for (Nave nave : naves) {
            if (nave instanceof NaveExploracion) 
            {
                ((NaveExploracion) nave).explorar();
            } 
            else if (nave instanceof Carguero) 
            {
                ((Carguero) nave).explorar();
            } 
            else if (nave instanceof CruceroEstelar) 
            {
                System.out.println("El crucero estelar " + nave.getNombre() + " no puede participar en misiones de exploracion.");
            }
        }
    }
}