public class RailwayStation{
	public String train_name;
	public int no_of_passengers;
	public short train_timming;
	public String[] stop_names;
	public float price;


public RailwayStation(){
	
}

	
	
public RailwayStation(String train_name,int no_of_passengers,short train_timming,String[] stop_names,float price){
	
	this.train_name=train_name;
	this.no_of_passengers=no_of_passengers;
	this.train_timming=train_timming;
	this.stop_names=stop_names;
	this.price=price;

	System.out.println("Train Name is "+train_name);
	System.out.println("Total Passengers is "+no_of_passengers);
	System.out.println("Train Timmings "+train_timming);
	System.out.println("Ticket price is "+price);

	for(int i=0;i<stop_names.length;i++){
			
	System.out.println("stop_names is "+stop_names[i]);
	}

	
}

}