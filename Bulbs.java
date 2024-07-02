public class Bulbs{

        public static void watts2bulb(int watts2bulb_price){
                
              
                double gst_on_watts2bulb = 0.18 ;

                System.out.println("2wattsbulb Price:"+watts2bulb_price);
                double gst = gst_on_watts2bulb*watts2bulb_price;
                System.out.println("18% GST:"+gst);
                double total_price = watts2bulb_price*gst_on_watts2bulb+watts2bulb_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void watts4bulb(int watts4bulb_price){

              
                double gst_on_watts4bulb = 0.18 ;

                System.out.println("4wattsbulb Price:"+watts4bulb_price);
                double gst = gst_on_watts4bulb*watts4bulb_price;
                System.out.println("18% GST:"+gst);
                double total_price = watts4bulb_price*gst_on_watts4bulb+watts4bulb_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void watts0bulb(int watts0bulb_price){

              
                double gst_on_watts0bulb = 0.05 ;

                System.out.println("watts0bulb price:"+watts0bulb_price);
                double gst = gst_on_watts0bulb*watts0bulb_price;
                System.out.println("5% GST:"+gst);
                double total_price = watts0bulb_price*gst_on_watts0bulb+watts0bulb_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void watts10bulb(int watts10bulb_price){

         
                double gst_on_watts10bulb = 0.05 ;

                System.out.println("watts10bulb Price:"+watts10bulb_price);
                double gst = gst_on_watts10bulb*watts10bulb_price;
                System.out.println("5% GST:"+gst);
                double total_price = watts10bulb_price*gst_on_watts10bulb+watts10bulb_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void watts16bulb(int watts16bulb_price){

                double gst_on_watts16bulb = 0.12 ;

                System.out.println("watts16bulb Price:"+watts16bulb_price);
                double gst = gst_on_watts16bulb*watts16bulb_price;
                System.out.println("12% GST:"+gst);
                double total_price = watts16bulb_price*gst_on_watts16bulb+watts16bulb_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 