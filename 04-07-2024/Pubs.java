public class Pubs{
	public static void getinfo(){
			boolean getinfo=true;
			if (getinfo){
				System.out.println("Pub  is a drinking establishment licensed to serve alcoholic drinks for consumption on the premises.");
			}else{
				System.out.println("Null");
			}
		}
		public static void name(String name){
			boolean pubs=true;
			if (pubs){
				System.out.println("Founded in 17th Century:"+name);
			}else{
				System.out.println("Null");
			}
		}
		
		public static  int rating(){
			int rating=7;
			
			if (rating==7){
				System.out.println("Toit Brewpub");
				
			return 1;	
			}else{
				System.out.println("The Gypsy Pub");
			return 2;	
			}
			
		}
		public static String pub_details(String pub_detail[]){
			for(int index=0;index<pub_detail.length;index++)
			{
				System.out.println(pub_detail[index]);
			}
			return "End of pub_details";
			
		}
		public static int max_rating(int a, int b) {
        
        if (a > b) {
			System.out.println("The Gypsy Pub");
            return a;  
        } else {
			System.out.println("Toit Brewpub");
            return b;  
        }
    }



}