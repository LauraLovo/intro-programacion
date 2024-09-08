public class MainVehiculos {
    
    public static void main(String[] args) {
        Vehiculos[] vehiculos = new Vehiculos[3];
        
        vehiculos[0] = new Auto("Fiat", "600", "blanco");
        vehiculos[1] = new Barco("Jeanneau", "42", "celeste");
        vehiculos[2] = new Bicicleta("Tomaselli", "Paseo", "fucsia");

        for (Vehiculos vehiculo:vehiculos){
            vehiculo.moverse();
        }
    }
}
