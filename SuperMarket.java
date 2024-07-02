public class SuperMarket {

        public static void grocery(int grocery_price){
                
                //18% GST on Groceries
                double gst_on_grocery = 0.18 ;

                System.out.println("Grocery Price:"+grocery_price);
                double gst = gst_on_grocery*grocery_price;
                System.out.println("18% GST:"+gst);
                double total_price = grocery_price*gst_on_grocery+grocery_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void frozen_food(int frozen_food_price){

              //18% GST on Frozen Foods
                double gst_on_frozen_food = 0.18 ;

                System.out.println("Frozen Food Price:"+frozen_food_price);
                double gst = gst_on_frozen_food*frozen_food_price;
                System.out.println("18% GST:"+gst);
                double total_price = frozen_food_price*gst_on_frozen_food+frozen_food_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void snacks(int snacks_price){

              //5% GST on Snacks
                double gst_on_snacks = 0.05 ;

                System.out.println("Snacks Price:"+snacks_price);
                double gst = gst_on_snacks*snacks_price;
                System.out.println("5% GST:"+gst);
                double total_price = snacks_price*gst_on_snacks+snacks_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void beverages(int beverages_price){

              //5% GST on Beverages
                double gst_on_beverages = 0.05 ;

                System.out.println("Beverages Price:"+beverages_price);
                double gst = gst_on_beverages*beverages_price;
                System.out.println("5% GST:"+gst);
                double total_price = beverages_price*gst_on_beverages+beverages_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void dry_friuts(int dry_friuts_price){

              //12% GST on Dry Fruits
                double gst_on_dry_fruits = 0.12 ;

                System.out.println("Dry Fruits Price:"+dry_friuts_price);
                double gst = gst_on_dry_fruits*dry_friuts_price;
                System.out.println("12% GST:"+gst);
                double total_price = dry_friuts_price*gst_on_dry_fruits+dry_friuts_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}