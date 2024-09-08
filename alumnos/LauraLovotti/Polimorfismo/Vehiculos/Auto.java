public class Auto extends Vehiculos{
    public Auto (String marca, String modelo, String color){
        super(marca, modelo, color);
    }
    public void moverse(){
        System.out.println("Soy un auto " + this.marca + " " + this.modelo + " y me muevo en la carretera");
    }
}