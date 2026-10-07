public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public double getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(double capacidad){
        if(capacidad > 0){
            this.capacidad = capacidad;
        }
        else{

            System.out.println("La capacidad debe ser mayor a 0");
        }
    }

    public double getVolumenActual(){
        return volumenActual;
    }

    public void setVolumenActual(double volumenActual){
        if(volumenActual >= 0 && volumenActual <= capacidad){
            this.volumenActual = volumenActual;
        }else{
            System.out.println("El volumen no es valido");
        }

    }

    public DepositoAgua getDepoditoDesborde(){
        return depositoDesborde;
    }

    public void depositoDesborde(DepositoAgua depositoDesborde){
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarEstado(){

        double espacioLibre = capacidad - volumenActual;

        System.out.println("Capacidad : "+ capacidad);
        System.out.println("Volumen actual: "+ volumenActual);
        System.out.println("Espacio libre: "+ espacioLibre);
    }

    public void agregarAgua(double cantidad){
        double espacioLibre = capacidad - volumenActual;

        if (cantidad <= espacioLibre) {
            volumenActual += cantidad;
    }else{
        double sobrante = cantidad - espacioLibre;
        volumenActual = capacidad;
        System.out.println("El deposito se lleno y sobro " + sobrante + " litros de agua");

        if (depositoDesborde != null) {
            depositoDesborde.agregarAgua(sobrante);
        } else {
            System.out.println("No hay un deposito de desborde para recibir el sobrante.");
        }
    }

    }


    public void quitarAgua(double cantidad){
        if (cantidad <= volumenActual) {
            volumenActual -= cantidad;
        } else {
            volumenActual = 0;
            System.out.println("No hay suficiente agua en el deposito para quitar " + cantidad + " litros.");
        }
    }
}