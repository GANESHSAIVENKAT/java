public class Matchdetail{

public String game_name;
public int pass_price;
public String sponser_by;
public String location;
public short total_Players;
public String top_country;


public Matchdetail(){
	this ("Baseball");

	System.out.println("No argument with default constructor");
}
public Matchdetail(String game_name){
	this ("Football",500);
	this.game_name=game_name;
	System.out.println("The Game Name is:"+game_name);
	
}

public Matchdetail(String game_name,int pass_price){
	this ("Kabaddi",600,"A23 Rummy");
	this.game_name=game_name;
	this.pass_price=pass_price;
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
}
public Matchdetail(String game_name,int pass_price,String sponser_by){
	this ("Cricket",1000,"Krafton","Campa and Atomberg Technologies",(short)11,"India&Pakistan");
	this.game_name=game_name;
	this.pass_price=pass_price;
	this.sponser_by=sponser_by;
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
	System.out.println("Game Sponser By:"+sponser_by);
}
public Matchdetail(String game_name,int pass_price,String sponser_by,String location,short total_Players,String top_country){
	this.game_name=game_name;
	this.pass_price=pass_price;
	this.sponser_by=sponser_by;
	this.location=location;
	this.top_country=top_country;
	System.out.println("The Game Name is:"+game_name);
	System.out.println("The  Entry price is:"+pass_price);
	System.out.println("Game Sponser By:"+sponser_by);
	System.out.println("The Game Play in country is:"+location);
	System.out.println("The Total Players are:"+total_Players);
	System.out.println("The Match is Between:"+top_country);

}




}