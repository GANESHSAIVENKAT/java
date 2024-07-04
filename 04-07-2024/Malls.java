public class Malls{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Malls is a large indoor shopping center, usually anchored by department stores.");
			}else{
				System.out.println("Null");
			}
		}
		public static void name(String name){
			boolean Mall=true;
			if (Mall){
				System.out.println("Mall Name Is"+name);
			}else{
				System.out.println("Null");
			}
		}
		
		public static  int rating(){
			int rating=5;
			
			if (rating==7){
				System.out.println("Nexus Mall Koramangala");
				
			return 1;	
			}else{
				System.out.println("Gopalan Innovation Mall");
			return 2;	
			}
			
		}
		public static String mall_details(String mall_detail[]){
			for(int index=0;index<mall_detail.length;index++)
			{
				System.out.println(mall_detail[index]);
			}
			return "End of mall_details";
			
		}
		public static int max_rating(int a, int b) {
        
        if (a > b) {
			System.out.println("All Requirements Are Available");
            return a;  
        } else {
			System.out.println("All Requirements Are Not Available");
            return b;  
        }
    }

}