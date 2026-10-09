public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public Vuelo(){
    }

    public Vuelo(String numero, String origen, String destino){
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
    }

    public Vuelo(String numero, String origen, String destino, 
        int ocupacion, int capacidadMaxima){
            this.numero = numero;
            this.origen = origen;
            this.destino = destino;
            this.ocupacion = ocupacion;
            this.capacidadMaxima= capacidadMaxima;
        }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;

    }
    

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public int getOcupacion(){
        return ocupacion;
    }

    public void setOcupacion(int ocupacion){

        if (ocupacion >= 0 && ocupacion <= capacidadMaxima) {
            this.ocupacion = ocupacion;

        }else {
            System.out.println("La ocupacion no es valida.");
        }
    
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("Codigo del vuelo: " + numero);
        System.out.println("Ciudad de origen: " + origen);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Numero de pasajeros a bordo: " + ocupacion);
        System.out.println("Maximo de pasajeros permitidos: " + capacidadMaxima);
    }

    public void embarcar(int pasajeros){
        if(pasajeros + ocupacion <=  capacidadMaxima){
            ocupacion += pasajeros;
            System.out.println("Se embarcaron " + pasajeros + " pasajeros.");
        }else{
            System.out.println("El numero de pasajeros excedio la capacidad maxima");
        }

    }

    public void desembarcar(int pasajeros){
        if(ocupacion - pasajeros >=0){
            ocupacion -= pasajeros;
            System.out.println("Desembarcaron " + pasajeros + " pasajeros.");
        }
        if (ocupacion == 0){
            System.out.println("se han desembarcado todos los pasajeros");
        }
    }

}
