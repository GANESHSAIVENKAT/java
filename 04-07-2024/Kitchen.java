public class Kitchen{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("A kitchen is a room or part of a room used for cooking and food preparation.");
			}else{
				System.out.println("Null");
			}
		}
		public static void name(String uses){
			boolean found=true;
			if (found){
				System.out.println(" kitchen following Taylorist principles of efficiency.");
			}else{
				System.out.println("No use");
			}
		}
		
		public static  int detail(){
			int detail=1648;
			
			if (detail==1648){
				System.out.println("Kitchen is present around many years");
				
			return 1;	
			}else{
				System.out.println("null");
			return 2;	
			}
			
		}
		public static String kitchen_details(String info_kitchen[]){
			for(int index=0;index<info_kitchen.length;index++)
			{
				System.out.println(info_kitchen[index]);
			}
			return "End of info_kitchen";

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