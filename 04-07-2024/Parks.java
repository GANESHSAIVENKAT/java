public class Parks{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Park Is A Place Where We Get Peace");
			}else{
				System.out.println("Park Is A Place Where We Not Get Peace");
			}
		}
		public static void name(String name){
			boolean park=true;
			if (park){
				System.out.println("Founded in ages:"+name);
			}else{
				System.out.println("No Name");
			}
		}
		
		public static  int rating(){
			int rating=7;
			
			if (rating==7){
				System.out.println("Cubbon Park ");
				
			return 1;	
			}else{
				System.out.println("BBMP park");
			return 2;	
			}
			
		}
		public static String park_details(String park_detail[]){
			for(int index=0;index<park_detail.length;index++)
			{
				System.out.println(park_detail[index]);
			}
			return "End of park_details";
			
		}
		public static int max_rating(int a, int b) {
        
        if (a > b) {
			System.out.println("Tree Park");
            return a;  
        } else {
			System.out.println("BBMP park");
            return b;  
        }
    }
}