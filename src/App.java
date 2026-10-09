public class App {
    public static void main(String[] args) {

        // Ejercicio Libro
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupery");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", false);

        System.out.println("\nLibro 1:");
        libro1.mostrarInfo();
        System.out.println("\nLibro 2:");
        libro2.mostrarInfo();
        System.out.println("\nLibro 3:");
        libro3.mostrarInfo();
        System.out.println("\nPrueba de prestar y devolver:");
        libro2.prestar();
        libro2.devolver();


        // Ejercicio Vuelo
        Vuelo vuelo1 = new Vuelo();
        Vuelo vuelo2 = new Vuelo("AV9401", "Bogota", "Medellin");
        Vuelo vuelo3 = new Vuelo("AV9402", "Cali", "Bogota", 80, 100);

        System.out.println("\nVuelo 1:");
        vuelo1.mostrarInfo();
        System.out.println("\nVuelo 2:");
        vuelo2.mostrarInfo();
        System.out.println("\nVuelo 3:");
        vuelo3.mostrarInfo();
        System.out.println("\nEmbarcar 10 pasajeros en el vuelo 3:");
        vuelo3.embarcar(10);
        vuelo3.mostrarInfo();
        System.out.println("\nDesembarcar 25 pasajeros del vuelo 3:");
        vuelo3.desembarcar(25);
        vuelo3.mostrarInfo();


        // Ejercicio Deposito de agua
        DepositoAgua deposito1 = new DepositoAgua(100, 80);
        DepositoAgua deposito2 = new DepositoAgua(50, 10);

        deposito1.setDepositoDesborde(deposito2);

        System.out.println("\nDeposito 1 antes de agregar agua:");
        deposito1.mostrarEstado();
        System.out.println("\nDeposito 2 antes de agregar agua:");
        deposito2.mostrarEstado();
        System.out.println("\nAgregar 40 litros al deposito 1:");
        deposito1.agregarAgua(40);
        System.out.println("\nDeposito 1 despues del desborde:");
        deposito1.mostrarEstado();
        System.out.println("\nDeposito 2 despues de recibir el sobrante:");
        deposito2.mostrarEstado();
    }
}
