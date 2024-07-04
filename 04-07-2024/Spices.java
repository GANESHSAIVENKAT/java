public class Spices{
public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Spices Are Parts Of plants");
			}else{
				System.out.println("Spices Are Not Parts Of plants");
			}
		}
		public static void name(String uses){
			boolean found=true;
			if (found){
				System.out.println("Uses To Preserve Food");
			}else{
				System.out.println("No use");
			}
		}
		
		public static  int rating(){
			int rating=7;
			
			if (rating==5){
				System.out.println("Used around 4500years back");
				
			return 1;	
			}else{
				System.out.println("Used around Recently");
			return 2;	
			}
			
		}
		public static String spices_details(String info_spices[]){
			for(int index=0;index<info_spices.length;index++)
			{
				System.out.println(info_spices[index]);
			}
			return "End of info_spices";

		}
		public static int max_rating(int a, int b) {
        
        if (a > b) {
			System.out.println("Spices Are Useful To Make Dish Tasty");
            return a;  
        } else {
			System.out.println("Spices Are Not Useful To Make Dish Tasty");
            return b;  
        }
    }

}