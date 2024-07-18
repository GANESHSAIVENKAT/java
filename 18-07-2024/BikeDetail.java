public class BikeDetail{

public String bike_Name;
public int start_price;
public String showname;
public String location;
public long contact;
public String gst;
public int price;
public String ownName;
public short collections;
public shot noofemp;

public BikeDetail(){
	
	System.out.println("No argument with default constructor");
}
public BikeDetail(String bike_Name){
	System.out.println("The car present in the show room is:"+bike_Name);
	
}

public BikeDetail(String bike_Name,int start_price){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
}
public BikeDetail(String bike_Name,int start_price,String showname){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location,long contact){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room Contact Number is:"+contact);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location,String gst){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location,String gst,int price){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);

}
public BikeDetail(String bike_Name,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);

}
public BikeDetail(String bike_Name,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections,int noofemp){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);
		System.out.println("The Show Room GST number is:"+collections);
}
public BikeDetail(String bike_Name,int start_price,String showname,String location){
	System.out.println("The car present in the show room is:"+bike_Name);
	System.out.println("The car Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the Car is:"+price);
		System.out.println("The Show Room Owner Name was:"+ownName);
		System.out.println("The Show Room Car collections are:"+collections);
		System.out.println("The Show Room GST number is:"+noofemp);
		
}
}