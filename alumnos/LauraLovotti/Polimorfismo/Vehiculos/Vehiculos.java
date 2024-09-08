abstract public class Vehiculos{
    String marca;
    String modelo;
    String color;

    public Vehiculos (String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    abstract public void moverse();
}