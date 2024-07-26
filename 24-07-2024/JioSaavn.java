public class JioSaavn {

		public static void user(){
			String username = "ABCD";
		String password = "ABHKL@56536";
		System.out.println("Eneter the user name:"+username);
		if(username!=password){
		System.out.println("Entered correct password:"+password);
		}else{
		System.out.println("Forget Password");
		}
		premium(400,5000000L);
		download("Bluebird",true);
	}
		public static void premium(int amount,long users){
			
		System.out.println("Not Free app :"+amount);
		System.out.println("Users of app :"+users);
	}
		public static void download(String songs,boolean song){
		
		System.out.println("Song Name::"+songs);
		System.out.println("Is song Correct"+song);
	
	}

	public static void premium(long no_of_songs,byte goldpremiumcost){
		
		System.out.println("Number of songs :"+no_of_songs);
		
		System.out.println("Goldpremiumcost"+goldpremiumcost);
		
	}
		public static void premium(String song_type,boolean song_play){
		
		System.out.println("Is songs playing:"+song_play);
		
		System.out.println("Song type"+song_type);
		}
}

	
