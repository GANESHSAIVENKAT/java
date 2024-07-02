public class Crickettask{
	
		
		 public static void player (String player_name ){
			System.out.println("Playername is:"+" "+player_name);
			
		}
		public static void player (int player_score ){
			System.out.println("Playerscore is:"+" "+player_score);
			int no_of_overs=7;
			double runrate=player_score/no_of_overs;
			System.out.println("Player_run_rate is:"+" "+runrate);
		}
        
		
		public static void match_result (String match_result ){
			System.out.println("Match Won by:"+" "+match_result);
			
		}
		public static void match (boolean players ){
			if(players){
			System.out.println("Accepted:11");	
			}
			
			
		}
		public static void details (String player_name,int age,float height,double weight,String education,int total_matches,int total_score ){
			System.out.println("Player details :"+" "+player_name+" "+age+" "+height+" "+weight+" "+education+" "+total_matches+" "+total_score);
			
		}
		
	
	
	
	
	
	
	
}