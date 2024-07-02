public class Travel{

        public static void bet_dwaraka(int boat_price){
                
              
                double gst_on_boat = 0.18 ;

                System.out.println("Boat Price:"+boat_price);
                double gst = gst_on_boat*boat_price;
                System.out.println("18% GST:"+gst);
                double total_price = boat_price*gst_on_boat+boat_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void karnataka(int train_price){

              
                double gst_on_train = 0.18 ;

                System.out.println("Train Price:"+train_price);
                double gst = gst_on_train*train_price;
                System.out.println("18% GST:"+gst);
                double total_price = train_price*gst_on_train+train_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void chennai(int bus_price){

              
                double gst_on_bus = 0.05 ;

                System.out.println("BusPrice:"+bus_price);
                double gst = gst_on_bus*bus_price;
                System.out.println("5% GST:"+gst);
                double total_price = bus_price*gst_on_bus+bus_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void goa(int bus_price){

         
                double gst_on_bus = 0.05 ;

                System.out.println("Bus Price:"+bus_price);
                double gst = gst_on_bus*bus_price;
                System.out.println("5% GST:"+gst);
                double total_price = bus_price*gst_on_bus+bus_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void america(int america_price){

                double gst_on_america = 0.12 ;

                System.out.println("America Price:"+america_price);
                double gst = gst_on_america*america_price;
                System.out.println("12% GST:"+gst);
                double total_price = america_price*gst_on_america+america_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 