public class VegitablesDetail{

public String vegitable_Name;
public int start_price;
public String marketname;
public String location;
public long contact;
public String gst;
public int price;
public String ownName;
public short collections;
public byte noofemp;

public VegitablesDetail(){
	
	System.out.println("No argument with default constructor");
}
public VegitablesDetail(String vegitable_Name){
	this.vegitable_Name = vegitable_Name;
	System.out.println("Vegitable Name:"+vegitable_Name);
	
}

public VegitablesDetail(String vegitable_Name,int start_price){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname){
		this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location location is:"+location);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location location is:"+location);
	System.out.println("The Contact Number is:"+contact);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact,String gst){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location location is:"+location);
	System.out.println("The contact Number is:"+contact);
	System.out.println("The GST number is:"+gst);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact,String gst,int price){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location is:"+location);
	System.out.println("The contact Number is:"+contact);
	System.out.println("The GST number is:"+gst);
	System.out.println("The Maximum Price of the vegitable is:"+price);

}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact,String gst,int price,String ownName){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location is:"+location);
	System.out.println("The contact Number is:"+contact);
	System.out.println("The GST number is:"+gst);
	System.out.println("The Maximum Price of the vegitable is:"+price);
		System.out.println("The Market Owner Name was:"+ownName);

}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact,String gst,int price,String ownName,short collections){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location is:"+location);
System.out.println("The contact Number is:"+contact);
	System.out.println("The GST number is:"+gst);
	System.out.println("The Maximum Price of the vegitable is:"+price);
		System.out.println("The Market Owner Name was:"+ownName);
		System.out.println("The Market collections are:"+collections);
}
public VegitablesDetail(String vegitable_Name,int start_price,String marketname,String location,long contact,String gst,int price,String ownName,short collections,byte noofemp){
	this.vegitable_Name = vegitable_Name;
	this.start_price = start_price;
	this.marketname = marketname;
	this.location = location;
	this.contact = contact;
	this.gst = gst;
	this.price = price;
	this.ownName = ownName;
	this.collections = collections;
	this.noofemp = noofemp;
	System.out.println("Vegitable Name:"+vegitable_Name);
	System.out.println("The  Start price is:"+start_price);
	System.out.println("The Market Name is:"+marketname);
	System.out.println("The Location is:"+location);
	System.out.println("The contact Number is:"+contact);
	System.out.println("The GST number is:"+gst);
	System.out.println("The Maximum Price of the vegitable is:"+price);
		System.out.println("The Market Owner Name was:"+ownName);
		System.out.println("The Market collections are:"+collections);
		System.out.println("The employes number is:"+noofemp);
		
}
}