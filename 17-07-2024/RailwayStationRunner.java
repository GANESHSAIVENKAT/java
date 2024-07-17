public class RailwayStationRunner{

public static void main(String... args){

RailwayStation info=new RailwayStation();
System.out.println("RailwayStation");
	String[] stop_names={"Nellore","Gudur","Tirupathi","Banguluru"};
	
RailwayStation data=new RailwayStation("Rajdhani",100000,(short)5,stop_names,45.2f);
RailwayStation info1=new RailwayStation("Shatabdi Express",500000,(short)7,stop_names,50.2f);
RailwayStation collection=new RailwayStation("Garib Rath",60000,(short)10,stop_names,56.2f);
RailwayStation details=new RailwayStation("Duronto Express",300000,(short)1,stop_names,25.2f);



}
}