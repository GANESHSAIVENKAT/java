public class Shogi{
	public static void gamedetail(){
	String game_Name="Shogi";
	System.out.println("Game name is:"+game_Name);
	}
	public static void gamedetail(String type, int app_player){
	System.out.println(" App is:"+type);
	System.out.println("game is for:"+app_player+"players");		
		
	}
	public static String gamedetail(float spaceoccupied){
		String game="Japanies Chess";
	    System.out.println("Information : "+game+"Total Space Occupied is:"+spaceoccupied+"mb");
	return "End";		
		
	}
	public static void gamedetail(String players[]){
    for(int index=0;index<players.length;index++){
    System.out.println("List of players are:"+players[index]);
 }
}



}