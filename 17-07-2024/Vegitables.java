public class Vegitables{
	public String vegitable_name;
	public int vegitable_available;
	public short vegitable_price;
	public String[] vegitable_names;
	public float calories_obtain;


public Vegitables(){
	
}

	
	
public Vegitables(String vegitable_name,int vegitable_available,short vegitable_price,String[] vegitable_names,float calories_obtain){
	
	this.vegitable_name=vegitable_name;
	this.vegitable_available=vegitable_available;
	this.vegitable_price=vegitable_price;
	this.vegitable_names=vegitable_names;
	this.calories_obtain=calories_obtain;

	System.out.println("Vegitable name is "+vegitable_name);
	System.out.println("Total vegitables available is "+vegitable_available);
	System.out.println("Price is "+vegitable_price);
	System.out.println("Calaories obtain is "+calories_obtain);

	for(int i=0;i<vegitable_names.length;i++){
			
	System.out.println("vegitable_names is "+vegitable_names[i]);
	}

	
}

}