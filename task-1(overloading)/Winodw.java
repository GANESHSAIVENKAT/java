public class Winodw{
	public static int info(){
	System.out.println("Company Name is:"+"plus");
	return 1;
	}
	public static long info(long man_number_year){
	System.out.println("Total number of buyrs:"+man_number_year);
	return man_number_year;

	}
	public static int info(byte company_rating,double size){
	System.out.println("app rating:"+company_rating+"Total_size:"+size);
	return company_rating;
	}
	public static double info(byte company_rating,double size,char grade){
	System.out.println("app rating:"+company_rating+"Total_size:"+size+"grade given:"+grade);
	return size;
	}
	public static boolean info(byte company_rating,double size,boolean window_helps_fresh_air,char grade){
	System.out.println("app rating:"+company_rating+"Total_size:"+size+"window_helps_fresh_air:"+window_helps_fresh_air+"grade given:"+grade);
	return window_helps_fresh_air;
	}
	public static String info(String company_name,byte company_rating,double size,boolean window_helps_fresh_air,char grade){
	System.out.println("company_name:"+company_name+"app rating:"+company_rating+"Total_size:"+size+"window_helps_fresh_air:"+window_helps_fresh_air+"grade given:"+grade);
	return company_name;
	}
	public static String info(int windows_for_house,String company_name,byte company_rating,double size,boolean window_helps_fresh_air,char grade){
	System.out.println("windows_for_house are:"+windows_for_house+"company_name:"+company_name+"app rating:"+company_rating+"Total_size:"+size+"window_helps_fresh_air:"+window_helps_fresh_air+"grade given:"+grade);
	return company_name;
	}
	public static short info(String company_name,int windows_for_house,byte company_rating,double size,short price,boolean window_helps_fresh_air,char grade){
	System.out.println("company_name:"+company_name+"windows_for_house are:"+windows_for_house+"app rating:"+company_rating+"Total_size:"+size+" price are:"+price+"window_helps_fresh_air:"+window_helps_fresh_air+"grade is:"+grade);
	return price;
	}
	public static float info(String company_name,float review,int windows_for_house,double size,short price,boolean window_helps_fresh_air,char grade,byte company_rating){
	System.out.println("company_name:"+company_name+"review is :"+review+"windows_for_house are:"+windows_for_house+"Total_size:"+size+" price are:"+price+"window_helps_fresh_air:"+window_helps_fresh_air+"grade is:"+grade+"app rating:"+company_rating);
	return review;
	}
	public static float info(String company_name,float review,long buyers,int windows_for_house,double size,short price,boolean window_helps_fresh_air,char grade,byte company_rating){
	System.out.println("company_name:"+company_name+"review is :"+review+"Totalbuyers"+buyers+" windows_for_house are:"+windows_for_house+"Total_size:"+size+" price are:"+price+"window_helps_fresh_air:"+window_helps_fresh_air+"grade is:"+grade+"app rating:"+company_rating);
	return review;
	}
}