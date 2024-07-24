public class Building{
	public String address;
	public int no_of_rooms;
	public int floors;
	
	public Building(){
		this("Brindavanam");
		System.out.println("Default Constructor");
	}
	public Building(String address){
		this("Brindavanam",120,4);
		this.address=address;
		
		System.out.println("Address Name :"+address);
		
		
		
	}
	public Building(String address,int no_of_rooms,int floors){
		this.address=address;
		this.no_of_rooms=no_of_rooms;
		this.floors=floors;
		
		System.out.println("Address Name :"+address);
		System.out.println("Number Of rooms :"+no_of_rooms);
		System.out.println("Number Of floors :"+floors);
		
		
		
	}
}