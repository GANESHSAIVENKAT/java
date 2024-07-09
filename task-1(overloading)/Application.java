public class Application{
	public static int info(){
	System.out.println("Game Applications");
	return 1;
	}
	public static byte info(byte game_number){
	System.out.println("Total number of games:"+game_number);
	return game_number;

	}
	public static int info(int game_rating,double game_space){
	System.out.println("Game rating:"+game_rating+"Total_space:"+game_space);
	return game_rating;
	}
	public static double info(int game_rating,double game_space,char grade){
	System.out.println("Game rating:"+game_rating+"Total_space:"+game_space+"grade given:"+grade);
	return game_space;
	}
	public static boolean info(int game_rating,double game_space,boolean game_is_good,char grade){
	System.out.println("Game rating:"+game_rating+"Total_space:"+game_space+"game_is_good:"+game_is_good+"grade given:"+grade);
	return game_is_good;
	}
	public static String info(String game_name,int game_rating,double game_space,boolean game_is_good,char grade){
	System.out.println("Game Name:"+game_name+"Game rating:"+game_rating+"Total_space:"+game_space+"game_is_good:"+game_is_good+"grade given:"+grade);
	return game_name;
	}
	public static String info(byte activeplayers,String game_name,int game_rating,double game_space,boolean game_is_good,char grade){
	System.out.println("activeplayers are:"+activeplayers+"Game Name:"+game_name+"Game rating:"+game_rating+"Total_space:"+game_space+"game_is_good:"+game_is_good+"grade given:"+grade);
	return game_name;
	}
	public static short info(String game_name,byte activeplayers,int game_rating,double game_space,short no_player,boolean game_is_good,char grade){
	System.out.println("Game Name:"+game_name+"activeplayers are:"+activeplayers+"Game rating:"+game_rating+"Total_space:"+game_space+" non_activeplayers are:"+no_player+"game_is_good:"+game_is_good+"grade is:"+grade);
	return no_player;
	}
	public static float info(String game_name,float game_review,byte activeplayers,double game_space,short no_player,boolean game_is_good,char grade,int game_rating){
	System.out.println("Game Name:"+game_name+"game_review is :"+game_review+"activeplayers are:"+activeplayers+"Total_space:"+game_space+" non_activeplayers are:"+no_player+"game_is_good:"+game_is_good+"grade is:"+grade+"Game rating:"+game_rating);
	return game_review;
	}
	public static float info(String game_name,float game_review,long users,byte activeplayers,double game_space,short no_player,boolean game_is_good,char grade,int game_rating){
	System.out.println("Game Name:"+game_name+"game_review is :"+game_review+"Totalusers"+users+" activeplayers are:"+activeplayers+"Total_space:"+game_space+" non_activeplayers are:"+no_player+"game_is_good:"+game_is_good+"grade is:"+grade+"Game rating:"+game_rating);
	return game_review;
	}

}