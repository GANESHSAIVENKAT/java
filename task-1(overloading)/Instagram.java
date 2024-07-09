public class Instagram{
	public static int info(){
	System.out.println("Instagram");
	return 1;
	}
	public static long info(long app_number){
	System.out.println("Total number of users:"+app_number);
	return app_number;

	}
	public static int info(byte app_rating,double app_space){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space);
	return app_rating;
	}
	public static double info(byte app_rating,double app_space,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"grade given:"+grade);
	return app_space;
	}
	public static boolean info(byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_is_good;
	}
	public static String info(String app_name,byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("app Name:"+app_name+"app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_name;
	}
	public static String info(int active_users,String app_name,byte app_rating,double app_space,boolean app_is_good,char grade){
	System.out.println("active_users are:"+active_users+"app Name:"+app_name+"app rating:"+app_rating+"Total_space:"+app_space+"app_is_good:"+app_is_good+"grade given:"+grade);
	return app_name;
	}
	public static short info(String app_name,int active_users,byte app_rating,double app_space,short non_users,boolean app_is_good,char grade){
	System.out.println("app Name:"+app_name+"active_users are:"+active_users+"app rating:"+app_rating+"Total_space:"+app_space+" non_users are:"+non_users+"app_is_good:"+app_is_good+"grade is:"+grade);
	return non_users;
	}
	public static float info(String app_name,float game_review,int active_users,double app_space,short non_users,boolean app_is_good,char grade,byte app_rating){
	System.out.println("app Name:"+app_name+"game_review is :"+game_review+"active_users are:"+active_users+"Total_space:"+app_space+" non_users are:"+non_users+"app_is_good:"+app_is_good+"grade is:"+grade+"app rating:"+app_rating);
	return game_review;
	}
	public static float info(String app_name,float app_review,long users,int active_users,double app_space,short non_users,boolean app_is_good,char grade,byte app_rating){
	System.out.println("app Name:"+app_name+"app_review is :"+app_review+"Totalusers"+users+" active_users are:"+active_users+"Total_space:"+app_space+" non_users are:"+non_users+"app_is_good:"+app_is_good+"grade is:"+grade+"app rating:"+app_rating);
	return app_review;
	}

}