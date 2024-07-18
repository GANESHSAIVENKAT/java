public class Container{

public String container_Name;
public int price;
public String deleverto_name;
public String location;
public long contact;
public String color;
public int rating;
public String order_person;
public short collections;
public byte noofbottle;

public Container(){
	
	System.out.println("No argument with default constructor");
}
public Container(String container_Name){
	this.container_Name = container_Name;
	System.out.println("The Product is:"+container_Name);
	
}

public Container(String container_Name,int price){
	this.container_Name = container_Name;
	this.price = price;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
}
public Container(String container_Name,int price,String deleverto_name){
		this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
}
public Container(String container_Name,int price,String deleverto_name,String location){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
}
public Container(String container_Name,int price,String deleverto_name,String location,long contact){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
	System.out.println("The Buyer Contact Number is:"+contact);
}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.color = color;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+color);
}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color,int rating){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.color = color;
	this.rating = rating;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+color);
	System.out.println("The  rating  is:"+rating);

}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color,int rating,String order_person){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.color = color;
	this.rating = rating;
	this.order_person = order_person;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+color);
	System.out.println("The  rating  is:"+rating);
	System.out.println("The  Name of order person is:"+order_person);

}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color,int rating,String order_person,short collections){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.color = color;
	this.rating = rating;
	this.order_person = order_person;
	this.collections = collections;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+color);
	System.out.println("The  rating  is:"+rating);
		System.out.println("The  Name of order person is:"+order_person);
		System.out.println("The  collections are:"+collections);
}
public Container(String container_Name,int price,String deleverto_name,String location,long contact,String color,int rating,String order_person,short collections,byte noofbottle){
	this.container_Name = container_Name;
	this.price = price;
	this.deleverto_name = deleverto_name;
	this.location = location;
	this.contact = contact;
	this.color = color;
	this.rating = rating;
	this.order_person = order_person;
	this.collections = collections;
	this.noofbottle = noofbottle;
	System.out.println("The Product is:"+container_Name);
	System.out.println("The  price is:"+price);
	System.out.println("The Name of delever is:"+deleverto_name);
	System.out.println("The Location is:"+location);
	System.out.println("The Buyer contact Number is:"+contact);
	System.out.println("The Productname is:"+color);
	System.out.println("The rating is:"+rating);
		System.out.println("The  Name of order person is:"+order_person);
		System.out.println("The  collections are:"+collections);
		System.out.println("Total Bottle is:"+noofbottle);
		
}
}





