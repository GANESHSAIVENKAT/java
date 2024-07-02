public class Furniture {

        public static void bed(int bed_price){
                
                double gst_on_bed = 0.18 ;
                System.out.println("Bed Price:"+bed_price);
                double gst = gst_on_bed*bed_price;
                System.out.println("18% GST:"+gst);
                double total_price = bed_price*gst_on_bed+bed_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void table(int table_price){

           
                double gst_on_table = 0.18 ;

                System.out.println("Table Price:"+table_price);
                double gst = gst_on_table*table_price;
                System.out.println("18% GST:"+gst);
                double total_price = table_price*gst_on_table+table_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void chair(int chair_price){

          
                double gst_on_chair = 0.05 ;

                System.out.println("Chair Price:"+chair_price);
                double gst = gst_on_chair*chair_price;
                System.out.println("5% GST:"+gst);
                double total_price = chair_price*gst_on_chair+chair_price;
                System.out.println("Total Price with GST:"+total_price);  
        }
        public static void door(int door_price){

             
                double gst_on_door = 0.05 ;

                System.out.println("Door Price:"+door_price);
                double gst = gst_on_door*door_price;
                System.out.println("5% GST:"+gst);
                double total_price = door_price*gst_on_door+door_price;
                System.out.println("Total Price with GST:"+total_price);
        }
        public static void cuboard(int cuboard_price){

             
                double gst_on_cuboard = 0.12 ;

                System.out.println("Cuboard Price:"+cuboard_price);
                double gst = gst_on_cuboard*cuboard_price;
                System.out.println("12% GST:"+gst);
                double total_price = cuboard_price*gst_on_cuboard+cuboard_price;
                System.out.println("Total Price with GST:"+total_price);
        }

}