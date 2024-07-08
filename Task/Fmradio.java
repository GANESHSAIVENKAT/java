public class Fmradio{
	public static void detail(){
	String radio_Name="RED F.M";
	System.out.println("Radio name is:"+radio_Name);
	}
	public static void detail(String type, int app_rating){
	System.out.println(" App is:"+type);
	System.out.println("Ratings Gaana:"+app_rating+"stars");		
		
	}
	public static String detail(float spaceoccupied){
		String internal="Songs and News";
	    System.out.println("Information Obtain : "+internal+"Total Space Occupied is:"+spaceoccupied+"mb");
	return "End";		
		
	}
	public static void detail(String language[]){
    for(int index=0;index<language.length;index++){
    System.out.println("List of language are:"+language[index]);
 }
}



}