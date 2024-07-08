public class JioMart {
	public static void shopping_details(){
		String product_name="Watch";
		int price=1000;
	System.out.println("product name:"+product_name);
	System.out.println("price is:"+price);	
	}	
	public static void shopping_details(String items, int totalprice){
	System.out.println("product name:"+items);
	System.out.println("price is:"+totalprice);	
	}	
	public static String shopping_details(int price){
    String product = "Flute";
    System.out.println("Product is:"+product+"price is"+"::"+price);
    return "end";
    }
	public static void shopping_details(String name){
	
	System.out.println("You purchased dress was:"+name);
	return ;
	}






}