public class AmazonDetail{

public String product_Name;
public int price;
public String location;
public long contact;
public short rating;


public AmazonDetail(){
	this ("Asus");
	
	System.out.println("No argument with default constructor");
}
public AmazonDetail(String product_Name){
	this ("Asus",25000);
	
	this.product_Name = product_Name;
	System.out.println("The Product is:"+product_Name);
	
}

public AmazonDetail(String product_Name,int price){
	this ("Asus",20000,8309809043L);
	
	this.product_Name = product_Name;
	this.price = price;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
}
public AmazonDetail(String product_Name,int price,long contact){
	this ("Asus",25000,"Brindavanam");
	this.product_Name = product_Name;
	this.price = price;
	this.contact=contact;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Buyer contact Number is:"+contact);
	
}
public AmazonDetail(String product_Name,int price,String location){
	this ("Asus",25000,"Brindavanam",8309809043L);
	this.product_Name = product_Name;
	this.price = price;
	this.location = location;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Location location is:"+location);
}
public AmazonDetail(String product_Name,int price,String location,long contact){
	this ("Asus",25000,"Brindavanam",8309809043L,(short)100);
	this.product_Name = product_Name;
	this.price = price;
	this.location = location;
	this.contact = contact;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Location location is:"+location);
	System.out.println("The Buyer Contact Number is:"+contact);
}


public AmazonDetail(String product_Name,int price,String location,long contact,short rating){
	this.product_Name = product_Name;
	this.price = price;
	this.location = location;
	this.contact = contact;
	this.rating = rating;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The  rating  is:"+rating);

}

}





