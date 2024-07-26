public class Container{
	public String bottle_name;
    public int bottle_price;
	public long bottle_manufacture_per_Year;
	public short bottle_manufacture_Year;
	public byte bottle_rating;
	
	public static String bottle_name1;
    public static int bottle_price1;
	public static long bottle_manufacture_per_Year1;
	public static short bottle_manufacture_Year1;
	public static byte bottle_rating1;
	


	

public Container(){
}
public Container(String bottle_name,int bottle_price,long bottle_manufacture_per_Year,short bottle_manufacture_Year,byte bottle_rating){
		
		this.bottle_name=bottle_name;
		this.bottle_price=bottle_price;
		this.bottle_manufacture_per_Year=bottle_manufacture_per_Year;
		this.bottle_manufacture_Year=bottle_manufacture_Year;
		this.bottle_rating=bottle_rating;
		System.out.println("Company Name :"+bottle_name);
		System.out.println("Bottle Price :"+bottle_price);
		System.out.println("Production per Year"+bottle_manufacture_per_Year);
		System.out.println("Manufacture Year"+bottle_manufacture_Year);
		System.out.println("Ratings Obtain :"+bottle_rating);
		
		
	}
}