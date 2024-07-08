public class Hi_Anime{
	public static void Anime_info(){
	String anime_Name="Naruto";
	System.out.println("Favourite anime is:"+anime_Name);
	}
	public static void Anime_info(String anime, int totalepisode){
	System.out.println("Anime name:"+anime);
	System.out.println("Total Episodes is:"+totalepisode);		
		
	}
	public static String Anime_info(int totalepisode){
		String anime_name="Boruto";
	    System.out.println("Anime name:"+anime_name+"Total Episodes :"+totalepisode);
	return "End";		
		
	}
	public static void Anime_info(String animes[]){
for(int index=0;index<animes.length;index++){
System.out.println("Required animes are:"+animes[index]);
}
}



}