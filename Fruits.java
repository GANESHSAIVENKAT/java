public class Fruits{

        public static void apple(int apple_price){
                
              
                double gst_on_apple = 0.18 ;

                System.out.println("Apple Price:"+apple_price);
                double gst = gst_on_apple*apple_price;
                System.out.println("18% GST:"+gst);
                double total_price = apple_price*gst_on_apple+apple_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void mango(int mango_price){

              
                double gst_on_mango = 0.18 ;

                System.out.println("Mango Price:"+mango_price);
                double gst = gst_on_mango*mango_price;
                System.out.println("18% GST:"+gst);
                double total_price = mango_price*gst_on_mango+mango_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void cherry(int cherry_price){

              
                double gst_on_cherry = 0.05 ;

                System.out.println("CheeryPrice:"+cherry_price);
                double gst = gst_on_cherry*cherry_price;
                System.out.println("5% GST:"+gst);
                double total_price = cherry_price*gst_on_cherry+cherry_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void guva(int guva_price){

         
                double gst_on_guva = 0.05 ;

                System.out.println("Guva Price:"+guva_price);
                double gst = gst_on_guva*guva_price;
                System.out.println("5% GST:"+gst);
                double total_price = guva_price*gst_on_guva+guva_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void amla(int amla_price){

                double gst_on_amla = 0.12 ;

                System.out.println("Amla Price:"+amla_price);
                double gst = gst_on_amla*amla_price;
                System.out.println("12% GST:"+gst);
                double total_price = amla_price*gst_on_amla+amla_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 