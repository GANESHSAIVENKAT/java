public class GammingDetail{

public String game_name;
public int pass_price;
public String developed_by;
public String location;
public long total_Players;
public String top_country;


public GammingDetail(){
	
	System.out.println("No argument with default constructor");
}
public GammingDetail(String game_name){
	System.out.println("The Game Name is:"+game_name);
	
}

public GammingDetail(String game_name,int pass_price){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Royal Pass price is:"+pass_price);
}
public GammingDetail(String game_name,int pass_price,String developed_by){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Royal Pass price is:"+pass_price);
	System.out.println("Game Developed By:"+developed_by);
}
public GammingDetail(String game_name,int pass_price,String developed_by,String location){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Royal Pass price is:"+pass_price);
	System.out.println("Game Developed By:"+developed_by);
	System.out.println("The Game Designed in country is:"+location);
}
public GammingDetail(String game_name,int pass_price,String developed_by,String location,long total_Players,String top_country){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Royal Pass price is:"+pass_price);
	System.out.println("Game Developed By:"+developed_by);
	System.out.println("The Game Designed in country is:"+location);
	System.out.println("The Total Players are:"+total_Players);
	System.out.println("The Top Country is:"+top_country);
}



}