public class App {
    public static void main(String[] args) {
        Libro Libro1 = new Libro();
        Libro Libro2 = new Libro();
        Libro1.setTitulo("Crepusculo");
        Libro1.setAutor("Stephenie Meyer");
        Libro1.setDisponible(true);
        Libro2.setTitulo("El Principito");
        Libro2.setAutor("Antoine de Saint-Exupéry");
        Libro2.setDisponible(false);
        libro1.mostrarInfo();
        libro1.prestar();
        libro2.mostrarInfo();
        libro2.prestar();
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.isDisponible());



    }


}
