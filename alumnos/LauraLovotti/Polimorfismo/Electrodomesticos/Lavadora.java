public class Lavadora extends Electrodomestico{
    public Lavadora (String marca, String capacidad){
        super(marca, capacidad);
    }

    public void funcionar(){
        System.out.println("Soy una lavadora " + this.marca + " " + this.capacidad + " y sirvo para lavar la ropa");
    }
}