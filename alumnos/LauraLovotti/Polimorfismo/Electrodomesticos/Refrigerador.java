public class Refrigerador extends Electrodomestico{
    public Refrigerador (String marca, String capacidad){
        super(marca, capacidad);
    }

    public void funcionar(){
        System.out.println("Soy un refrigerador " + this.marca + " " + this.capacidad + " y sirvo para enfriar comidas");
    }
}