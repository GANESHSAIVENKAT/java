public class Games{

public String game_name;
public int pass_price;
public String sponser_by;
public String location;
public short total_Players;
public String top_country;


public Games(){
	
	System.out.println("No argument with default constructor");
}
public Games(String game_name){
	System.out.println("The Game Name is:"+game_name);
	
}

public Games(String game_name,int pass_price){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
}
public Games(String game_name,int pass_price,String sponser_by){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
	System.out.println("Game Sponser By:"+sponser_by);
}
public Games(String game_name,int pass_price,String sponser_by,String location){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
	System.out.println("Game Sponser By:"+sponser_by);
	System.out.println("The Game Play in country is:"+location);
}
public Games(String game_name,int pass_price,String sponser_by,String location,short total_Players,String top_country){
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
	System.out.println("Game Sponser By:"+sponser_by);
	System.out.println("The Game Play in country is:"+location);
	System.out.println("The Total Players are:"+total_Players);
	System.out.println("The Match is Between:"+top_country);
}



}