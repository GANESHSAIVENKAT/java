public class Shopping{
	
		
		 public static void details (String shopping_type ){
			System.out.println("Shopping type is:"+" "+shopping_type);
			
		}
		public static void cloth(int cloth_price){
                
              
                double gst_on_cloth = 0.18 ;

                System.out.println("cloth Price:"+cloth_price);
                double gst = gst_on_cloth*cloth_price;
                System.out.println("18% GST:"+gst);
                double total_price = gst+cloth_price;
                System.out.println("Total Price with GST:"+total_price);
        }
		
		public static void details (String shopping_type,String iteam_name ){
			System.out.println("Shopping type and product is:"+" "+shopping_type+" "+iteam_name);
			
		}
		public static void details (String shopping_type,String iteam_name,int product_price,float ratings ){
			System.out.println("Shopping type and product is:"+" "+shopping_type+" "+iteam_name+" "+product_price+" "+ratings);
			
		}
		
		
		
	
	
	
	
	
	
	
}