public class App {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint-Exupery");
        libro1.setDisponible(true);

        libro2.setTitulo("Cien añoss de soledad");
        libro2.setAutor("Gabriel Garcia Marquez");
        libro2.setDisponible(true);

        System.out.println("LIBRO 1: ");
        libro1.mostrarInfo();
        System.out.println("LIBRO 2: ");
        libro2.mostrarInfo();

        System.out.println("\nPRESTAR LIBRO 1");
        libro1.prestar();
        System.out.println("\nPRESTAR LIBRO 2");
        libro2.prestar();

        System.out.println("\nDEVOLVER LIBRO 1");
        libro1.devolver();
        System.out.println("\nDEVOLVER LIBRO 2");
        libro2.devolver();



    //CLASE VUELO

        Vuelo v1 = new Vuelo();
        Vuelo v2 = new Vuelo();

        v1.setNumero("AV9401");
        v1.setOrigen("Bogota");
        v1.setDestino("Medellin");
        v1.setCapacidadMaxima(100);
        v1.setOcupacion(50);

        v2.setNumero("AV9402");
        v2.setOrigen("Cali");
        v2.setDestino("Bogota");
        v2.setCapacidadMaxima(100);
        v2.setOcupacion(80);

        System.out.println("\nVUELO 1: ");
        v1.mostrarInfo();
        System.out.println("\nVUELO 2: ");
        v2.mostrarInfo();

        System.out.println("\nEmbarcacion Vuelo 1");
        v1.embarcar(20);
        System.out.println("\nEmbarcacion Vuelo 2");
        v2.embarcar(10);

        System.out.println("\nVUELO 1: ");
        v1.desembarcar(40);
        System.out.println("\nVUELO 2: ");
        v2.desembarcar(80);

        //CLASE DEPOSITO DE AGUA

        DepositoAgua deposito1 = new DepositoAgua();
        DepositoAgua deposito2 = new DepositoAgua();

        deposito1.setCapacidad(100);
        deposito1.setVolumenActual(80);

        deposito2.setCapacidad(50);
        deposito2.setVolumenActual(10);

        deposito1.depositoDesborde(deposito2);

        System.out.println("\nDEPOSITO 1: ");
        deposito1.mostrarEstado();

        System.out.println("\nDEPOSITO 2: ");
        deposito2.mostrarEstado();

        System.out.println("\nAGREGAR AGUA DEPOSITO 1");
        deposito1.agregarAgua(40);

        System.out.println("\nDEPOSITO 1: ");
        deposito1.mostrarEstado();

        System.out.println("\nDEPOSITO 2: ");
        deposito2.mostrarEstado();

        System.out.println("\nQUITAR AGUA DEPOSITO 1");
        deposito1.quitarAgua(30);

        System.out.println("\nDEPOSITO 1: ");
        deposito1.mostrarEstado();


    }

}