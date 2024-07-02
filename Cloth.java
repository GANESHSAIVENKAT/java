public class Cloth{

        public static void sharwani(int sharwani_price){
                
              
                double gst_on_sharwani = 0.18 ;

                System.out.println("Sharwani Price:"+sharwani_price);
                double gst = gst_on_sharwani*sharwani_price;
                System.out.println("18% GST:"+gst);
                double total_price = sharwani_price*gst_on_sharwani+sharwani_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void blazer(int blazer_price){

              
                double gst_on_blazer = 0.18 ;

                System.out.println("Blazer Price:"+blazer_price);
                double gst = gst_on_blazer*blazer_price;
                System.out.println("18% GST:"+gst);
                double total_price = blazer_price*gst_on_blazer+blazer_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void cotton(int cotton_price){

              
                double gst_on_cotton = 0.05 ;

                System.out.println("Cotton Price:"+cotton_price);
                double gst = gst_on_cotton*cotton_price;
                System.out.println("5% GST:"+gst);
                double total_price = cotton_price*gst_on_cotton+cotton_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void jens(int jens_price){

         
                double gst_on_jens = 0.05 ;

                System.out.println("Jens Price:"+jens_price);
                double gst = gst_on_jens*jens_price;
                System.out.println("5% GST:"+gst);
                double total_price = jens_price*gst_on_jens+jens_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void casual(int casual_price){

                double gst_on_casual = 0.12 ;

                System.out.println("casualshirt Price:"+casual_price);
                double gst = gst_on_casual*casual_price;
                System.out.println("12% GST:"+gst);
                double total_price = casual_price*gst_on_casual+casual_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 