public class Gaana{
	public static void detail(){
	String music_Name="Vaaste";
	System.out.println("Song name is:"+music_Name);
	}
	public static void detail(String type, int app_rating){
	System.out.println(" App is:"+type);
	System.out.println("Ratings Gaana:"+app_rating+"stars");		
		
	}
	public static String detail(int spaceoccupied){
		String internal="Songs";
	    System.out.println("Internal space by : "+internal+"Total Space Occupied is:"+spaceoccupied+"mb");
	return "End";		
		
	}
	public static void detail(String language[]){
    for(int index=0;index<language.length;index++){
    System.out.println("List of language are:"+language[index]);
 }
}



}