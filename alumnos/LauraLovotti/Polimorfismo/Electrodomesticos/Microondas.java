public class Microondas extends Electrodomestico{
    public Microondas (String marca, String capacidad){
        super(marca, capacidad);
    }

    public void funcionar(){
        System.out.println("Soy un microondas " + this.marca + " " + this.capacidad + " y sirvo para calentar comidas");
    }
}