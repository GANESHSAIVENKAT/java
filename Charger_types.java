public class Charger_types {
    public static void main(String[] args) {
        // Declare arrays of different types
        String[] type_of_chargers = {"Type-C", "Type-B", "USB-mini","USB-micro"};
        long[] charger_price = {500,680,200,100};
      
    
        for (int i = 0; i < type_of_chargers.length; i++) {
            System.out.println("type_of_chargers:"+type_of_chargers[i]);
        }

    
        for (int i = 0; i < charger_price.length; i++) {
            System.out.println("charger_price:"+charger_price[i]);
        }

 
    
    }
}