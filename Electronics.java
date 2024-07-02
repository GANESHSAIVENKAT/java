public class Electronics{

        public static void speaker(int speaker_price){
                
              
                double gst_on_speaker = 0.18 ;

                System.out.println("Speaker Price:"+speaker_price);
                double gst = gst_on_speaker*speaker_price;
                System.out.println("18% GST:"+gst);
                double total_price = speaker_price*gst_on_speaker+speaker_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void earphone(int earphone_price){

              
                double gst_on_earphone = 0.18 ;

                System.out.println("Earphone Price:"+earphone_price);
                double gst = gst_on_earphone*earphone_price;
                System.out.println("18% GST:"+gst);
                double total_price = earphone_price*gst_on_earphone+earphone_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void charger(int charger_price){

              
                double gst_on_charger = 0.05 ;

                System.out.println("Charger Price:"+charger_price);
                double gst = gst_on_charger*charger_price;
                System.out.println("5% GST:"+gst);
                double total_price = charger_price*gst_on_charger+charger_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void repairkit(int repairkit_price){

         
                double gst_on_repairkit = 0.05 ;

                System.out.println("Repairkit Price:"+repairkit_price);
                double gst = gst_on_repairkit*repairkit_price;
                System.out.println("5% GST:"+gst);
                double total_price = repairkit_price*gst_on_repairkit+repairkit_price;
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
	 