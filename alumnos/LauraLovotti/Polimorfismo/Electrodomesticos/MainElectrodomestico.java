public class MainElectrodomestico{

    public static void main (String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico [3];
        
        electrodomesticos[0] = new Lavadora ("Drean", "10 kg");
        electrodomesticos[1] = new Microondas ("Philco", "20 lts");
        electrodomesticos[2] = new Refrigerador ("Gafa", "374 lts");
    

        for (Electrodomestico electrodomestico: electrodomesticos){
            electrodomestico.funcionar();
        }
    }
}


