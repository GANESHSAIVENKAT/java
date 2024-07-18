public class AmazonDetail{

public String product_Name;
public int price;
public String deleverto_name;
public String location;
public long contact;
public String product1_name;
public int rating;
public String order_person;
public short collections;
public byte noofworkers;

public AmazonDetail(){
	
	System.out.println("No argument with default constructor");
}
public AmazonDetail(String product_Name){
	this.product_Name = product_Name;
	System.out.println("The Product is:"+product_Name);
	
}

public AmazonDetail(String product_Name,int price){
	this.product_Name = product_Name;
	this.price = price;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
}
public AmazonDetail(String product_Name,int price,String deleverto_name){
		this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
	System.out.println("The Buyer Contact Number is:"+contact);
}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact,String product1_name){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.product1_name = product1_name;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+product1_name);
}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact,String product1_name,int rating){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.product1_name = product1_name;
	this.rating = rating;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+product1_name);
	System.out.println("The  rating  is:"+rating);

}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact,String product1_name,int rating,String order_person){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.product1_name = product1_name;
	this.rating = rating;
	this.order_person = order_person;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+product1_name);
	System.out.println("The  rating  is:"+rating);
	System.out.println("The  Name of order person is:"+order_person);

}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact,String product1_name,int rating,String order_person,short collections){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.product1_name = product1_name;
	this.rating = rating;
	this.order_person = order_person;
	this.collections = collections;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+product1_name);
	System.out.println("The  rating  is:"+rating);
		System.out.println("The  Name of order person is:"+order_person);
		System.out.println("The  collections are:"+collections);
}
public AmazonDetail(String product_Name,int price,String deleverto_name,String location,long contact,String product1_name,int rating,String order_person,short collections,byte noofworkers){
	this.product_Name = product_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.product1_name = product1_name;
	this.rating = rating;
	this.order_person = order_person;
	this.collections = collections;
	this.noofworkers = noofworkers;
	System.out.println("The Product is:"+product_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+product1_name);
	System.out.println("The rating is:"+rating);
		System.out.println("The  Name of order person is:"+order_person);
		System.out.println("The  collections are:"+collections);
		System.out.println("Total Workers is:"+noofworkers);
		
}
}





