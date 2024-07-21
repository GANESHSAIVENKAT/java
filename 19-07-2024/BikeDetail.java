public class BikeDetail{

public String bike_Name;
public int start_price;
public String showname;
public String location;
public long contact;
public String gst;


public BikeDetail(){
	
	System.out.println("No argument with default constructor");
}
public BikeDetail(String bike_Name){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	
}

public BikeDetail(String bike_Name,int start_price){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	System.out.println("The Bike Start price is:"+start_price);
}
public BikeDetail(String bike_Name,int start_price,String showname){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	System.out.println("The Bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	System.out.println("The Bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location,long contact){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	System.out.println("The Bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room Contact Number is:"+contact);
}
public BikeDetail(String bike_Name,int start_price,String location,String showname,String gst,long contact){
	System.out.println("The Bike present in the show room is:"+bike_Name);
	System.out.println("The Bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
}


}