public class Container{

public String container_Name;
public int price;
public String deleverto_name;
public String location;
public long contact;
public String color;


public Container(){
	this ("Milta");
	
	
	System.out.println("No argument with default constructor");
}
public Container(String container_Name){
	this ("Milta",150);
	
	this.container_Name = container_Name;
	System.out.println("The Product is:"+container_Name);
	
}

public Container(String container_Name,int price){
	this ("Milta",150,"Vaasanthi");
	
	this.container_Name = container_Name;
	this.price = price;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
}
public Container(String container_Name,int price,String deleverto_name){
	this ("Milta",150,"Manohar","Molapeta",9353888343L,"Red");
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact=contact;
	this.color=color;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
	System.out.println("The Contact number is:"+contact);
	System.out.println("The Color is:"+color);
}

}





