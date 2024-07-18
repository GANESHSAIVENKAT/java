public class VehicleDetail{

public String bikeName;
public int start_price;
public String showname;
public String location;
public long contact;
public String gst;
public int price;
public String ownName;
public short collections;
public byte noofemp;

public VehicleDetail(){
	
	System.out.println("No argument with default constructor");
}
public VehicleDetail(String bikeName){
	this.bikeName = bikeName;
	System.out.println("The bike present in the show room is:"+bikeName);
	
}

public VehicleDetail(String bikeName,int start_price){
	this.bikeName = bikeName;
	this.start_price = start_price;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
}
public VehicleDetail(String bikeName,int start_price,String showname){
		this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
}
public VehicleDetail(String bikeName,int start_price,String showname,String location){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room Contact Number is:"+contact);
}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact,String gst){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room location is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact,String gst,int price){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the bike is:"+price);

}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the bike is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);

}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the bike is:"+price);
		System.out.println("The Show Room GST number is:"+ownName);
		System.out.println("The Show Room GST number is:"+collections);
}
public VehicleDetail(String bikeName,int start_price,String showname,String location,long contact,String gst,int price,String ownName,short collections,byte noofemp){
	this.bikeName = bikeName;
	this.start_price = start_price;
	this.showname = showname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	this.noofemp = noofemp;
	System.out.println("The bike present in the show room is:"+bikeName);
	System.out.println("The bike Start price is:"+start_price);
	System.out.println("The Show Room Name is:"+showname);
	System.out.println("The Show Room Name is:"+location);
	System.out.println("The Show Room contact Number is:"+contact);
	System.out.println("The Show Room GST number is:"+gst);
	System.out.println("The Maximum Price of the bike is:"+price);
		System.out.println("The Show Room Owner Name was:"+ownName);
		System.out.println("The Show Room bike collections are:"+collections);
		System.out.println("The Show Room GST number is:"+noofemp);
		
}
}