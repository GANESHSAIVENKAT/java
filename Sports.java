public class Sports{

        public static void bat(int bat_price){
                
              
                double gst_on_bat = 0.18 ;

                System.out.println("Bat Price:"+bat_price);
                double gst = gst_on_bat*bat_price;
                System.out.println("18% GST:"+gst);
                double total_price = bat_price*gst_on_bat+bat_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void ball(int ball_price){

              
                double gst_on_ball = 0.18 ;

                System.out.println("Ball Price:"+ball_price);
                double gst = gst_on_ball*ball_price;
                System.out.println("18% GST:"+gst);
                double total_price = ball_price*gst_on_ball+ball_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void wickets(int wickets_price){

              
                double gst_on_wickets = 0.05 ;

                System.out.println("Wickets Price:"+wickets_price);
                double gst = gst_on_wickets*wickets_price;
                System.out.println("5% GST:"+gst);
                double total_price = wickets_price*gst_on_wickets+wickets_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void helmet(int helmet_price){

         
                double gst_on_helmet = 0.05 ;

                System.out.println("Helmet Price:"+helmet_price);
                double gst = gst_on_helmet*helmet_price;
                System.out.println("5% GST:"+gst);
                double total_price = helmet_price*gst_on_helmet+helmet_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void handband(int handband_price){

                double gst_on_handband = 0.12 ;

                System.out.println("Handband Price:"+handband_price);
                double gst = gst_on_handband*handband_price;
                System.out.println("12% GST:"+gst);
                double total_price = handband_price*gst_on_handband+handband_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 