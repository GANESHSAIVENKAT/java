public class Anime9{
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
	    System.out.println("Anime name:"+anime_name+"Total Episodes is:"+totalepisode);
	return "end";		
		
	}
	public static void Anime_info(String name){
	int episodes =2;
	System.out.println("Name of Anime:"+name);
	if(episodes>2){
	System.out.println("Total Episodes is:"+episodes);
	}return ;
	}



}