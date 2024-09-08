abstract public class Electrodomestico{
    String marca;
    String capacidad;

    public Electrodomestico (String marca, String capacidad){
        this.marca = marca;
        this.capacidad = capacidad;
    }

    abstract public void funcionar();
}