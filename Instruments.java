public class Instruments{

        public static void flute(int flute_price){
                
              
                double gst_on_flute = 0.18 ;

                System.out.println("flute Price:"+flute_price);
                double gst = gst_on_flute*flute_price;
                System.out.println("18% GST:"+gst);
                double total_price = flute_price*gst_on_flute+flute_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void piyano(int piyano_price){

              
                double gst_on_piyano = 0.18 ;

                System.out.println("piyano Price:"+piyano_price);
                double gst = gst_on_piyano*piyano_price;
                System.out.println("18% GST:"+gst);
                double total_price = piyano_price*gst_on_piyano+piyano_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void drum(int drum_price){

              
                double gst_on_drum = 0.05 ;

                System.out.println("drumprice:"+drum_price);
                double gst = gst_on_drum*drum_price;
                System.out.println("5% GST:"+gst);
                double total_price = drum_price*gst_on_drum+drum_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void guitar (int guitar_price){

         
                double gst_on_guitar = 0.05 ;

                System.out.println("guitar Price:"+guitar_price);
                double gst = gst_on_guitar*guitar_price;
                System.out.println("5% GST:"+gst);
                double total_price = guitar_price*gst_on_guitar+guitar_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void sitar(int sitar_price){

                double gst_on_sitar = 0.12 ;

                System.out.println("sitar Price:"+sitar_price);
                double gst = gst_on_sitar*sitar_price;
                System.out.println("12% GST:"+gst);
                double total_price = sitar_price*gst_on_sitar+sitar_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}
	 