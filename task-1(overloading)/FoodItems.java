public class FoodItems{
	public static int info(){
	System.out.println("FoodItems Name is:"+"Yeppee");
	return 1;
	}
	public static long info(long buyers){
	System.out.println("Total number of buyrs:"+buyers);
	return buyers;

	}
	public static int info(byte food_rating,double rolls){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls);
	return food_rating;
	}
	public static double info(byte food_rating,double rolls,char grade){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"grade given:"+grade);
	return rolls;
	}
	public static boolean info(byte food_rating,double rolls,boolean good_for_health,char grade){
	System.out.println("Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"good_for_health:"+good_for_health+"grade given:"+grade);
	return good_for_health;
	}
	public static String info(String item_Name,byte food_rating,double rolls,boolean good_for_health,char grade){
	System.out.println("item_Name:"+item_Name+"Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"good_for_health:"+good_for_health+"grade given:"+grade);
	return item_Name;
	}
	public static String info(int price,String item_Name,byte food_rating,double rolls,boolean good_for_health,char grade){
	System.out.println("price are:"+price+"item_Name:"+item_Name+"Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+"good_for_health:"+good_for_health+"grade given:"+grade);
	return item_Name;
	}
	public static int info(String item_Name,int price,byte food_rating,double rolls,short calories,boolean good_for_health,char grade){
	System.out.println("item_Name:"+item_Name+"price are:"+price+"Item_rating:"+food_rating+"Total_size Manufactured/year:"+rolls+" calories are:"+calories+"ggood_for_health:"+good_for_health+"grade is:"+grade);
	return price;
	}
	public static float info(String item_Name,float review,int price,double rolls,short calories,boolean good_for_health,char grade,byte food_rating){
	System.out.println("item_Name:"+item_Name+"review is :"+review+"price are:"+price+"Total_size Manufactured/year:"+rolls+" calories are:"+calories+"good_for_health:"+good_for_health+"grade is:"+grade+"Item_rating:"+food_rating);
	return review;
	}
	public static float info(String item_Name,float review,long buyers,int price,double rolls,short calories,boolean good_for_health,char grade,byte food_rating){
	System.out.println("item_Name:"+item_Name+"review is :"+review+"Totalbuyers"+buyers+" price are:"+price+"Total_size Manufactured/year:"+rolls+" calories are:"+calories+"good_for_health:"+good_for_health+"grade is:"+grade+"Item_rating:"+food_rating);
	return review;
	}
}