public class Biscut{

        public static void sunfeast(int sunfeast_price){
                
              
                double gst_on_sunfeast = 0.18 ;

                System.out.println("sunfeast Price:"+sunfeast_price);
                double gst = gst_on_sunfeast*sunfeast_price;
                System.out.println("18% GST:"+gst);
                double total_price = sunfeast_price*gst_on_sunfeast+sunfeast_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void hyde_and_sick(int hyde_and_sick_price){

              
                double gst_on_hyde_and_sick = 0.18 ;

                System.out.println("hyde_and_sick Price:"+hyde_and_sick_price);
                double gst = gst_on_hyde_and_sick*hyde_and_sick_price;
                System.out.println("18% GST:"+gst);
                double total_price = hyde_and_sick_price*gst_on_hyde_and_sick+hyde_and_sick_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void oreo(int oreo_price){

              
                double gst_on_oreo = 0.05 ;

                System.out.println("oreo price:"+oreo_price);
                double gst = gst_on_oreo*oreo_price;
                System.out.println("5% GST:"+gst);
                double total_price = oreo_price*gst_on_oreo+oreo_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void jim_jam (int jim_jam_price){

         
                double gst_on_jim_jam = 0.05 ;

                System.out.println("jim_jam Price:"+jim_jam_price);
                double gst = gst_on_jim_jam*jim_jam_price;
                System.out.println("5% GST:"+gst);
                double total_price = jim_jam_price*gst_on_jim_jam+jim_jam_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void candymell(int candymell_price){

                double gst_on_candymell = 0.12 ;

                System.out.println("candymell Price:"+candymell_price);
                double gst = gst_on_candymell*candymell_price;
                System.out.println("12% GST:"+gst);
                double total_price = candymell_price*gst_on_candymell+candymell_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 