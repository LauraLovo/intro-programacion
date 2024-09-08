public class Barco extends Vehiculos{
    public Barco (String marca, String modelo, String color){
        super(marca, modelo, color);
    }
    public void moverse(){
        System.out.println("Soy un barco " + this.marca + " " + this.modelo + " y me muevo en el agua");
    }
}