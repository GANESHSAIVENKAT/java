public class Container{
	public String bottle_name;
	public int bottle_total_manufacture;
	public short price;
	public String[] company_names;
	public float ratings;


public Vegitables(){
	
}

	
	
public Vegitables(String bottle_name,int bottle_total_manufacture,short price,String[] company_names,float ratings){
	
	this.bottle_name=bottle_name;
	this.bottle_total_manufacture=bottle_total_manufacture;
	this.price=price;
	this.company_names=company_names;
	this.ratings=ratings;

	System.out.println("App name is "+bottle_name);
	System.out.println("Total apps is "+bottle_total_manufacture);
	System.out.println("Study apps is "+price);
	System.out.println("Space occupied is "+ratings);

	for(int i=0;i<company_names.length;i++){
			
	System.out.println("company_names is "+company_names[i]);
	}

	
}

}