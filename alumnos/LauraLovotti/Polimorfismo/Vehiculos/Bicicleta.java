public class Bicicleta extends Vehiculos{
    public Bicicleta (String marca, String modelo, String color){
        super(marca, modelo, color);
    }
    public void moverse(){
        System.out.println("Soy una bici " + this.marca + " " + this.modelo + " y me muevo en la via");
    }
}