public class Main {
    public static void main(String[] args){
        try {
            AgenciaEspacial agencia = new AgenciaEspacial();

            NaveExploracion exploracion1 = new NaveExploracion("Explorador 1 ", 5, 2025, tipoMision.CARTOGRAFIA);
            Carguero carguero1 = new Carguero("Carguero 1 ", 3, 2023, 200);
            CruceroEstelar crucero1 = new CruceroEstelar("Star Cruise ", 10, 2024, 500);

            agencia.agregarNave(exploracion1);
            agencia.agregarNave(carguero1);
            agencia.agregarNave(crucero1);

            agencia.mostrarNaves();
            System.out.println();
            agencia.iniciarExploracion();

        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}